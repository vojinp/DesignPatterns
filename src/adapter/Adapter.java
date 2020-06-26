package adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new DroneAdapter(new SuperDrone()));

        ducks.forEach(duck -> {
            duck.quack();
            duck.fly();
        });
    }
}
