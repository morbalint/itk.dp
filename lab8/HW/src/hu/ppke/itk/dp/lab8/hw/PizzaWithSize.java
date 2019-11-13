package hu.ppke.itk.dp.lab8.hw;

public class PizzaWithSize implements Pizza {

    private final Pizza base;
    private final PizzaSize size;

    public PizzaWithSize(Pizza base, PizzaSize size) {
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
