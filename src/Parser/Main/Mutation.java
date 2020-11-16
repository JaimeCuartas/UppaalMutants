package Parser.Main;
import Parser.Antlr.*;
import com.uppaal.model.core2.Template;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.uppaal.engine.Parser;

import java.io.*;
import java.util.*;

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

            UppaalParser parser = new UppaalParser(tokens, 0);
            //parser.setBuildParseTree(false); // don't waste time bulding a tree
            //parser.model(); // parse

            //parser.reset();
            //parser.setBuildParseTree(true);
            ParseTree tree = parser.model();

            System.out.println( "El número de mutaciones Comparaciones Guard es: "+ parser.getNum() );

            System.out.println( "El número de mutaciones TMI es: "+ parser.getTmi().size() );

            System.out.println(parser.getChannelEnv());
            System.out.println("Globales"+parser.getChannelEnv().get("Global"));

            System.out.println("Globales "+parser.getChannelEnv().get("Global").isEmpty());



            //System.out.println(parser.getTransitionsTad());
            /*
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new UppaalListener(1), tree);


            System.out.println(); // print a \n after translation

*/          System.out.println(System.getProperty("user.dir"));
            //System.out.println(tree.toStringTree(parser));

            File myFile = new File("C:\\Users\\57310\\Documents\\Github\\XMLGrammar\\src\\Parser\\Test\\Mutaciones"+System.currentTimeMillis());

            if(!myFile.mkdirs()){
                return;
            }

            for(int i=1; i<=parser.getNum(); i++){
                int idMutant = i;
                new Thread(()->{
                    UppaalVisitor eval = new UppaalVisitor(idMutant, -1, "", "", "", "", "");
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


            for(int i: parser.getTmi()){
                new Thread(()->{

                    UppaalVisitor eval = new UppaalVisitor(-1, i, "", "", "", "", "");
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "tmi"+ i +".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();

            }

            for(String template: parser.getTransitionsTad().keySet()){
                String outputEnv = "";
                if(!parser.getChannelEnv().get("Global").isEmpty()){
                    outputEnv = "Global";
                }
                else if(!parser.getChannelEnv().get(template).isEmpty()){
                    outputEnv = template;
                }
                else{
                    continue;
                }
                for(String source: parser.getTransitionsTad().get(template).keySet()){
                    HashSet<String> targets = parser.getTransitionsTad().get(template).get(source);

                    if(targets.isEmpty()){
                        continue;
                    }

                    Iterator<String> iterTargets = targets.iterator();
                    int randomTarget = new Random().nextInt(targets.size());
                    for (int i = 0; i < randomTarget; i++) {
                        iterTargets.next();
                    }

                    String target = iterTargets.next();

                    int chanPicked = new Random().nextInt(parser.getChannelEnv().get(outputEnv).size());
                    String chan = parser.getChannelEnv().get(outputEnv).get(chanPicked)[0];
                    String dimensions = parser.getChannelEnv().get(outputEnv).get(chanPicked)[1];
                    String output = chan.concat("[0]".repeat(Integer.parseInt(dimensions))).concat("!");

                    new Thread(()->{
                        UppaalVisitor eval = new UppaalVisitor(-1, -1, template, source, target, output, "");
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(myFile, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(tree));
                            myWriter.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();

                }
            }

            for(String template: parser.getLocationsSmi().keySet()){
                for(String idLocation: parser.getLocationsSmi().get(template)){
                    new Thread(()->{
                        UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", idLocation);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(myFile, "smi".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(tree));
                            myWriter.close();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();
                }
            }


            //System.out.println(parser.getLocationsSmi());
/*
            UppaalVisitor eval = new UppaalVisitor(3);
            System.out.println(eval.visit(tree));
*/
        }catch (IOException e){

            e.printStackTrace();
        }
    }




}
