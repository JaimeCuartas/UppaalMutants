package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class SmiNoRedundant implements Command {
    private final MutantController mutantOperator;

    public SmiNoRedundant(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.smiNoRedundantOperator();
    }
}