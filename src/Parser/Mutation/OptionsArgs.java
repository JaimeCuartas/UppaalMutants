package Parser.Mutation;
import Parser.Errors.NoModelError;

import org.apache.commons.cli.*;

import java.util.Scanner;

public class OptionsArgs {
    private String modelFile;
    private String queryFile;
    private String logFile;
    private boolean tmi;
    private boolean tad;
    private boolean smi;
    private boolean cxl;
    private boolean cxs;
    private boolean ccn;
    private Options options;

    public OptionsArgs(){
        this.options = new Options();
        this.modelFile = "";
        this.queryFile = "";
        this.logFile = "";
        this.tmi = false;
        this.tad = false;
        this.smi = false;
        this.cxl = false;
        this.cxs = false;
        this.ccn = false;
    }

    public void parseArgs(String[] args) throws ParseException, NoModelError {

        Option modelOpt = Option.builder("m")
                .longOpt("model")
                .hasArg()
                .desc("Required argument, specifies the file containing the model to mutate.")
                .argName("file").build();
        Option queryOpt = Option.builder("q")
                .longOpt("query")
                .hasArg()
                .desc("Specifies the query file containing the properties of the model.")
                .argName("file").build();
        Option logOpt = Option.builder("l")
                .longOpt("log")
                .hasArg()
                .desc("Produced a file that contains a record of generated mutants.")
                .argName("file").build();

        Option help = new Option( "h", "help", false, "Shows this help screen.");
        Option tmi = new Option ( "tmi" , false, "Enable tmi operator. Transition MIssing operator removes a transition.");
        Option tad = new Option ( "tad" , false, "Enable tad operator. Transition ADd operator adds a transition between two states.");
        Option smi = new Option ( "smi" , false, "Enable smi operator. State MIssing operator removes a state (other than the initial state) and all its incoming/outgoing transitions.");
        Option cxl = new Option ( "cxl" , false, "Enable cxl operator. Constant eXchange L operator increases the constant of a clock constraint.");
        Option cxs = new Option ( "cxs" , false, "Enable cxs operator. Constant eXchange S operator decreases the constant of a clock constraint.");
        Option ccn = new Option ( "ccn" , false, "Enable ccn operator. Clock Constraint Negation operator negates a clock constraint.");

        options.addOption(help);
        options.addOption(modelOpt);
        options.addOption(queryOpt);
        options.addOption(logOpt);
        options.addOption(tmi);
        options.addOption(tad);
        options.addOption(smi);
        options.addOption(cxl);
        options.addOption(cxs);
        options.addOption(ccn);

        CommandLineParser argsParser = new DefaultParser();
        CommandLine line = argsParser.parse(options, args);
        if(!line.hasOption("m")){
            throw new NoModelError("No model file option to mutate");
        }
        if(line.hasOption("m")){
            modelFile = line.getOptionValue("m");
        }
        if(line.hasOption("q")){
            queryFile = line.getOptionValue("q");
        }
        if(line.hasOption("l")){
            logFile = line.getOptionValue("l");
        }
        if(line.hasOption("h")){
            this.printHelp();
        }
        this.tmi = line.hasOption("tmi");
        this.tad = line.hasOption("tad");
        this.smi = line.hasOption("smi");
        this.cxl = line.hasOption("cxl");
        this.cxs = line.hasOption("cxs");
        this.ccn = line.hasOption("ccn");
    }

    public void printHelp(){
        HelpFormatter formatter = new HelpFormatter();
        String header = "Where [-m <file>] model is a required option\nIf [-q <file>] query is missing, the execution of verifyta will be done only with the model\n\n";
        String footer = "\n";
        formatter.setOptionComparator(null);
        formatter.printHelp("myapp [OPTION]...", header, this.options, footer, false);
    }

    public String getModelFile() {
        return modelFile;
    }

    public void setModelFile(String modelFile) {
        this.modelFile = modelFile;
    }

    public String getQueryFile() {
        return queryFile;
    }

    public void setQueryFile(String queryFile) {
        this.queryFile = queryFile;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    public boolean isTmi() {
        return tmi;
    }

    public void setTmi(boolean tmi) {
        this.tmi = tmi;
    }

    public boolean isTad() {
        return tad;
    }

    public void setTad(boolean tad) {
        this.tad = tad;
    }

    public boolean isSmi() {
        return smi;
    }

    public void setSmi(boolean smi) {
        this.smi = smi;
    }

    public boolean isCxl() {
        return cxl;
    }

    public void setCxl(boolean cxl) {
        this.cxl = cxl;
    }

    public boolean isCxs() {
        return cxs;
    }

    public void setCxs(boolean cxs) {
        this.cxs = cxs;
    }

    public boolean isCcn() {
        return ccn;
    }

    public void setCcn(boolean ccn) {
        this.ccn = ccn;
    }
}
