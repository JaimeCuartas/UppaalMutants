package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class Ccn implements Command {
    private final MutantController mutantOperator;

    public Ccn(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.ccnOperator();
    }
}
