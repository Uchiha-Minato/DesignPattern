package proxy_Decorator;

public class Application {
    public static void main(String[] args) {
        UniqueIdol idol = UniqueIdol.getUniqueIdol();
        Proxy proxy = new Proxy(idol);
        proxy.getRequest();

        idol.getMsgFromProxy();

        ConSubstitute substitute = new ConSubstitute(idol);
        substitute.doAct();

        idol.doAct();
    }
}
