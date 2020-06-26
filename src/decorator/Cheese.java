package decorator;

public class Cheese extends Topping {
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    Double cost() {
        return pizza.cost() + 0.1;
    }
}
