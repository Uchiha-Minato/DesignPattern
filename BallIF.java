package adapterPattern;

/**
 * Target 目标
 * */
public abstract class BallIF {

    public double radius;
    /**
     * 计算表面积
     * */
    public abstract double calculateArea();

    /**
     * 计算体积
     * */
    public abstract double calculateVolume();

    /**
     * 返回半径
     * */
    public double getRadius(){
        return radius;
    }
}
