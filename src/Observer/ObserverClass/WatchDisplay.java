package Observer.ObserverClass;

import Observer.Interface.IObserver;

public class WatchDisplay implements IObserver {
    private String weather;

    @Override
    public void update(String s) {
        this.weather = s;
        display();
    }

    public void display() {
        System.out.println("Watch Display: weather Update " + weather);
    }
}
