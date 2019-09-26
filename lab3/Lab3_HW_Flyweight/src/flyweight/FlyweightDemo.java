package flyweight;

import java.util.Random;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;

	public static void main( String[] args ) {
		Random rand = new Random();
		Pixel[][] matrix = new Pixel[ROWS][COLS];
		PixelFactory factory = new PixelFactory();
		for (int i=0; i < ROWS; i++)
			for (int j=0; j < COLS; j++)
				matrix[i][j] = factory.createPixel(i, j, (rand.nextInt(128)+128));
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++)
				matrix[i][j].report();
			System.out.println();
		}  
	}
}