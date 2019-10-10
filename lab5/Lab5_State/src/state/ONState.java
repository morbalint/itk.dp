package state;

public class ONState implements State {

    private int volume = 0;

    @java.lang.Override
    public void increaseVolume() {
        volume++;
        System.out.println(String.format("Volume is currently: %d",volume));
    }

    @Override
    public void printState() {
        System.out.println("Turn ON the TV");
    }

    @java.lang.Override
    public void decreaseVolume() {
        volume--;
        System.out.println(String.format("Volume is currently: %d",volume));
    }
}
