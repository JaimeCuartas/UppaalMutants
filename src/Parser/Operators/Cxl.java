package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class Cxl implements Command {
    private final MutantController mutantOperator;

    public Cxl(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.cxlOperator();
    }
}