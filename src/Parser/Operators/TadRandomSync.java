package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class TadRandomSync implements Command {
    private final MutantController mutantOperator;

    public TadRandomSync(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.tadRandomSyncOperator();
    }
}
