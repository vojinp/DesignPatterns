package observer;

public class UserInterface implements Observer {

    @Override
    public void update(String type, Double value) {
        display(type, value);
    }

    public void display(String type, Double value) {
        System.out.println(String.format("%s: %s", type, value));
    }
}
