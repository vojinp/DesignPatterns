package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer logger = new Logger();

        weatherStation.addObserver(logger);
        weatherStation.addObserver(new AlertSystem());
        weatherStation.addObserver(new UserInterface());

        weatherStation.setTemperature(32.0);

        weatherStation.removeObserver(logger);

        weatherStation.setTemperature(21.0);
    }
}
