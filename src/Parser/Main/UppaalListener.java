package Parser.Main;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseListener;

public class UppaalListener extends UppaalParserBaseListener {

    private int idOperator;
    private int indexOperator;

    public UppaalListener (int idOperator){
        this.idOperator = idOperator;
        this.indexOperator = 0;
    }

    @Override
    public void enterLabelTransGuard(UppaalParser.LabelTransGuardContext ctx) {
        System.out.println(ctx.OPEN_GUARD().getText());
    }

    @Override
    public void exitLabelTransGuard(UppaalParser.LabelTransGuardContext ctx) {
        System.out.println(ctx.CLOSE_GUARD().getText());
    }

    @Override
    public void enterComparisonGuard(UppaalParser.ComparisonGuardContext ctx) {
        this.indexOperator++;
        if(this.indexOperator == this.idOperator){
            System.out.println("index is: " + this.indexOperator);
            System.out.println("Enter" + ctx.binary.getText());
        }
    }

    @Override
    public void exitComparisonGuard(UppaalParser.ComparisonGuardContext ctx) {

    }
}
