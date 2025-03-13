package a1_SOLID_Principles.Concreate;

import Abstactions.IShape;

public class Circle implements IShape {

	private final int radius;

	public Circle(int radius) {
		this.radius=radius;
	}

	public int getRadius() {
		return this.radius;
	}

	@Override
	public double getArea() {
		return (int) (Math.PI * Math.pow(getRadius(),2));
	}
}
