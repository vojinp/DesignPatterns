package decorator;

public class ThickCrustPizza extends Pizza {
    @Override
    String getDescription() {
        return "Thick crust pizza";
    }

    @Override
    Double cost() {
        return 6.0;
    }
}
