package a1_SOLID_Principles;

import a1_SOLID_Principles.Absractions.IShape;
import a1_SOLID_Principles.Absractions.IAreaCalculator;
import a1_SOLID_Principles.Concreate.Circle;
import a1_SOLID_Principles.Concreate.Square;
import a1_SOLID_Principles.Concreate.Cube;
import a1_SOLID_Principles.ShapePrinter;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        ShapePrinter shapePrinter =  new ShapePrinter(areaCalculator);

        IShape circle = new Circle(10);
        IShape square = new Square(10);
        IShape cube = new Cube(10);

        List<IShape> shapes = List.of(circle,square,cube);

        int sum = areaCalculator.sum(shapes);


        System.out.println("sum = " + sum);
        System.out.println(shapePrinter.toCSV(shapes));
        System.out.println(shapePrinter.toJson(shapes));

    }
}