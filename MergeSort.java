package strategyPattern;

import java.util.Arrays;

public class MergeSort implements ISortStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("准备开始归并排序...");
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("归并排序完成");
    }

    private static void mergeSort(int[] a, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);//合并为数组a
        }
    }
    private static void merge(int[] c, int l, int m, int r){
        int[] d = new int[r - l + 1];
        int i = l,j = m + 1,k = 0;
        while((i <= m) && (j <= r)){
            if(c[i] <= c[j])
                d[k++] = c[i++];//先把小的值赋给d[i]
            else
                d[k++] = c[j++];
        }
        while(i <= m) //把左边剩余数移入数组
            d[k++] = c[i++];
        while(j <= r) //把右边剩余数移入数组
            d[k++] = c[j++];
        System.out.println(Arrays.toString(d));

        //复制数组d回c(a)
        System.arraycopy(d, 0, c, l, d.length);
    }
}
