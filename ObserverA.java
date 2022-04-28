package observerPattern;

/**
 * Concrete Observer
 * 具体观察者
 * */
public class ObserverA extends Observer{

    private final StockA stockA;
    public ObserverA(StockA stockA){
        this.stockA = stockA;
        this.stockA.addObserver(this);
    }
    @Override
    public void update(int priceChange) {
        System.out.println("Message ObserverA has received:");
        System.out.println("StockA price has changed for " +
                priceChange + " percents.");
        System.out.println("Now the price of StockB is " + stockA.getPrice());
    }
}
