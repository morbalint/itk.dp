package flyweight;

public class Pixel {

    final int column;
    final byte color;
    final PixelFlyweight row;

    public  Pixel(byte color, int column, PixelFlyweight row) {
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public void report() {
        row.report(this);
    }

}
