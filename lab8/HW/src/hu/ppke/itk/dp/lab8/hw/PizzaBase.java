package hu.ppke.itk.dp.lab8.hw;

public class PizzaBase implements Pizza {

    private final String description;
    private final Double price;

    public PizzaBase(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.description + " pizza";
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
