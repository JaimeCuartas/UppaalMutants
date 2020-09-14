package Parser.Main;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseVisitor;

public class UppaalVisitor extends UppaalParserBaseVisitor<String> {
    private int idOperator;
    private int indexOperator;

    public UppaalVisitor (int idOperator){
        this.idOperator = idOperator;
        this.indexOperator = 0;
    }

    @Override
    public String visitModel(UppaalParser.ModelContext ctx) {
        visitProlog(ctx.prolog());
        return "";
    }


    @Override
    public String visitNta(UppaalParser.NtaContext ctx) {
        System.out.println(ctx.getText());
        return "";
    }

    @Override
    public String visitProlog(UppaalParser.PrologContext ctx) {
        System.out.println("Imprimo prolog" + ctx.());
        return "";
    }
}
