package chainofresponsibility;

public class ChainDemo {
	public static void main(String[] args)
    {
        // yeah this is ugly af
        Handler handler = new Handler(new Handler( new Handler( new Handler( new Handler(null)))));

        for (int i = 1; i < 10; i++)
        {
            while (!handler.handle(i)) {
                System.out.println("could not find a free handler, retrying...");
            }
        }
    }
}
