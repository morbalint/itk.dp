package hu.ppke.itk.dp.lab4.hw;

public class Plus extends BiExprTreeBase {

    Plus(BiExprTree left, BiExprTree right) {
        super(left, right);
    }

    @Override
    public void AcceptVisitor(Visitor v) {
        v.visit(this);
    }
}
