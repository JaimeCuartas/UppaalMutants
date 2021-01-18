package Parser.Main;
import Parser.Antlr.*;
import Parser.Errors.NoModelError;
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

//////////////////////////////////////////////////////////////////////


public class Mutation {

    public static void main(String[] args)  {

        long startTime = System.nanoTime();
        OptionsArgs opt = new OptionsArgs();

        try{
            opt.parseArgs(args);
        } catch (ParseException e) {
            opt.printHelp();
            System.exit(1);
        }
        catch (NoModelError e) {
            System.out.println("-m,--model <file> is a required option" +
                    "\nTry `app -h' for more information" +
                    "\nPress enter to exit.");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.exit(1);
        }

        MutantController controller = null;
        try {
            controller = new MutantController(
                    opt.getModelFile(),
                    opt.isTmi(), opt.isTad(), opt.isSmi(),
                    opt.isCxl(), opt.isCxs(), opt.isCcn()
            );
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }

        String here = System.getProperty("user.dir");
        String idFile = Long.toString(System.currentTimeMillis());
        String path = here.concat(File.separator + "Mutation"+ idFile);

        File myFile = new File(path);

        if(!myFile.mkdirs()){
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
        try {
            String a = controller.verifyMutants(path,
                    "C:\\Users\\57310\\Desktop\\uppaal-4.1.24\\bin-Windows\\verifyta.exe",
                    opt.getQueryFile());
            System.out.println(a);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration);
    }
}
