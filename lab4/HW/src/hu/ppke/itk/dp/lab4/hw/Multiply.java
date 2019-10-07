package hu.ppke.itk.dp.lab4.hw;

public class Multiply extends BiExprTreeBase  {

    Multiply(BiExprTree left, BiExprTree right) {
        super(left, right);
    }

    @Override
    public void AcceptVisitor(Visitor v) {
        v.visit(this);
    }
}
