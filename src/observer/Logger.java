package observer;

public class Logger implements Observer {
    @Override
    public void update(String type, Double value) {
        log(type, value);
    }

    public void log(String type, Double value) {
        System.out.println(String.format("%s: %s", type, value));
    }
}