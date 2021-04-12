package Parser.Main;
import Parser.Antlr.*;
import Parser.Errors.NoModelError;
import Parser.Errors.NoVerifyTaError;
import Parser.Mutation.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.apache.commons.cli.*;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

//////////////////////////////////////////////////////////////////////

public class Main {

    public static void main(String[] args)  {

        long startTime = System.currentTimeMillis();
        String output = "";
        OptionsArgs opt = new OptionsArgs();

        try{
            opt.parseArgs(args);
        } catch (ParseException e) {
            opt.printHelp();
            System.exit(1);
        } catch (NoModelError e) {
            System.out.println("-m,--model <path> is a required option" +
                    "\nTry `MutationUppaal -h' for more information" +
                    "\nPress enter to exit.");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.exit(1);
        } catch (NoVerifyTaError e) {
            System.out.println("-v,--verifyta <path> is a required option to score" +
                    "\nDo you want to generate the mutants without scoring? (y/n)\n");
            Scanner scan = new Scanner(System.in);
            String response = scan.next();
            while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
                System.out.println("\nInvalid response. Try again.");
                response = scan.next();
            }
            if (response.equalsIgnoreCase("n")) {
                System.out.println("\nTry `app -h' for more information");
                System.out.println("\nPress enter to exit.");
                scan = new Scanner(System.in);
                scan.nextLine();
                System.exit(1);
            } else {
                System.out.println("\nFine. Mutants without score will be generated");
            }
        }

        MutantController controller = null;
        try {

            controller = new MutantController(
                    opt.getModelFile(),
                    opt.isTmi(), opt.isTad(), opt.getTadSync(), opt.isTadRandomSync(), opt.isSmi(), opt.isSmiNoRedundant(),
                    opt.isCxl(), opt.isCxs(), opt.isCcn()
            );
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }

        String path = opt.getPathMutants();

        if(opt.getPathMutants().equals("")){
            String here = System.getProperty("user.dir");
            String idFile = Long.toString(System.currentTimeMillis());
            path = here.concat(File.separator + "Mutation"+ idFile);
        }

        System.out.println("mutants will be created in this path: "+path);

        File myFile = new File(path);
        myFile.mkdirs();
        if(!myFile.exists()){
            System.out.println("there was an error creating the directory indicated " +
                    "\nwith the path option [-p <path>]. You may have indicated a wrong route. " +
                    "\nPress enter to exit.");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.exit(1);
        }

        controller.prepareOperators(myFile);
        controller.runOperators();
        try {
            controller.joinOperators();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }

        output = output.concat(controller.infoMutants());

        try {
            if(!opt.getVerifyTaFile().equals("")){
                output =output.concat(
                        controller.verifyMutants(
                                path,
                                opt.getVerifyTaFile(),
                                opt.getQueryFile()
                        )
                );
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);

        output = output.concat("Time execution: " +
                String.format("%d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(duration),
                TimeUnit.MILLISECONDS.toSeconds(duration) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)))
        );
        try {
            if(opt.isLog()){
                FileWriter myWriter = null;
                myWriter = new FileWriter(new File(myFile, "log"));
                myWriter.write(output);
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(output);

    }
}
