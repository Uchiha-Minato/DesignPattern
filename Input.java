package strategyPattern;

import java.util.Scanner;

public class Input {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要排序的数组，以逗号隔开:");
        String str = sc.next();
        String[] arr = str.split(",");
        int[] a = new int[arr.length];
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        return a;
    }
}
