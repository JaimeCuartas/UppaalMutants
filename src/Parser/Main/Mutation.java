package Parser.Main;
import Parser.Antlr.*;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Mutation {
    public static void main(String[] args) throws Exception {

        try{

            String inputFile = null;
            if ( args.length>0 ) {
                inputFile = args[0];
            }
            /*
            InputStream is = System.in;
            if ( inputFile!=null ) {
                is = new FileInputStream(inputFile);
            }

            CharStream input = CharStreams.fromStream(is);*/
            CharStream input = CharStreams.fromFileName(inputFile);
            UppaalLexer lexer = new UppaalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            UppaalParser parser = new UppaalParser(tokens);
            //parser.setBuildParseTree(false); // don't waste time bulding a tree
            //parser.model(); // parse

            //parser.reset();
            //parser.setBuildParseTree(true);
            ParseTree tree = parser.model();

            System.out.println( "El número de mutaciones es: "+ parser.getNum() );

            /*
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new UppaalListener(1), tree);


            System.out.println(); // print a \n after translation

*/
            System.out.println(tree.toStringTree(parser));

            File myFile = new File("C:\\Users\\57310\\Documents\\Github\\XMLGrammar\\src\\Parser\\Test\\Mutaciones"+System.currentTimeMillis());
            myFile.mkdirs();

            for(int i=1; i<=parser.getNum(); i++){
                int idMutant = i;
                new Thread(()->{
                    UppaalVisitor eval = new UppaalVisitor(idMutant);

                    FileWriter myWriter = null;

                    try {

                        myWriter = new FileWriter(new File(myFile, Integer.toString(idMutant)+".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
/*
            UppaalVisitor eval = new UppaalVisitor(3);
            System.out.println(eval.visit(tree));
*/
        }catch (IOException e){

            e.printStackTrace();
        }
    }




}
