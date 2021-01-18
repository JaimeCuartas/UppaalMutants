package Parser.Mutation;

import Parser.Antlr.UppaalLexer;
import Parser.Antlr.UppaalParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MutantController {

    private boolean tmi;
    private boolean tad;
    private boolean smi;
    private boolean cxl;
    private boolean cxs;
    private boolean ccn;
    private ArrayList<Thread> threadsTmi;
    private ArrayList<Thread> threadsTad;
    private ArrayList<Thread> threadsSmi;
    private ArrayList<Thread> threadsCxl;
    private ArrayList<Thread> threadsCxs;
    private ArrayList<Thread> threadsCcn;
    private UppaalParser parser;
    private ParseTree tree;

    public MutantController(
            String modelFile,
            boolean tmi, boolean tad, boolean smi,
            boolean cxl, boolean cxs, boolean ccn) throws IOException {

        this.tmi = tmi;
        this.tad = tad;
        this.smi = smi;
        this.cxl = cxl;
        this.cxs = cxs;
        this.ccn = ccn;

        this.threadsTmi = new ArrayList<>();
        this.threadsTad = new ArrayList<>();
        this.threadsSmi = new ArrayList<>();
        this.threadsCxl = new ArrayList<>();
        this.threadsCxs = new ArrayList<>();
        this.threadsCcn = new ArrayList<>();

        CharStream input = CharStreams.fromFileName(modelFile);
        UppaalLexer lexer = new UppaalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        this.parser = new UppaalParser(tokens);
        this.tree = this.parser.model();
    }

    public String verifyMutants(String pathIn, String pathVerifyTa, String pathQuery) throws IOException, InterruptedException {
        String log = "";

        log = log.concat(Integer.toString(killedMutants(this.threadsTmi, pathIn, pathVerifyTa, pathQuery)));
        log = log.concat("\n");
        log = log.concat(Integer.toString(killedMutants(this.threadsTad, pathIn, pathVerifyTa, pathQuery)));
        log = log.concat("\n");
        log = log.concat(Integer.toString(killedMutants(this.threadsSmi, pathIn, pathVerifyTa, pathQuery)));
        log = log.concat("\n");
        log = log.concat(Integer.toString(killedMutants(this.threadsCxl, pathIn, pathVerifyTa, pathQuery)));
        log = log.concat("\n");
        log = log.concat(Integer.toString(killedMutants(this.threadsCxs, pathIn, pathVerifyTa, pathQuery)));
        log = log.concat("\n");
        log = log.concat(Integer.toString(killedMutants(this.threadsCcn, pathIn, pathVerifyTa, pathQuery)));
        log = log.concat("\n");
        return log;
    }

    public int killedMutants(ArrayList<Thread> operatorThreads, String pathIn, String pathVerifyTa, String pathQuery) throws IOException, InterruptedException {
        String mutantPath = "";
        int dead = 0;
        for(String mutantTmi: operatorThreads.stream().map(Thread::getName).toArray(String[]::new)){
            mutantPath = pathIn + File.separator + mutantTmi;
            Process p = Runtime.getRuntime().exec(pathVerifyTa.concat(" -q ").concat(mutantPath).concat(" ").concat(pathQuery));
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();

            if(line == null){
                dead++;
                continue;
            }

            while ((line = reader.readLine())!=null){
                if (line.contains("NOT satisfied") || line.contains("MAY be satisfied")) {
                    dead++;
                    break;
                }
            }
        }
        return dead;
    }

    /**
     * Run operator generating mutants in fileIn path
     */
    public void runOperators(){
        this.runTmi();
        this.runTad();
        this.runSmi();
        this.runCxl();
        this.runCxs();
        this.runCcn();
    }

    public void runTmi(){
        for (Thread mutantThread: this.threadsTmi){
            mutantThread.start();
        }
    }
    public void runTad(){
        for (Thread mutantThread: this.threadsTad){
            mutantThread.start();
        }
    }
    public void runSmi(){
        for (Thread mutantThread: this.threadsSmi){
            mutantThread.start();
        }
    }
    public void runCxl(){
        for (Thread mutantThread: this.threadsCxl){
            mutantThread.start();
        }
    }
    public void runCxs(){
        for (Thread mutantThread: this.threadsCxs){
            mutantThread.start();
        }
    }
    public void runCcn(){
        for (Thread mutantThread: this.threadsCcn){
            mutantThread.start();
        }
    }

    /**
     * Join functions to wait until every mutant is generated
     * @throws InterruptedException
     */
    public void joinOperators() throws InterruptedException {
        this.joinTmi();
        this.joinTad();
        this.joinSmi();
        this.joinCxl();
        this.joinCxs();
        this.joinCcn();
    }

    public void joinTmi() throws InterruptedException {
        for (Thread mutantThread: this.threadsTmi){
            mutantThread.join();
        }
    }
    public void joinTad() throws InterruptedException {
        for (Thread mutantThread: this.threadsTad){
            mutantThread.join();
        }
    }
    public void joinSmi() throws InterruptedException {
        for (Thread mutantThread: this.threadsSmi){
            mutantThread.join();
        }
    }
    public void joinCxl() throws InterruptedException {
        for (Thread mutantThread: this.threadsCxl){
            mutantThread.join();
        }
    }
    public void joinCxs() throws InterruptedException {
        for (Thread mutantThread: this.threadsCxs){
            mutantThread.join();
        }
    }
    public void joinCcn() throws InterruptedException {
        for (Thread mutantThread: this.threadsCcn){
            mutantThread.join();
        }
    }

    /**
     * Create threads to generate operators (but does not start them)
     * @param fileIn
     */
    public void prepareOperators(File fileIn){
        if(this.tmi){
            this.tmiOperator(fileIn);
        }
        if(this.tad){
            this.tadOperator(fileIn);
        }
        if(this.smi){
            this.smiOperator(fileIn);
        }
        if(this.cxl){
            this.cxsOperator(fileIn);
        }
        if (this.cxs){
            this.cxsOperator(fileIn);
        }
        if(this.ccn){
            this.ccnOperator(fileIn);
        }
    }

    public void tmiOperator(File fileIn){
        for (int i : parser.getTmi()) {
            threadsTmi.add(new Thread(() -> {
                UppaalVisitor eval = new UppaalVisitor(-1, i, "", "", "", "", "", parser.getClockEnv(), -1, -1, -1);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(fileIn, "tmi" + i + ".xml"));
                    myWriter.write(eval.visit(tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "tmi" + i + ".xml"));
        }
    }
    public void tadSyncOperator(File fileIn){
        for (String template : parser.getTransitionsTad().keySet()) {
            String outputEnv = "";
            if (!this.parser.getChannelEnv().get("Global").isEmpty()) {
                outputEnv = "Global";
            } else if (!this.parser.getChannelEnv().get(template).isEmpty()) {
                outputEnv = template;
            } else {
                continue;
            }
            for (String source : this.parser.getTransitionsTad().get(template).keySet()) {
                HashSet<String> targets = this.parser.getTransitionsTad().get(template).get(source);

                if (targets.isEmpty()) {
                    continue;
                }

                Iterator<String> iterTargets = targets.iterator();

                for (int i = 0; i < targets.size(); i++) {
                    //Choose target
                    String target = iterTargets.next();
                    int chanPicked = 0;
                    String chan = this.parser.getChannelEnv().get(outputEnv).get(chanPicked).getName();
                    int dimensions = this.parser.getChannelEnv().get(outputEnv).get(chanPicked).getDimension();
                    String output = chan.concat("[0]".repeat(dimensions)).concat("!");
                    this.threadsTad.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, -1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(fileIn, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }
        }
    }

    public void tadOperator(File fileIn){
        //Each template
        for (String template : parser.getTransitionsTad().keySet()) {
            //Each source
            for (String source : this.parser.getTransitionsTadNoSync().get(template).keySet()) {
                HashSet<String> targets = this.parser.getTransitionsTadNoSync().get(template).get(source);
                //If source does not have an available target, then continue
                if (targets.isEmpty()) {
                    continue;
                }

                Iterator<String> iterTargets = targets.iterator();

                for (int i = 0; i < targets.size(); i++) {
                    //Choose target
                    String target = iterTargets.next();

                    this.threadsTad.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, -1, template, source, target, "", "", parser.getClockEnv(), -1, -1, -1);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(fileIn, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }
        }
    }
    public void smiOperator(File fileIn){
        for (String template : this.parser.getLocationsSmi().keySet()) {
            for (String idLocation : this.parser.getLocationsSmi().get(template)) {
                threadsSmi.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(fileIn, "smi".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                        myWriter.write(eval.visit(this.tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }, "smi".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
            }
        }
    }
    public void cxlOperator(File fileIn){
        for(int i=1; i<=this.parser.getNumCxl(); i++){
            int idCxl = i;
            this.threadsCxl.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), idCxl, -1, -1);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(fileIn, "cxl"+ idCxl +".xml"));
                    myWriter.write(eval.visit(this.tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "cxl"+ idCxl +".xml"));
        }
    }
    public void cxsOperator(File fileIn){
        for(int i=1; i<=this.parser.getNumCxs(); i++){
            int idCxs = i;
            this.threadsCxs.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), -1, idCxs, -1);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(fileIn, "cxs"+ idCxs +".xml"));
                    myWriter.write(eval.visit(this.tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "cxs"+ idCxs +".xml"));
        }
    }
    public void ccnOperator(File fileIn){
        for(int i=1; i<=parser.getNumCcn(); i++){
            int idCcn = i;
            this.threadsCcn.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, -1, "", "", "", "", "", parser.getClockEnv(), -1, -1, idCcn);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(fileIn, "ccn"+ idCcn +".xml"));
                    myWriter.write(eval.visit(tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "ccn"+ idCcn +".xml"));
        }
    }

}
