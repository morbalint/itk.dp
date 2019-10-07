package hu.ppke.itk.dp.lab4.hw;

public class PrintVisitor implements Visitor {
    @Override
    public <T extends BiExprTree> void visit(T t) {
        BiExprTree left = t.getLeft();
        BiExprTree right = t.getRight();
        if(left != null) {
            left.AcceptVisitor(this);
        }
        printNode(t);
        if(right != null) {
            right.AcceptVisitor(this);
        }
    }

    private <T extends BiExprTree> void printNode(T t) {
        Class c = t.getClass();
        if(Plus.class == c) {
            System.out.print("+");
        }
        if(Multiply.class == c) {
            System.out.print("*");
        }
        if(Constant.class == c) {
            System.out.print(((Constant) t).getValue());
        }
    }
}
