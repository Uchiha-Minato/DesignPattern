package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockB extends Stock{

    private final List<Observer> observerB = new ArrayList<>();//购买了股票B的股民

    @Override
    public void addObserver(Observer observer) {
        observerB.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerB){
            observer.update();
        }
    }
}
