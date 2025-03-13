package a1_SOLID_Principles;

import Abstactions.IShape;
import a1_SOLID_Principles.Absractions.IAreaCalculator;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(List<IShape> shapes) {
        int sum = 0;
        for (IShape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}



