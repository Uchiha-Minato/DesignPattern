package observerPattern;

/**
 * Abstract Subject
 * 抽象主题
 * */
public abstract class Stock {

    public int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }

    public abstract void addObserver(Observer observer);

    public abstract void notifyObserver();

    /**
     * 查看股票历史价格
     * */
    public abstract String getPriceHistory();
}
