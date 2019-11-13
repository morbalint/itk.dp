package hu.ppke.itk.dp.lab8.hw;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    PizzaBase neapolitan = new PizzaBase("Neapolitan", 1000.0);
        PizzaBase deepDish = new PizzaBase("Deep Dish", 1300.0);
        PizzaBase NY = new PizzaBase("New York", 800.0);

        PizzaSize small = new PizzaSize("small", 0.75);
        PizzaSize normal = new PizzaSize("normal", 1.0);
        PizzaSize large = new PizzaSize("large", 1.5);

        Topping tomato = new Topping("tomato sauce", 100.0);
        Topping sauce = new Topping("white sauce", 120.0);
        Topping garlic = new Topping("garlic", 20.0);
        Topping mozzarella = new Topping("mozzarella", 60.0);
        Topping basil = new Topping("basil", 30.0);
        Topping olive = new Topping("olive", 70.0);
        Topping capri = new Topping("capri", 80.0);
        Topping prosciutto = new Topping("prosciutto", 130.0);

        Pizza[] pizzas = new Pizza[] {
                new PizzaWithTopping(new PizzaWithTopping(new PizzaWithTopping(new PizzaWithSize(neapolitan, large), tomato), basil), prosciutto),
                new PizzaWithSize(deepDish, small),
                new PizzaWithTopping(new PizzaWithTopping(new PizzaWithTopping(new PizzaWithTopping(NY, garlic), sauce), mozzarella), capri),
                new PizzaWithTopping(new PizzaWithTopping(new PizzaWithTopping(new PizzaWithTopping(new PizzaWithSize(neapolitan, normal), tomato), olive), mozzarella), basil),
        };

        System.out.println("Your order is:\n");

        for(Pizza p : pizzas){
            System.out.println(p.getDescription() + " for " + p.getPrice() + " HUF");
        }
        System.out.println("\nTotal: " + Arrays.stream(pizzas).map(x -> x.getPrice()).reduce(0.0, (x,y) -> x + y) + " HUF");
    }
}
