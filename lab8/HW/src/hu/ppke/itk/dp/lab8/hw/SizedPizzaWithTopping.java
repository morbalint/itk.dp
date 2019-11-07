package hu.ppke.itk.dp.lab8.hw;

import java.util.List;

public class SizedPizzaWithTopping implements Pizza {

    private final PizzaSize size;
    private final PizzaWithTopping pizzaWithTopping;

    public SizedPizzaWithTopping(PizzaBase base, PizzaSize size, List<Topping> toppings) {
        this.size = size;
        this.pizzaWithTopping = new PizzaWithTopping(base, toppings);
    }

    @Override
    public String getDescription() {
        return size.description + " " + pizzaWithTopping.getDescription();
    }

    @Override
    public Double getPrice() {
        return pizzaWithTopping.getPrice() * size.priceModifier;
    }
}
