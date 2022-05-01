package adapterPattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("------指方为圆------");
        System.out.println("请输入正方体边长");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        Cube cube = new Cube(width);
        System.out.println("边长为" + width);

        try{
            Thread.sleep(1500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        MagicFinger finger = new MagicFinger(cube);
        System.out.println("半径：" + finger.getRadius());
        System.out.println("表面积：" + finger.calculateArea());
        System.out.println("体积：" + finger.calculateVolume());
    }
}
