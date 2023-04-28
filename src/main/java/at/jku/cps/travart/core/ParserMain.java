package at.jku.cps.travart.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

import at.jku.cps.travart.core.formats.afm.parser.AFMLexer;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser;
import at.jku.cps.travart.core.formats.afm.parser.AFMVisitorImpl;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.Feature_modelContext;
import de.ovgu.featureide.fm.attributes.FMAttributesLibrary;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.dimacs.DIMACSFormat;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import de.ovgu.featureide.fm.core.io.sxfm.SXFMFormat;
import de.ovgu.featureide.fm.core.io.uvl.UVLFeatureModelFormat;
import de.vill.model.FeatureModel;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ParserMain {

    /** Platform dependent end-of-line marker */
    public static final String Eol = System.lineSeparator();
    /** The literal indent char(s) used for pretty-printing */
    public static final String Indents = "  ";
    private static int level;

    private static final String AFM_EXTENSION = "afm";
    private static final String UVL_EXTENSION = "uvl";
    private static final String DIMACS_EXTENSION = "dimacs";
    private static final String ZIP_EXTENSION = "zip";

    public static void main(String[] args) throws IOException {
        FMCoreLibrary.getInstance().install();
        FMAttributesLibrary.getInstance().install();

        PrintStream out = new PrintStream(
                new FileOutputStream("log.txt", false), true);
        System.setOut(out);
        System.setErr(out);
        translateFeatureModels();
        // filterAfm();

    }

    private static void deleteDirectoryStream(String path) throws IOException {
        if (new File(path).exists()) {
            Files.walk(Paths.get(path))
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        }
    }

    private static void translateFeatureModels() throws IOException {
        String featureModelDir = "../feature-model-benchmark/feature_models/dsads/";

        List<File> featureModelFiles = new ArrayList<>();
        listf(featureModelDir, featureModelFiles); // Fill list bah
        int gcCounter = 0;
        for (File file : featureModelFiles) {
            deleteDirectoryStream("temp");
            System.out.println("Handling" + file.getName());
            handleFile(file.getAbsolutePath());
            gcCounter++;
            if (gcCounter >= 1) {
                System.gc();
                gcCounter = 0;
            }
        }
    }

    private static void filterAfm() throws IOException {
        String cveDir = "../feature-model-benchmark/feature_models/original/cve";

        Set<String> cveFiles = getListOfFilesInDir(cveDir);

        int overallFiles = cveFiles.size();
        int counterLarge = 0;

        for (String path : cveFiles) {
            System.out.println("----------------- Working on " + path + "-----------------");
            AFMLexer lexer = new AFMLexer(cleanInput(path));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            AFMParser parser = new AFMParser(tokens);

            AFMVisitorImpl visitor = new AFMVisitorImpl();

            ParseTree tree = parser.feature_model(); // begin parsing at rule 'r'
            visitor.visitFeature_model((Feature_modelContext) tree);

            if (visitor.getModel().getFeatureMap().keySet().size() >= 100) {
                counterLarge++;
                Files.copy(Paths.get(path), Paths.get("afm/cve/" + new File(path).getName()),
                        StandardCopyOption.REPLACE_EXISTING);
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("uvl/cve/" + new File(path).getName().replaceFirst("[.][^.]+$", ".uvl")));
                writer.write(visitor.getModel().toString());
                writer.close();
            }
        }

        System.out.println("Copied " + counterLarge + " of " + overallFiles);
    }

    public static CharStream cleanInput(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String content = "";
        String line = br.readLine();
        while (line != null) {
            if (!line.startsWith("#")) {
                content += line + "\n";
            }
            line = br.readLine();
        }
        br.close();
        return CharStreams.fromString(content);
    }

    public static String toPrettyTree(final Tree t, final List<String> ruleNames) {
        level = 0;
        return process(t, ruleNames).replaceAll("(?m)^\\s+$", "").replaceAll("\\r?\\n\\r?\\n", Eol);
    }

    private static void handleFile(String path) throws IOException {
        handleFile(path, path, false);
    }

    private static void handleFile(String path, String originalPath, boolean zipResult) throws IOException {
        if (getFileExtension(path).equals(ZIP_EXTENSION)) {
            ZipFile zipFile = new ZipFile(path);
            try {
                zipFile.extractAll("temp");
                Set<String> unzippedFiles = getListOfFilesInDir("temp");
                handleFile(unzippedFiles.iterator().next(), path, false);
                zipFile.close();
            } catch (IOException i) {
                System.out.println("Failed to unzip " + path + ". File is skipped");
            }
            return;
        }

        String subPath = originalPath.split("/original/")[1];
        String subDirectoryUvlPath = "uvl" + File.separator + subPath.substring(0, subPath.lastIndexOf("/"));
        String subDirectoryDimacsPath = "dimacs" + File.separator + subPath.substring(0, subPath.lastIndexOf("/"));
        String extension = getFileExtension(path);
        String originalExtension = getFileExtension(originalPath);
        Files.createDirectories(Paths.get(subDirectoryUvlPath));
        Files.createDirectories(Paths.get(subDirectoryDimacsPath));

        String uvlPath = "uvl" + File.separator + subPath.replace("." + originalExtension, ".uvl");
        String dimacsPath = "dimacs" + File.separator + subPath.replace("." + originalExtension, ".dimacs");
        if (extension.equals(AFM_EXTENSION)) {
            try {
                FeatureModel model = parseAFMModel(path);
                writeUvlModel(model, uvlPath);
                writeDimacs(loadFeatureModelWithFeatureIDE(uvlPath), dimacsPath);
            } catch (IOException e) {
                System.out.println("Failed to parse " + path + ". File is skipped");
            }
        } else {
            boolean skipUvlExport = extension.equals(UVL_EXTENSION);
            boolean skipDimacsExport = extension.equals(DIMACS_EXTENSION);

            IFeatureModel model = loadFeatureModelWithFeatureIDE(path);
            if (model == null) {
                model = loadSXFModel(path);
                if (model == null) {
                    System.out.println("Failed to parse " + path + " with FeatureIDE. File is skipped");
                    return;
                }
            }
            if (!skipUvlExport) {
                writeUvlModel(model, uvlPath.replace(".zip", ""));
                if (zipResult) {
                    try {
                        ZipFile zipFile = new ZipFile(uvlPath + (uvlPath.endsWith(".zip") ? "" : ".zip"));
                        zipFile.addFile(uvlPath.replace(".zip", ""));
                        zipFile.close();
                        new File(uvlPath).delete();
                    } catch (ZipException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (!skipDimacsExport) {
                writeDimacs(model, dimacsPath.replace(".zip", ""));
                if (zipResult) {
                    try {
                        ZipFile zipFile = new ZipFile(dimacsPath + ".zip");
                        zipFile.addFile(dimacsPath.replace(".zip", ""));
                        zipFile.close();
                        new File(dimacsPath).delete();
                    } catch (ZipException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static FeatureModel parseAFMModel(String path) throws IOException {

        AFMLexer lexer = new AFMLexer(cleanInput(path));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AFMParser parser = new AFMParser(tokens);

        AFMVisitorImpl visitor = new AFMVisitorImpl();

        ParseTree tree = parser.feature_model(); // begin parsing at rule 'r'
        visitor.visitFeature_model((Feature_modelContext) tree);

        return visitor.getModel();
    }

    public static void writeUvlModel(FeatureModel model, String path) {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(path));
            writer.write(model.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Supported file formats: DIMACS, xml, uvl, SXFM,
     * 
     * @param path
     * @return
     */
    public static IFeatureModel loadFeatureModelWithFeatureIDE(String path) {
        return FeatureModelManager.load(Paths.get(path));
    }

    public static IFeatureModel loadSXFModel(String path) {
        SXFMFormat format = new SXFMFormat();
        IFeatureModel featureModel = DefaultFeatureModelFactory.getInstance().create();
        try {
            format.getInstance().read(featureModel, Files.readString(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return featureModel;
    }

    public static void writeUvlModel(IFeatureModel inputModel, String path) {
        FeatureModelManager.save(inputModel, Paths.get(path), new UVLFeatureModelFormat());
    }

    public static void writeDimacs(IFeatureModel inputModel, String path) {
        FeatureModelManager.save(inputModel, Paths.get(path), new DIMACSFormat());
    }

    private static String getFileExtension(String path) {
        int lastIndexOf = path.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return path.substring(lastIndexOf + 1);
    }

    private static String process(final Tree t, final List<String> ruleNames) {
        if (t.getChildCount() == 0)
            return Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
        StringBuilder sb = new StringBuilder();
        sb.append(lead(level));
        level++;
        String s = Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
        sb.append(s + ' ');
        for (int i = 0; i < t.getChildCount(); i++) {
            sb.append(process(t.getChild(i), ruleNames));
        }
        level--;
        sb.append(lead(level));
        return sb.toString();
    }

    private static String lead(int level) {
        StringBuilder sb = new StringBuilder();
        if (level > 0) {
            sb.append(Eol);
            for (int cnt = 0; cnt < level; cnt++) {
                sb.append(Indents);
            }
        }
        return sb.toString();
    }

    public static void listf(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if (fList != null)
            for (File file : fList) {
                if (file.isFile()) {
                    if (file.getName().contains(".json")) {
                        continue;
                    }
                    files.add(file);
                } else if (file.isDirectory()) {
                    listf(file.getAbsolutePath(), files);
                }
            }
    }

    private static Set<String> getListOfFilesInDir(String dir) {
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .filter(file -> !file.getName().contains(".json"))
                .map(File::getPath)
                .collect(Collectors.toSet());
    }
}
