package observerPattern;

public class ObserverB extends Observer{

    private final StockB stockB;
    public ObserverB(StockB stockB){
        this.stockB = stockB;
        this.stockB.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("StockB price has changed for "+
                stockB.getPrice() + " percents.");
    }
}
