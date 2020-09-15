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
        String nta = "<nta>\n\t";
        nta = nta.concat(visit(ctx.declaration()).concat("\n"));

        List<UppaalParser.TemplateContext> templates = ctx.template();

        for(UppaalParser.TemplateContext template: templates){
            nta = nta.concat(visit(template));
        }
        nta = nta.concat("</nta>");
        return nta;
    }

    @Override
    public String visitDeclaration(UppaalParser.DeclarationContext ctx) {
        return ctx.getText();
    }


    @Override
    public String visitTemplate(UppaalParser.TemplateContext ctx) {
        String template = "<template>";
        template = template.concat(visit(ctx.temp_content()));
        template = template.concat("\n</template>\n");
        return template;
    }

    @Override
    public String visitTemp_content(UppaalParser.Temp_contentContext ctx) {
        String temp_content = "\n";
        if(ctx.name() != null){
            //print <name> ~[<&]+ </name>
            //temp_content = temp_content.concat(visit(ctx.name()));
        }
        if(ctx.parameter() != null){
            //print <parameter> ~[<&]+ </parameter>
            temp_content = temp_content.concat(visit(ctx.parameter()));
        }
        if(ctx.declaration() != null){
            //print <declaration> ~[<&] </declaration>
            temp_content = temp_content.concat(visit(ctx.declaration()));
        }
        List<UppaalParser.LocationContext> locations = ctx.location();

        for(UppaalParser.LocationContext location: locations){
            temp_content = temp_content.concat(visit(location));
        }

        return temp_content;
    }

    @Override
    public String visitName(UppaalParser.NameContext ctx) {
        String name = "\n<name";
        if(ctx.coordinate() != null){
            name = name.concat(visit(ctx.coordinate()));
        }
        name = name.concat(">").concat(ctx.anything().getText());
        name = name.concat("\n</name>\n");
        return name;
    }

    @Override
    public String visitCoordinate(UppaalParser.CoordinateContext ctx) {
        String coordinate = " x=".concat(ctx.STRING(0).getText());
        coordinate = coordinate.concat(" y=").concat(ctx.STRING(1).getText());
        return coordinate;
    }

    @Override
    public String visitParameter(UppaalParser.ParameterContext ctx) {
        return ctx.getText().concat("\n");
    }

    @Override
    public String visitLocation(UppaalParser.LocationContext ctx) {
        String location = "<location id=".concat(ctx.STRING().getText());
        if(ctx.coordinate()!=null){
            location = location.concat(visit(ctx.coordinate())).concat(">");
        }
        if(ctx.name()!=null){
            location = location.concat(visit(ctx.name()));
        }

        List<UppaalParser.Label_locContext> labelLocs = ctx.label_loc();
        for(UppaalParser.Label_locContext labelLoc: labelLocs){
            location = location.concat(visit(labelLoc)).concat("\n");
        }

        if(ctx.URGENT()!=null){
            location = location.concat("<urgent/>\n");
        }
        if(ctx.COMMITTED()!=null){
            location = location.concat("<committed/>\n");
        }
        location = location.concat("</location>");
        return location.concat("\n");
    }

    @Override
    public String visitLabel_loc(UppaalParser.Label_locContext ctx) {
        String labelLoc = "<label kind=";
        labelLoc = labelLoc.concat(ctx.STRING().getText()).concat(">");
        labelLoc = labelLoc.concat(visit(ctx.anything()));
        labelLoc = labelLoc.concat("</label>");
        return labelLoc;
    }

    @Override
    public String visitAnything(UppaalParser.AnythingContext ctx) {
        return ctx.getText();
    }
}
