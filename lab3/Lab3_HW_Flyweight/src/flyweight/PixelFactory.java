package flyweight;

public class PixelFactory {

    private final FlyweightFactory factory = new FlyweightFactory();

    public Pixel createPixel(int row, int column, int color) {
        return new Pixel((byte)color, column, factory.createFlyweight(row));
    }

}
