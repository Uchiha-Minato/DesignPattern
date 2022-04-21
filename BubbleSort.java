package strategyPattern;

import java.util.Arrays;

public class BubbleSort implements ISortStrategy{
    @Override
    public int[] sort(int[] arr) {

        System.out.print("输入的数组为:");
        System.out.println(Arrays.toString(arr));
        System.out.println("准备开始冒泡排序...");

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0 ; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                System.out.print("第"+(i+1)+"次排序结果为:");
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }
}
