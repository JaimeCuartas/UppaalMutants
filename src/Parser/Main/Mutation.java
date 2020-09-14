package Parser.Main;
import Parser.Antlr.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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

            UppaalParser parser = new UppaalParser(tokens);
            parser.setBuildParseTree(false); // don't waste time bulding a tree
            parser.model(); // parse
            System.out.println( "El número de mutaciones es: "+ parser.getNum() );

            System.out.println("Vamos a crear el listener");
            parser.reset();
            parser.setBuildParseTree(true);
            ParseTree tree = parser.model();
            /*
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new UppaalListener(1), tree);

            System.out.println(); // print a \n after translation
            */

            System.out.println(tree.toStringTree(parser));
            UppaalVisitor eval = new UppaalVisitor(1);
            eval.visit(tree);

        }catch (IOException e){

            e.printStackTrace();
        }
    }




}
