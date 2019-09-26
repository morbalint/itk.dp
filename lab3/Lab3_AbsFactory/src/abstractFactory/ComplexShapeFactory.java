package abstractFactory;

public class ComplexShapeFactory implements ShapeFactory {
    @Override
    public Shape createCurved() {
        return new Ellipse();
    }

    @Override
    public Shape createRectangular() {
        return new Rectangle();
    }
}
