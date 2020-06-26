package decorator;

public class Olives extends Topping {
    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", olives";
    }

    @Override
    Double cost() {
        return pizza.cost() + 0.2;
    }
}
