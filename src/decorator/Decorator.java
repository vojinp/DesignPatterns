package decorator;

public class Decorator {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        pizza = new Olives(pizza);
        pizza = new Olives(pizza);
        pizza = new Cheese(pizza);

        System.out.println(String.format("%s: $%f", pizza.getDescription(), pizza.cost()));
    }
}
