package Visitor;

public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
