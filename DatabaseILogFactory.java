package factoryMethodPattern;

public class DatabaseILogFactory implements ILogFactory {
    @Override
    public ILog creatLog() {
        return new DatabaseLog();
    }
}
