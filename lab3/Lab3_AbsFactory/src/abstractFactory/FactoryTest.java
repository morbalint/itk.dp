package abstractFactory;

import java.util.Scanner;

public class FactoryTest {

	public static void main(String[] args) {
		System.out.print("1 - Simple 2 - Robust : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		MetaFactory meta = new MetaFactory(input);
		ShapeFactory factory = meta.createFactory();

		//Let's create a Rectangular shape:
		Shape rect = factory.createRectangular();
		rect.draw();
		
		//Now let's create a circular shape:
		Shape circ = factory.createCurved();
		circ.draw();

	}

}
