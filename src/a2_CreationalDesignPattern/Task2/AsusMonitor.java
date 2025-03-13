package a2_CreationalDesignPattern.Task2;

import a2_CreationalDesignPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.Task2.Abstract.IMonitor;

public class AsusMonitor implements IComponent {


	@Override
	public void assemble() {
		System.out.println("Assembling Asus Monitor");
	}
}
