package proxy_Decorator;

/**
 * Proxy 代理：代理模式
 * */
public class Proxy extends Idol{

    private final UniqueIdol idol;

    public Proxy(UniqueIdol idol){
        this.idol =idol;
    }

    @Override
    public void doAct() {
        getRequest();
        idol.getMsgFromProxy();
    }

    private void postRequest(){
        System.out.println("经纪人传送消息给" + this.name);
    }
    public void getRequest(){
        System.out.println("经纪人接到业务邀请");
        postRequest();
    }
}
