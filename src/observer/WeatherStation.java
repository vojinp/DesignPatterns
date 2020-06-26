package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    List<Observer> observers;

    Double temperature;
    Double windSpeed;
    Double pressure;

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        notifyObservers("temperature", temperature);
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
        notifyObservers("windSpeed", windSpeed);
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
        notifyObservers("pressure", pressure);
    }

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String type, Double value) {
        observers.forEach(o -> o.update(type, value));
    }
}
