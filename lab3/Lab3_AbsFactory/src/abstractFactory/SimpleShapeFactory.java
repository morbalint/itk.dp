package abstractFactory;

public class SimpleShapeFactory implements ShapeFactory {

    @Override
    public Shape createCurved() {
        return new Circle();
    }

    @Override
    public Shape createRectangular() {
        return new Square();
    }
}
