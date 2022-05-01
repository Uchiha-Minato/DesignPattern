package factoryMethodPattern;

public class DatabaseLog implements ILog{

    @Override
    public void writeLog() {
        System.out.println("A msg from DBLog:\n您已选择数据库记录方式");
    }
}
