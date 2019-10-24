package privateClassData;

import java.awt.Color;
import java.awt.Point;

public class Circle {

	private CircleData state;

	public Circle(double radius, Color color, Point origin) {
		state = new CircleData(radius, color, origin);
	}
	public double Circumference() {
		return 2 * Math.PI * this.state.getRadius();
	}
	public double Diameter() {
		return 2 * this.state.getRadius();
	}
	public void Draw() {
		System.out.println("Drawing...\n");
		//I can mess around with things I shouldn't be able to change...
		// radius += 1;
		// ...no more
		this.state = this.state.setRadius(this.state.getRadius() + 1);
		// no idea why this is needed tho, but lets assume this was a specific business requirement.
	}
	public static void main(String[] args) {
		Circle myc = new Circle(5, new Color(1, 0, 0), new Point(20, 20));
		myc.Draw();
	}

	private class CircleData {
		private final double radius;
		private final Color color;
		private final Point origin;

		private CircleData(double radius, Color color, Point origin) {
			this.radius = radius;
			this.color = color;
			this.origin = origin;
		}

		public Point getOrigin() {
			return origin;
		}

		public Color getColor() {
			return color;
		}

		public double getRadius() {
			return radius;
		}

		public CircleData setRadius(double nextRadius) {
			return new CircleData(nextRadius, new Color(color.getRGB()), origin.getLocation());
		}
	}

}
