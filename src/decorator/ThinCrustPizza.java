package decorator;

public class ThinCrustPizza extends Pizza {

    @Override
    String getDescription() {
        return "Thin crust pizza";
    }

    @Override
    Double cost() {
        return 5.0;
    }
}
