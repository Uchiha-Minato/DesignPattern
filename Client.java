package factoryMethodPattern;

import java.util.Scanner;

public class Client {

    public static ILogFactory logFactory;
    public static ILog log;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        switch (choose){
            case 1 -> {
                logFactory = new FileILogFactory();
                log = logFactory.creatLog();
            }
            case 2 -> {
                logFactory = new DatabaseILogFactory();
                log = logFactory.creatLog();
            }
            default -> System.out.println("输入错误，请重新输入");
        }
        log.writeLog();
    }
}
