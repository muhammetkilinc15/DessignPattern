package a1_SOLID_Principles.Concreate;

import a1_SOLID_Principles.Absractions.IShape;

public class Rectangle  implements IShape {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
