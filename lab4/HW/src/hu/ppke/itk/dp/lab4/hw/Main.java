package hu.ppke.itk.dp.lab4.hw;

public class Main {

    public static void main(String[] args) {

        // create expression
        BiExprTree expr = new Plus(new Constant(5), new Multiply(new Constant(4), new Constant(3)));

        // test printer
        System.out.println("Testing printer:");
	    Visitor printer = new PrintVisitor();
	    expr.AcceptVisitor(printer);
        System.out.println();

	    // test evaluator
        System.out.println("Testing eval:");
        EvaluateVisitor eval = new EvaluateVisitor();
	    expr.AcceptVisitor(eval);
	    System.out.println(eval.getValue());
    }
}
