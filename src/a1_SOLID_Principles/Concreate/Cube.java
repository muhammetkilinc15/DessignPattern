package a1_SOLID_Principles.Concreate;
import a1_SOLID_Principles.Absractions.IThreeDimensionalShape;

public class Cube implements IThreeDimensionalShape {
    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
    @Override
    public double getArea() {
        return (int) (6 * Math.pow(getLength(), 2));
    }
    @Override
    public double getVolume() {
        return (int) Math.pow(getLength(), 3);
    }
}
