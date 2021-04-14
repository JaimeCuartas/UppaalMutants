package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class TadSync implements Command {
    private final MutantController mutantOperator;
    private String chanSync;

    public TadSync(MutantController mutantOperator, String chanSync){
        this.mutantOperator = mutantOperator;
        this.chanSync = chanSync;
    }

    public void execute(){
        this.mutantOperator.tadSyncOperator(this.chanSync);
    }
}