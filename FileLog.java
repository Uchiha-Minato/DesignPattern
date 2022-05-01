package factoryMethodPattern;

/**
 * Concrete Product 具体产品
 * */
public class FileLog implements ILog{

    @Override
    public void writeLog() {
        System.out.println("A msg from FileLog:\n您已选择文件记录方式");
    }
}
