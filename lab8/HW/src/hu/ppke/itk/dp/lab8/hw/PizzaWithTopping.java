package hu.ppke.itk.dp.lab8.hw;

import java.util.List;

public class PizzaWithTopping implements Pizza {

    private final PizzaBase base;
    private final List<Topping> toppings;

    public PizzaWithTopping(PizzaBase base, List<Topping> toppings){
        this.base = base;
        this.toppings = toppings;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " with: " + toppings.stream().map(x -> x.description).reduce((x,y) -> x + ", " + y).get();
    }

    @Override
    public Double getPrice() {
        return base.getPrice() + toppings.stream().map(x -> x.price).reduce(0.0, (a,b) -> a+b);
    }
}
