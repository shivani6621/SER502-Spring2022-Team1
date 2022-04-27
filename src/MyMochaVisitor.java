public class MyMochaVisitor extends MochaBaseVisitor<Object> {

    @Override public Object visitProgram(MochaParser.ProgramContext ctx) {
        System.out.println("Visiting Program ...");
        return visitChildren(ctx);
    }
    @Override public Object visitBody(MochaParser.BodyContext ctx) {
        System.out.println("Visiting Body ...");
        return visitChildren(ctx);
    }
}
