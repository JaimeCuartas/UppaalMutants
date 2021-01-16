package Parser.Main;
import Parser.Antlr.*;
import Parser.Mutation.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////
import com.uppaal.engine.Engine;
import com.uppaal.engine.EngineException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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

        try {
            long startTime = System.nanoTime();


            String inputFile = null;
            String propertiesFile = "";
            if (args.length > 0) {
                inputFile = args[0];
                if (args.length > 1) {
                    propertiesFile = args[1];
                }
            } else {
                return;
            }

            CharStream input = CharStreams.fromFileName(inputFile);
            UppaalLexer lexer = new UppaalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            UppaalParser parser = new UppaalParser(tokens, 0);

            ParseTree tree = parser.model();

            String os = System.getProperty("os.name");
            String here = System.getProperty("user.dir");
            String idFile = Long.toString(System.currentTimeMillis());
            String path = null;

            if ("Linux".equals(os)) {
                path = here.concat("/Mutation"+inputFile.split("\\\\")[inputFile.split("\\\\").length-1].split("\\.")[0]).concat(idFile);
            } else {
                path = here.concat("\\Mutation"+inputFile.split("\\\\")[inputFile.split("\\\\").length-1].split("\\.")[0]).concat(idFile);
            }

            File myFile = new File(path);

            if (!myFile.mkdirs()) {
                return;
            }

            ArrayList<Thread> threads = new ArrayList<>();

            for (int i : parser.getTmi()) {
                threads.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(-1, i, "", "", "", "", "", parser.getClockEnv(), -1, -1, -1);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "tmi" + i + ".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));
            }

            int tmiNumber = threads.size();
            /*
            for (String template : parser.getTransitionsTad().keySet()) {
                String outputEnv = "";
                if (!parser.getChannelEnv().get("Global").isEmpty()) {
                    outputEnv = "Global";
                } else if (!parser.getChannelEnv().get(template).isEmpty()) {
                    outputEnv = template;
                } else {
                    continue;
                }
                for (String source : parser.getTransitionsTad().get(template).keySet()) {
                    HashSet<String> targets = parser.getTransitionsTad().get(template).get(source);

                    if (targets.isEmpty()) {
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

                    new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, -1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(myFile, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(tree));
                            myWriter.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

                }
            }*/

            for (String template : parser.getTransitionsTad().keySet()) {
                String outputEnv = "";
                if (!parser.getChannelEnv().get("Global").isEmpty()) {
                    outputEnv = "Global";
                } else if (!parser.getChannelEnv().get(template).isEmpty()) {
                    outputEnv = template;
                } else {
                    continue;
                }
                for (String source : parser.getTransitionsTad().get(template).keySet()) {
                    HashSet<String> targets = parser.getTransitionsTad().get(template).get(source);

                    if (targets.isEmpty()) {
                        continue;
                    }

                    Iterator<String> iterTargets = targets.iterator();

                    for (int i = 0; i < targets.size(); i++) {
                        //Choose target
                        String target = iterTargets.next();
                        int chanPicked = 0;
                        String chan = parser.getChannelEnv().get(outputEnv).get(chanPicked).getName();
                        int dimensions = parser.getChannelEnv().get(outputEnv).get(chanPicked).getDimension();
                        String output = chan.concat("[0]".repeat(dimensions)).concat("!");
                        threads.add(new Thread(() -> {
                            UppaalVisitor eval = new UppaalVisitor(-1, -1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1);
                            FileWriter myWriter = null;
                            try {
                                myWriter = new FileWriter(new File(myFile, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                                myWriter.write(eval.visit(tree));
                                myWriter.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }));
                    }


                }
            }

            int tadNumber = threads.size()-tmiNumber;

            for (String template : parser.getLocationsSmi().keySet()) {
                for (String idLocation : parser.getLocationsSmi().get(template)) {
                    threads.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(myFile, "smi".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }));
                }
            }

            int smiNumber = threads.size()-tadNumber-tmiNumber;
            
            System.out.println("Este es el cxl:"+parser.getNumCxl());
            for(int i=1; i<=parser.getNumCxl(); i++){
                int idCxl = i;
                threads.add(new Thread(()->{
                    UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), idCxl, -1, -1);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "cxl"+ idCxl +".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));

            }

            int cxlNumber = threads.size()-smiNumber-tadNumber-tmiNumber;

            System.out.println("Este es el cxs:"+parser.getNumCxs());
            for(int i=1; i<=parser.getNumCxs(); i++){
                int idCxs = i;
                threads.add(new Thread(()->{
                    UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), -1, idCxs, -1);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "cxs"+ idCxs +".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));
            }

            int cxsNumber = threads.size()-cxlNumber-smiNumber-tadNumber-tmiNumber;

            System.out.println("Este es el ccn:"+parser.getNumCcn());
            for(int i=1; i<=parser.getNumCcn(); i++){
                int idCcn = i;
                threads.add(new Thread(()->{
                    UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), -1, -1, idCcn);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(myFile, "ccn"+ idCcn +".xml"));
                        myWriter.write(eval.visit(tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));
            }

            int ccnNumber = threads.size()-cxlNumber-cxsNumber-smiNumber-tadNumber-tmiNumber;

            for (Thread mutantThread: threads){
                mutantThread.start();
            }

            for (Thread mutantThread: threads){
                mutantThread.join();
            }

            String[] mutantFiles = myFile.list();
            assert mutantFiles != null;

            int alive = 0;
            int dead = 0;
            for (String mutantFile : mutantFiles) {

                String mutantPath = "";

                if ("Linux".equals(os)) {
                    mutantPath = path.concat("/").concat(mutantFile);
                } else {
                    mutantPath = path.concat("\\").concat(mutantFile);
                }


                Process p = Runtime.getRuntime().exec("C:\\Users\\57310\\Desktop\\uppaal-4.1.24\\bin-Windows\\verifyta.exe -q ".concat(mutantPath).concat(" ").concat(propertiesFile));

                p.waitFor();
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = "";
                line = reader.readLine();
                boolean flag = false;
                do {
                    if (line == null || line.contains("NOT satisfied")) {
                        dead++;
                        flag = true;
                        break;
                    }
                } while ((line = reader.readLine()) != null);

                if (!flag) {
                    System.out.println("C:\\Users\\57310\\Desktop\\uppaal-4.1.24\\bin-Windows\\verifyta.exe -q ".concat(mutantPath).concat(" ").concat(propertiesFile));
                    alive++;
                }

            }



            System.out.println("total de mutantes: " + mutantFiles.length);
            System.out.println("Total de muertos: " + dead);
            System.out.println("Total de vivos: " + alive);

            long endTime = System.nanoTime();

            long duration = (endTime - startTime);
            System.out.println(duration);


        }catch (IOException e){

            e.printStackTrace();
        }
    }




}
