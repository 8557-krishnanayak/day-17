package Observer.ObserverClass;

import Observer.Interface.IObserver;

public class PhoneDisplay implements IObserver {
    private String weather;

    @Override
    public void update(String update) {
        this.weather = update;
        display();
    }

    public void display() {
        System.out.println("Phone Display: weather Update " + this.weather);
    }
}
