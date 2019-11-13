package hu.ppke.itk.dp.lab8.hw;

public class PizzaWithTopping implements Pizza {

    private final Pizza base;
    private final Topping topping;

    public PizzaWithTopping(Pizza base, Topping topping){
        this.base = base;
        this.topping = topping;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " with: " + topping.description;
    }

    @Override
    public Double getPrice() {
        return base.getPrice() + topping.price;
    }
}
