package state;

public class OFFState implements State {

    @Override
    public void increaseVolume() {
        System.out.println("TV is OFF can't increase volume.");
    }

    @Override
    public void printState() {
        System.out.println("Turn OFF the TV");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("TV is OFF can't decrease volume.");
    }
}
