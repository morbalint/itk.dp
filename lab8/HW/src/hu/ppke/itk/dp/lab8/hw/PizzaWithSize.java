package hu.ppke.itk.dp.lab8.hw;

public class PizzaWithSize implements Pizza {

    private final PizzaBase base;
    private final PizzaSize size;

    public PizzaWithSize(PizzaBase base, PizzaSize size) {
        this.base = base;
        this.size = size;
    }

    @Override
    public String getDescription() {
        return size.description + " " + base.getDescription();
    }

    @Override
    public Double getPrice() {
        return base.getPrice() * size.priceModifier;
    }
}
