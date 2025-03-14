package a2_CreationalDesignPattern.Task2;

import a2_CreationalDesignPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.Task2.Abstract.IGpu;

public class AsusGpu implements IGpu {

	@Override
	public void assemble() {
		System.out.println("Asus Gpu is assembled");
	}
}
