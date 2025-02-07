package A13_zad1_space.second;

public class ImmutableSpacecraftPosition {
    private double x;
    private double y;
    private double z;

    public ImmutableSpacecraftPosition(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                ", z=" + z;
    }
    public ImmutableSpacecraftPosition move(double xChange, double yChange, double zChange){
        return new ImmutableSpacecraftPosition(xChange + this.getX(),yChange+this.getY(),zChange+this.getZ());
    }
}
