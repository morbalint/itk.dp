package example;

/*
    This is a DTO type class;
 */
public class TradeRequest implements Request {

    public Kid left;

    public Kid right;

    public TradeRequest(Kid left, Kid right) {
        this.left = left;
        this.right = right;
    }


}
