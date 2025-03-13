package a1_SOLID_Principles;

import Abstactions.IShape;
import Concreate.Circle;
import Concreate.Cube;
import Concreate.Square;
import a1_SOLID_Principles.Absractions.IAreaCalculator;

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