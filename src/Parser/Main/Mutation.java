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

//////////////////////////////////////////////////////////////////////
import com.uppaal.engine.CannotEvaluateException;
import com.uppaal.engine.Engine;
import com.uppaal.engine.EngineException;
import com.uppaal.engine.EngineStub;
import com.uppaal.engine.Problem;
import com.uppaal.engine.QueryFeedback;
import com.uppaal.engine.QueryResult;
import com.uppaal.model.io2.XMLWriter;
import com.uppaal.model.core2.Data2D;
import com.uppaal.model.core2.DataSet2D;
import com.uppaal.model.core2.Document;
import com.uppaal.model.core2.Edge;
import com.uppaal.model.core2.Location;
import com.uppaal.model.core2.Property;
import com.uppaal.model.core2.PrototypeDocument;
import com.uppaal.model.core2.Query;
import com.uppaal.model.core2.QueryData;
import com.uppaal.model.core2.Template;
import com.uppaal.model.system.SystemEdge;
import com.uppaal.model.system.SystemLocation;
import com.uppaal.model.system.symbolic.SymbolicState;
import com.uppaal.model.system.symbolic.SymbolicTransition;
import com.uppaal.model.system.symbolic.SymbolicTrace;
import com.uppaal.model.system.concrete.ConcreteTrace;
import com.uppaal.model.system.UppaalSystem;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.geom.Point2D;

//////////////////////////////////////////////////////////////////////


public class Mutation {


    public static Engine connectToEngine() throws EngineException, IOException
    {

        String os = System.getProperty("os.name");
        String here = System.getProperty("user.dir");
        String path = null;
        if ("Linux".equals(os)) {
            path = here+"/bin-Linux/server";
        } else {
            path = "C:\\Users\\57310\\Desktop\\uppaal-4.1.24\\bin-Windows\\server.exe";
        }
        Engine engine = new Engine();
        engine.setServerPath(path);
        engine.connect();
        return engine;
    }

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
/*
            System.out.println( "El número de mutaciones Comparaciones Guard es: "+ parser.getNum() );

            System.out.println( "El número de mutaciones TMI es: "+ parser.getTmi().size() );

            System.out.println(parser.getChannelEnv());
            System.out.println("Globales"+parser.getChannelEnv().get("Global"));

            System.out.println("Globales "+parser.getChannelEnv().get("Global").isEmpty());

*/

            //System.out.println(parser.getTransitionsTad());
            /*
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new UppaalListener(1), tree);


            System.out.println(); // print a \n after translation

*/
            //System.out.println(tree.toStringTree(parser));
            //System.out.println(System.getProperty("user.dir"));
            File myFile = new File("C:\\Users\\57310\\Documents\\Github\\XMLGrammar\\src\\Parser\\Test\\Mutaciones"+System.currentTimeMillis());

            if(!myFile.mkdirs()){
                return;
            }
/*
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

 */

            
            System.out.println("Este es el cxl:"+parser.getNumCxl());
            for(int i=1; i<=parser.getNumCxl(); i++){
                int idCxl = i;
                new Thread(()->{

                    UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), idCxl, -1);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "cxl"+ idCxl +".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();

            }
            System.out.println("Este es el cxs:"+parser.getNumCxs());
            for(int i=1; i<=parser.getNumCxs(); i++){
                int idCxs = i;
                new Thread(()->{

                    UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), -1, idCxs);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "cxs"+ idCxs +".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();

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
