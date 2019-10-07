package hu.ppke.itk.dp.lab4.hw;

// Leaf
public class Constant implements BiExprTree {

    private final int value;

    public Constant(int value) {

        this.value = value;
    }

    @Override
    public BiExprTree getLeft() {
        return null;
    }

    @Override
    public BiExprTree getRight() {
        return null;
    }

    @Override
    public void AcceptVisitor(Visitor v) {
        v.visit(this);
    }

    public int getValue() {
        return value;
    }
}
