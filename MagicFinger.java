package adapterPattern;

/**
 * Adapter 适配器
 * */
public class MagicFinger extends BallIF{

    private static final double PI = 3.14d;

    public MagicFinger(Cube adaptee){
        radius = adaptee.getWidth();
    }

    @Override
    public double calculateArea() {
        return 4 * PI * (radius * radius);
    }

    @Override
    public double calculateVolume() {
        return (4.0d / 3.0d) * PI * (radius * radius * radius);
    }
}
