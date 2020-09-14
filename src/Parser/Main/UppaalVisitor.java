package Parser.Main;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseVisitor;

import java.util.List;

public class UppaalVisitor extends UppaalParserBaseVisitor<String> {

    private String output;
    private int idOperator;
    private int indexOperator;

    public UppaalVisitor (int idOperator){
        this.output = "";
        this.idOperator = idOperator;
        this.indexOperator = 0;
    }

    @Override
    public String visitModel(UppaalParser.ModelContext ctx) {
        this.output = this.output.concat("\n");
        if(ctx.prolog()!=null){
            this.output = this.output.concat(visit(ctx.prolog()));
        }
        this.output = this.output.concat(visit(ctx.nta()));
        return this.output;
    }

    @Override
    public String visitProlog(UppaalParser.PrologContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNta(UppaalParser.NtaContext ctx) {
        String nta = "<nta>\n\tje";
        nta = nta.concat(ctx.declaration().getText());

        List<UppaalParser.TemplateContext> templates = ctx.template();

        for(UppaalParser.TemplateContext template: templates){
            nta = nta.concat(visit(template));
        }
        nta = nta.concat("\n</nta>");
        return nta;
    }

    @Override
    public String visitTemplate(UppaalParser.TemplateContext ctx) {
        String template = "<template>";
        template = template.concat(visit(ctx.temp_content()));
        template = template.concat("\n</template>");
        return template;
    }

    @Override
    public String visitTemp_content(UppaalParser.Temp_contentContext ctx) {
        String temp_content = "";
        if(ctx.name() != null){
            temp_content = temp_content.concat(ctx.name().getText());
        }
        return temp_content;
    }
}
