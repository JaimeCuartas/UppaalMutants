package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class Cxs implements Command {
    private final MutantController mutantOperator;

    public Cxs(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.cxsOperator();
    }
}