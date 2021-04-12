package Parser.Mutation;

import Parser.Antlr.UppaalLexer;
import Parser.Antlr.UppaalParser;
import Parser.Graph.Graph;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.*;


public class MutantController {
    private boolean tmi;
    private boolean tad;
    private String tadSync;
    private boolean tadRandomSync;
    private boolean smi;
    private boolean smiNoRedundant;
    private boolean cxl;
    private boolean cxs;
    private boolean ccn;
    private ArrayList<Thread> threadsTmi;
    private ArrayList<Thread> threadsTad;
    private ArrayList<Thread> threadsTadSync;
    private ArrayList<Thread> threadsTadRandomSync;
    private ArrayList<Thread> threadsSmi;
    private ArrayList<Thread> threadsSmiNoRedundant;
    private ArrayList<Thread> threadsCxl;
    private ArrayList<Thread> threadsCxs;
    private ArrayList<Thread> threadsCcn;
    private UppaalParser parser;
    private ParseTree tree;

    public MutantController(
            String modelFile,
            boolean tmi, boolean tad, String tadSync, boolean tadRandomSync, boolean smi, boolean smiNoRedundant,
            boolean cxl, boolean cxs, boolean ccn) throws IOException {

        this.tmi = tmi;
        this.tad = tad;
        this.tadSync = tadSync;
        this.tadRandomSync = tadRandomSync;
        this.smi = smi;
        this.smiNoRedundant = smiNoRedundant;
        this.cxl = cxl;
        this.cxs = cxs;
        this.ccn = ccn;

        this.threadsTmi = new ArrayList<>();
        this.threadsTad = new ArrayList<>();
        this.threadsTadSync = new ArrayList<>();
        this.threadsTadRandomSync = new ArrayList<>();
        this.threadsSmi = new ArrayList<>();
        this.threadsSmiNoRedundant = new ArrayList<>();
        this.threadsCxl = new ArrayList<>();
        this.threadsCxs = new ArrayList<>();
        this.threadsCcn = new ArrayList<>();

        CharStream input = CharStreams.fromFileName(modelFile);
        UppaalLexer lexer = new UppaalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        this.parser = new UppaalParser(tokens);
        this.tree = this.parser.model();
    }

    public String infoMutants(){
        String info = "Number of mutants:\n";
        info = info.concat("tmi ").concat(Integer.toString(this.threadsTmi.size())).concat("\n");
        info = info.concat("tad ").concat(Integer.toString(this.threadsTad.size())).concat("\n");
        info = info.concat("tadSync ").concat(Integer.toString(this.threadsTadSync.size())).concat("\n");
        info = info.concat("tadRandomSync ").concat(Integer.toString(this.threadsTadRandomSync.size())).concat("\n");
        info = info.concat("smi ").concat(Integer.toString(this.threadsSmi.size())).concat("\n");
        info = info.concat("smiNoRedundant ").concat(Integer.toString(this.threadsSmiNoRedundant.size())).concat("\n");
        info = info.concat("cxl ").concat(Integer.toString(this.threadsCxl.size())).concat("\n");
        info = info.concat("cxs ").concat(Integer.toString(this.threadsCxs.size())).concat("\n");
        info = info.concat("ccn ").concat(Integer.toString(this.threadsCcn.size())).concat("\n");

        info = info.concat("Total ").concat(Integer.toString(
                this.threadsTmi.size()
                +this.threadsTad.size()
                +this.threadsTadSync.size()
                +this.threadsTadRandomSync.size()
                +this.threadsSmi.size()
                +this.threadsSmiNoRedundant.size()
                +this.threadsCxl.size()
                +this.threadsCxs.size()
                +this.threadsCcn.size()
        )).concat("\n");
        return info;
    }

    public String verifyMutants(String pathIn, String pathVerifyTa, String pathQuery) throws IOException, InterruptedException {
        String log = "";
        int killedTmi =  killedMutants(this.threadsTmi, pathIn, pathVerifyTa, pathQuery);
        int killedTad = killedMutants(this.threadsTad, pathIn, pathVerifyTa, pathQuery);
        int killedTadSync = killedMutants(this.threadsTadSync, pathIn, pathVerifyTa, pathQuery);
        int killedTadRandomSync = killedMutants(this.threadsTadRandomSync, pathIn, pathVerifyTa, pathQuery);
        int killedSmi = killedMutants(this.threadsSmi, pathIn, pathVerifyTa, pathQuery);
        int killedSmiNoRedundant = killedMutants(this.threadsSmiNoRedundant, pathIn, pathVerifyTa, pathQuery);
        int killedCxl = killedMutants(this.threadsCxl, pathIn, pathVerifyTa, pathQuery);
        int killedCxs = killedMutants(this.threadsCxs, pathIn, pathVerifyTa, pathQuery);
        int killedCcn = killedMutants(this.threadsCcn, pathIn, pathVerifyTa, pathQuery);

        log = log.concat("Tmi killed ");
        log = log.concat(Integer.toString(killedTmi));
        log = log.concat("\nTad killed ");
        log = log.concat(Integer.toString(killedTad));
        log = log.concat("\ntadSync killed ");
        log = log.concat(Integer.toString(killedTadSync));
        log = log.concat("\ntadRandomSync killed ");
        log = log.concat(Integer.toString(killedTadRandomSync));
        log = log.concat("\nSmi killed ");
        log = log.concat(Integer.toString(killedSmi));
        log = log.concat("\nSmiNoRedundant killed ");
        log = log.concat(Integer.toString(killedSmiNoRedundant));
        log = log.concat("\nCxl killed ");
        log = log.concat(Integer.toString(killedCxl));
        log = log.concat("\nCxs killed ");
        log = log.concat(Integer.toString(killedCxs));
        log = log.concat("\nCcn killed ");
        log = log.concat(Integer.toString(killedCcn));
        log = log.concat("\nScore ").concat(Integer.toString(
                killedTmi+killedTad+killedTadSync+killedTadRandomSync+killedSmi+killedCxl+killedCxs+killedCcn
                )).concat("/").concat(Integer.toString(
                        this.threadsTmi.size()
                        +this.threadsTad.size()
                        +this.threadsTadSync.size()
                        +this.threadsTadRandomSync.size()
                        +this.threadsSmi.size()
                        +this.threadsSmiNoRedundant.size()
                        +this.threadsCxl.size()
                        +this.threadsCxs.size()
                        +this.threadsCcn.size()
        ));
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
        this.runTadSync();
        this.runTadRandomSync();
        this.runSmi();
        this.runSmiNoRedundant();
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
    public void runTadSync(){
        for (Thread mutantThread: this.threadsTadSync){
            mutantThread.start();
        }
    }
    public void runTadRandomSync(){
        for (Thread mutantThread: this.threadsTadRandomSync){
            mutantThread.start();
        }
    }
    public void runSmi(){
        for (Thread mutantThread: this.threadsSmi){
            mutantThread.start();
        }
    }
    public void runSmiNoRedundant(){
        for (Thread mutantThread: this.threadsSmiNoRedundant){
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
        this.joinTadSync();
        this.joinTadRandomSync();
        this.joinSmi();
        this.joinSmiNoRedundant();
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
    public void joinTadSync() throws InterruptedException {
        for (Thread mutantThread: this.threadsTadSync){
            mutantThread.join();
        }
    }
    public void joinTadRandomSync() throws  InterruptedException {
        for (Thread mutantThread: this.threadsTadRandomSync){
            mutantThread.join();
        }
    }
    public void joinSmi() throws InterruptedException {
        for (Thread mutantThread: this.threadsSmi){
            mutantThread.join();
        }
    }
    public void joinSmiNoRedundant() throws InterruptedException {
        for (Thread mutantThread: this.threadsSmiNoRedundant){
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
        if(!this.tadSync.equals("")){
            this.tadSyncOperator(fileIn);
        }
        if(this.tadRandomSync){
            this.tadRandomSyncOperator(fileIn);
        }
        if(this.smi){
            this.smiOperator(fileIn);
        }
        if(this.smiNoRedundant){
            this.smiNoRedundantOperator(fileIn);
        }
        if(this.cxl){
            this.cxlOperator(fileIn);
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
                UppaalVisitor eval = new UppaalVisitor(i, "", "", "", "", "", parser.getClockEnv(), -1, -1, -1);
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
                        UppaalVisitor eval = new UppaalVisitor(-1, template, source, target, "", "", parser.getClockEnv(), -1, -1, -1);
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

    public void tadSyncOperator(File fileIn){
        //Each template
        for (String template : parser.getTransitionsTad().keySet()) {
            //Each source
            for (String source : this.parser.getTransitionsTad().get(template).keySet()) {
                HashSet<String> targets = this.parser.getTransitionsTad().get(template).get(source);
                //If source does not have an available target, then continue
                if (targets.isEmpty()) {
                    continue;
                }


                Iterator<String> iterTargets = targets.iterator();

                for (int i = 0; i < targets.size(); i++) {
                    //Choose target
                    String target = iterTargets.next();

                    String output = this.tadSync.concat("!");
                    this.threadsTadSync.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(fileIn, "tadSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tadSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }
        }
    }

    public void tadRandomSyncOperator(File fileIn){
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
                    for (int j=0; j<dimensions; j++){
                        chan = chan.concat("[0]");
                    }
                    String output = chan.concat("!");
                    this.threadsTadRandomSync.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1);
                        FileWriter myWriter = null;
                        try {
                                myWriter = new FileWriter(new File(fileIn, "tadRandomSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tadRandomSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }
        }
    }

    public void smiOperator(File fileIn){

        for (String template : this.parser.getLocationsSmi().keySet()) {
            for (String idLocation : this.parser.getLocationsSmi().get(template)) {
                threadsSmi.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1);
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

    public void smiNoRedundantOperator(File fileIn){

        HashMap<String, HashSet<String>> smiNoRedundant = new HashMap<>(this.parser.getLocationsSmi());
        for(Map.Entry<String, HashSet<String>> entry: this.parser.getLocationsSmi().entrySet()){
            HashSet<String> newSmiLocations = new HashSet<>(entry.getValue());
            smiNoRedundant.put(entry.getKey(), newSmiLocations);
        }

        for(String template : smiNoRedundant.keySet()){
            Graph graphTemplate = this.parser.getGraphs().get(template);
            ArrayList<ArrayList<Integer>> listGraph = graphTemplate.getNumericGraph();

            smiNoRedundant.get(template).removeIf(idLocation -> graphTemplate.samePreviousNode(listGraph, idLocation));
        }

        for (String template : smiNoRedundant.keySet()) {
            for (String idLocation : smiNoRedundant.get(template)) {

                threadsSmiNoRedundant.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(fileIn, "smiNoRedundant".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                        myWriter.write(eval.visit(this.tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }, "smiNoRedundant".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
            }
        }
    }
    public void cxlOperator(File fileIn){
        for(int i=1; i<=this.parser.getNumCxl(); i++){
            int idCxl = i;
            this.threadsCxl.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", "", parser.getClockEnv(), idCxl, -1, -1);
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
                UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", "", parser.getClockEnv(), -1, idCxs, -1);
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
                UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", "", parser.getClockEnv(), -1, -1, idCcn);
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
