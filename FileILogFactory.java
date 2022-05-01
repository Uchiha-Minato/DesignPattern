package factoryMethodPattern;

/**
 * Concrete Creator 具体构造者
 * */
public class FileILogFactory implements ILogFactory {
    @Override
    public ILog creatLog() {
        return new FileLog();
    }
}
