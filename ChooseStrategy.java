package strategyPattern;

/**
 * Context 上下文对象
 * */
public class ChooseStrategy {
    ISortStrategy sortStrategy;

    public void setSortStrategy(ISortStrategy strategy){
        this.sortStrategy = strategy;
    }

    public void doSort(int[] arr){
        if(arr != null){
            sortStrategy.sort(arr);
        }
    }
}
