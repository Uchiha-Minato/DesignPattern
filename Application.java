package strategyPattern;

import java.util.Arrays;

public class Application {

    public static ChooseStrategy strategy = new ChooseStrategy();

    public static void main(String[] args) {
        int[] array = Input.inputArray();
        System.out.println("输入的数组为" + Arrays.toString(array));
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //根据数组长度自动判断使用何种算法
        int length = array.length;
        if (length >= 1 && length <= 4) {
            System.out.println("\n数组长度小于等于4，使用冒泡排序:");
            strategy.setSortStrategy(new BubbleSort());
            strategy.doSort(array);
        } else if (length >= 5 && length <=8) {
            System.out.println("数组长度为" + length + ",使用堆排序");
            strategy.setSortStrategy(new HeapSort());
            strategy.doSort(array);
        } else if (length >= 9 && length <= 15) {
            System.out.println("数组长度为" + length + ",使用归并排序");
            strategy.setSortStrategy(new MergeSort());
            strategy.doSort(array);
        } else if (length >= 16) {
            System.out.println("数组长度为" + length + ",大于15,使用快速排序");
            strategy.setSortStrategy(new QuickSort());
            strategy.doSort(array);
        }

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
