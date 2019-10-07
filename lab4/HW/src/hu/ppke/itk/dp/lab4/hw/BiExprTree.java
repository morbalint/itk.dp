package hu.ppke.itk.dp.lab4.hw;

public interface BiExprTree {
    BiExprTree getLeft();
    BiExprTree getRight();
    void AcceptVisitor(Visitor v);
}
