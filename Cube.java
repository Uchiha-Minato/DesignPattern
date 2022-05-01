package adapterPattern;

/**
 * Adaptee 被适配者
 * */
public class Cube {

    private final double width;

    public Cube(double width){
        this.width = width;
    }

    /**
     * 计算体积
     * */
    public double calculateVolume(){
        return width * width * width;
    }

    /**
     * 计算表面积
     * */
    public double calculateFaceArea(){
        return width * width * 6;
    }

    /**
     * 长度取值
     * */
    public double getWidth(){
        return width;
    }
}
