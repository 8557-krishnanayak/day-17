package Observer;

import Observer.Interface.IObserver;
import Observer.ObserverClass.PhoneDisplay;
import Observer.ObserverClass.TVDisplay;
import Observer.ObserverClass.WatchDisplay;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IObserver phoneObserver = new PhoneDisplay();
        IObserver tvObserver = new TVDisplay();
        IObserver watchObserver = new WatchDisplay();

        WeatherForecast weatherForecast = new WeatherForecast();

        weatherForecast.subscribe(phoneObserver);
        weatherForecast.subscribe(tvObserver);

        weatherForecast.setWeather("Sunny");

        Thread.sleep(3000);

        System.out.println("\n*******************************************\n");
        weatherForecast.subscribe(watchObserver);

        weatherForecast.setWeather("Rainy");


        weatherForecast.unsubscribe(tvObserver);
        Thread.sleep(1000);
        weatherForecast.setWeather("windy");

    }
}
