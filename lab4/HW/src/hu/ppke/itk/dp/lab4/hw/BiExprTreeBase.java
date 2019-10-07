package hu.ppke.itk.dp.lab4.hw;

public abstract class BiExprTreeBase implements BiExprTree {

    protected final BiExprTree left;
    protected final BiExprTree right;

    BiExprTreeBase(BiExprTree left, BiExprTree right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public BiExprTree getLeft() {
        return left;
    }

    @Override
    public BiExprTree getRight() {
        return right;
    }
}
