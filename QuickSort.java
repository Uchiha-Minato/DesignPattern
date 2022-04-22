package strategyPattern;

import java.util.Arrays;

public class QuickSort implements ISortStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("准备开始快速排序...");
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        qSort(arr, 0, arr.length - 1);
        System.out.println("快速排序完成");
    }

    private static void qSort(int[] a, int left, int right){
        if(left > right){
            return; //至少有两个元素
        }

        int i,j,pivot;
        i = left;//左哨兵
        j = right;//右哨兵
        pivot = a[i];//基准元素：数组的第一个元素

        while(i < j){
            //左哨兵的值小于右哨兵的值，从数组两端交替向中间遍历
            while(i < j && a[j] >= pivot)
                j--;//先从右往左找，直到当前值比基准元素大
            if(i < j)
                a[i++] = a[j];//用比基准值小的元素替换低位记录
            while(i < j && a[i] < pivot)
                i++;//然后从左往右找，直到当前值比基准元素小
            if(i < j)
                a[j--] = a[i];//用比基准值大的元素替换高位记录

        } //完成一次快速排序
        a[i] = pivot;

        System.out.println("基准元素: " + a[i]);
        System.out.println("排序后: " + Arrays.toString(a));

        //递归地对高子表和低子表排序
        qSort(a, left, i - 1);
        qSort(a, i + 1, right);
    }
}
