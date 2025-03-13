package a1_SOLID_Principles.Concreate;

import Abstactions.IShape;

public class Square implements IShape {

	private final int length;
	
	public Square(int length) {
		this.length=length;
	}
	
	public int getLength() {
		return this.length;
	}

	@Override
	public double getArea() {
		return (int) Math.pow(getLength(),2);
	}
}
