package factoryMethodPattern;

public class FileILogFactory implements ILogFactory {
    @Override
    public ILog creatLog() {
        return new FileLog();
    }
}
