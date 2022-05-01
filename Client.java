package factoryMethodPattern;

import java.util.Scanner;

/**
 * Client 模拟客户端
 * */
public class Client {

    public static ILogFactory logFactory;
    public static ILog log;

    public static void main(String[] args) {
        System.out.println("------日志记录器-------");
        System.out.println("1.文件记录\n2.数据库记录");
        System.out.println("请输入选择");
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
