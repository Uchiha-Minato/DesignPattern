package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockA extends Stock{

    private final List<Observer> observerA = new ArrayList<>();//购买了股票A的股民

    @Override
    public void addObserver(Observer observer) {
        observerA.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerA){
            observer.update();
        }
    }
}
