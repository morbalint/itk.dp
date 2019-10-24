package chainofresponsibility;

public class Handler {
	private static java.util.Random s_rn = new java.util.Random();
    private static int s_next = 1;
    private int m_id = s_next++;

    private Handler nextInLine;

    public Handler(Handler nextInLine){
        this.nextInLine = nextInLine;
    }

    public boolean handle(int num)
    {
        if (s_rn.nextInt(4) != 0)
        {
            if(nextInLine == null) {
                System.out.print(m_id + "-busy  ");
                return false;
            }
            else {
                return nextInLine.handle(num);
            }
        }
        System.out.println(m_id + "-handled-" + num);
        return true;
    }

    public Handler getNextInLine() {
        return nextInLine;
    }

    public void setNextInLine(Handler nextInLine) {
        this.nextInLine = nextInLine;
    }
}
