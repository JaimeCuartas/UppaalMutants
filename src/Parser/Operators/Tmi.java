package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class Tmi implements Command {
    private final MutantController mutantOperator;

    public Tmi(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.tmiOperator();
    }
}