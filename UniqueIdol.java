package proxy_Decorator;

/**
 * Real Subject 实际主题：代理模式
 * Concrete Component 具体组件：装饰模式
 * Single Object 唯一实例：单例模式
 * */
public class UniqueIdol extends Idol{
    private static final UniqueIdol idol = new UniqueIdol();

    /**
     * 单例模式：私有构造方法
     **/
    private UniqueIdol(){}

    @Override
    public void doAct() {
        System.out.println(this.name + "本人开始表演了");
    }

    /**
     * 单例模式：获取全局唯一实例
     * */
    public static UniqueIdol getUniqueIdol(){
        return idol;
    }

    public void getMsgFromProxy(){
        System.out.println(this.name + "本人已经从经纪人处收到消息.");
    }
}
