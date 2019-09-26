package flyweight;
public class PixelFlyweight {
	private final int row;
	public PixelFlyweight(int row) {
		this.row = row;
	}
	void report(Pixel instance) {
		System.out.print( " " + row + ", " + instance.column + ": "+instance.color);
	}
}