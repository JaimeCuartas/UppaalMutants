package Parser.Main;
import Parser.Antlr.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Mutation {
    public static void main(String[] args) throws Exception {

        try{

            String inputFile = null;
            if ( args.length>0 ) {
                System.out.println("Enter here with " + args[0]);
                inputFile = args[0];
            }
            InputStream is = System.in;
            if ( inputFile!=null ) {
                System.out.println("Use input to the system input  :D");
                is = new FileInputStream(inputFile);
            }

            CharStream input = CharStreams.fromStream(is);
            UppaalLexer lexer = new UppaalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            UppaalParser parser = new UppaalParser(tokens); // pass column number!
            parser.setBuildParseTree(false); // don't waste time bulding a tree
            parser.model(); // parse
            /**CharStream input = CharStreams.fromStream(is);
// create a lexer that feeds off of input CharStream
            UppaalLexer lexer = new UppaalLexer(input);
// create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
            UppaalParser parser = new UppaalParser(tokens);
            ParseTree tree = parser.model(); // begin parsing at init rule
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
             */
        }catch (IOException e){
            e.printStackTrace();
        }
    }




}
