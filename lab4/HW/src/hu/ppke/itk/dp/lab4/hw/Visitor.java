package hu.ppke.itk.dp.lab4.hw;

public interface Visitor {
    <T extends BiExprTree> void visit(T t);
}
