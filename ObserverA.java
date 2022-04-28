package observerPattern;

public class ObserverA extends Observer{

    private final StockA stockA;
    public ObserverA(StockA stockA){
        this.stockA = stockA;
        this.stockA.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("StockA price has changed for " +
                stockA.getPrice() + " percents.");
    }
}
