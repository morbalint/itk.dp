package hu.ppke.itk.dp.lab4.hw;

public class EvaluateVisitor implements Visitor {

    private int value = 0;

    public int getValue() {
        return value;
    }

    @Override
    public <T extends BiExprTree> void visit(T t) {
        Class c = t.getClass(); // `T.class` is not working :(, but `typeof T` would work in C#
        if(Plus.class == c) {
            this.visitPlus((Plus)t);
        }
        if(Multiply.class == c) {
            this.visitMultiply((Multiply) t);
        }
        if(Constant.class == c) {
            this.value = ((Constant)t).getValue();
        }
    }

    private void visitPlus(Plus t) {
        IntTuple children = this.evaluateChildren(t);
        this.value = children.left + children.right;
    }

    private void visitMultiply(Multiply t) {
        IntTuple children = this.evaluateChildren(t);
        this.value = children.left * children.right;
    }

    private IntTuple evaluateChildren(BiExprTree t) {
        t.getLeft().AcceptVisitor(this);
        int left = this.value;
        t.getRight().AcceptVisitor(this);
        int right = this.value;
        return new IntTuple(left, right);
    }
}
