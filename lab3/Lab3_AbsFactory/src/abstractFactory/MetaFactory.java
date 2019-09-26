package abstractFactory;

public class MetaFactory {
    private final String type;

    public MetaFactory(String type) {

        this.type = type;
    }

    public ShapeFactory createFactory() {
        if(type.equals("1")){
            return new SimpleShapeFactory();
        }
        else {
            return new ComplexShapeFactory();
        }
    }
}
