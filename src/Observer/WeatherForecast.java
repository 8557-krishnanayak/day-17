package Observer;

import Observer.Interface.IObserver;
import Observer.Interface.ISubject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WeatherForecast implements ISubject {
    private List<IObserver> displayPanel = new ArrayList<>();
    private String weather;

    @Override
    public void subscribe(IObserver o) {
        displayPanel.add(o);
    }

    @Override
    public void unsubscribe(IObserver o) {
        displayPanel.remove(o);
    }

    @Override
    public void notifyUpdate() {
        for (IObserver o : displayPanel) {
            o.update(weather);
        }
    }


    public void setWeather(String weather) {
        this.weather = weather;
        notifyUpdate();
    }
}
