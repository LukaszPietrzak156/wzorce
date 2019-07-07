package pl.sda.wzorce;

import java.util.Observable;
import java.util.Observer;

public class ObserverExample implements Observer {

    private ObservableDemo weatherUpdate;

    @Override
    public void update(Observable o, Object arg) {
        weatherUpdate = (ObservableDemo) obserwable;
        System.out.println("Weather Report Live. Ist "+ weatherUpdate.getWeather());
    }

    public static void main(String[] args) {
        ObservableDemo observable = new ObservableDemo(null);
        ObservableExample observer = new ObserverExample();
        observable.addObserver(observer);
        observable.setWeather("Bright and sunny... Let's play cricket!! ");
        observable.setWeather("Raining Heavily!...Let's have hot Pakodas");
    }
}
