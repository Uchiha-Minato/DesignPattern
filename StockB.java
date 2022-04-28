package observerPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StockB extends Stock{

    private final List<Observer> observerB = new ArrayList<>();//购买了股票B的股民
    private final LinkedList<Integer> pricesB = new LinkedList<>();//股票价格变动历史保存数组
    public StockB(){
        price = 50;//将股票B的价格初始化为50元
    }

    @Override
    public void addObserver(Observer observer) {
        observerB.add(observer);
    }

    /**
     * 当价格变化幅度大于5%时，通知用户
     * */
    @Override
    public void notifyObserver() {
        pricesB.addLast(price);
        if (pricesB.size() >= 2){
            float justPrice = pricesB.get(pricesB.size()-2);
            float percent = ((price - justPrice)/justPrice)*100;
            if (Math.abs(percent) >= 5){
                for (Observer observer : observerB){
                    observer.update((int)percent);
                }
            }
        }
    }

    @Override
    public String getPriceHistory() {
        return pricesB.toString();
    }
}
