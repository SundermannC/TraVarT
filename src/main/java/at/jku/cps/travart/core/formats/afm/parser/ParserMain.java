package at.jku.cps.travart.core.formats.afm.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

import at.jku.cps.travart.core.formats.afm.parser.AFMParser.Feature_modelContext;

public class ParserMain {

    /** Platform dependent end-of-line marker */
    public static final String Eol = System.lineSeparator();
    /** The literal indent char(s) used for pretty-printing */
    public static final String Indents = "  ";
    private static int level;

    public static void main(String[] args) throws IOException {

        AFMLexer lexer = new AFMLexer(cleanInput("example_input/CVE-large.afm"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AFMParser parser = new AFMParser(tokens);

        AFMVisitorImpl visitor = new AFMVisitorImpl();

        
        ParseTree tree = parser.feature_model(); // begin parsing at rule 'r'
        visitor.visitFeature_model((Feature_modelContext) tree);
        visitor.printModel();
        // System.out.println(toPrettyTree(tree, Arrays.asList(parser.getRuleNames())));
    }

    public static CharStream cleanInput(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String content = "";
        String line = br.readLine();
        while (line != null) {
            if (!line.startsWith("#")) {
                content += line;
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

    private static String process(final Tree t, final List<String> ruleNames) {
        if (t.getChildCount() == 0) return Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
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
}
