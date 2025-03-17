package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IMonitor;
import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;

public class AsusMonitor implements IMonitor {
	@Override
	public void assemble() {
		System.out.println("Assembling Asus Monitor");
	}
}
