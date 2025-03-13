package a1_SOLID_Principles.Absractions;

import Abstactions.IShape;

import java.util.List;

public interface IAreaCalculator {
    int sum(List<IShape> shapes);
}
