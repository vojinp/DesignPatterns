package observer;

public class AlertSystem implements Observer {
    @Override
    public void update(String type, Double value) {
        alert(type, value);
    }

    public void alert(String type, Double value) {
        System.out.println(String.format("%s: %s", type, value));
    }
}