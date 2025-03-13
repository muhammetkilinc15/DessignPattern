package a1_SOLID_Principles;

import Abstactions.IShape;
import a1_SOLID_Principles.Absractions.IAreaCalculator;

import java.util.List;

public class ShapePrinter {
    private IAreaCalculator areaCalculator;

    public ShapePrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String toCSV(List<IShape> shapes) {
        return "sum = " + areaCalculator.sum(shapes);
    }

    public String toJson(List<IShape> shapes) {
        return "{ \"sum\": " + areaCalculator.sum(shapes) + " }";
    }
}
