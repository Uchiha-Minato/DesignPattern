package factoryMethodPattern;

/**
 * Concrete Creator 具体构造者
 * */
public class DatabaseILogFactory implements ILogFactory {
    @Override
    public ILog createLog() {
        return new DatabaseLog();
    }
}
