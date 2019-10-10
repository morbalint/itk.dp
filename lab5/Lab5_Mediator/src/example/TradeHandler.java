package example;

public class TradeHandler implements Handler<TradeRequest> {
    @Override
    public void handle(TradeRequest request) {


        String leftGift = request.left.getGift();
        String rightGift = request.right.getGift();

        if(!leftGift.equals(rightGift)){

            Kid a = request.left;
            Kid b = request.right;

            System.out.println(a.getGift() + " <-> " + b.getGift());
            a.acquirePair(b);
            a.trade();
            System.out.println(a.getGift() + " <-> " + b.getGift());
            a.releasePair();

        }
    }
}
