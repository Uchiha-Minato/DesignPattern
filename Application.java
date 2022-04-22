package strategyPattern;

import java.util.Arrays;
import java.util.Scanner;

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

        boolean isContinue = true;

        while(isContinue){
            System.out.println("\n请选择要使用的排序算法：");
            System.out.println("1.冒泡排序\n2.归并排序\n3.快速排序\n4.堆排序\n");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            switch (choose){
                case 1-> {
                    strategy.setSortStrategy(new BubbleSort());
                    strategy.doSort(array);
                    isContinue = false;
                }
                case 2-> {
                    strategy.setSortStrategy(new MergeSort());
                    strategy.doSort(array);
                    isContinue = false;
                }
                case 3-> {
                    strategy.setSortStrategy(new QuickSort());
                    strategy.doSort(array);
                    isContinue = false;
                }
                case 4-> {
                    strategy.setSortStrategy(new HeapSort());
                    strategy.doSort(array);
                    isContinue = false;
                }
                default -> System.out.println("输入错误，请重新输入一个数");
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
