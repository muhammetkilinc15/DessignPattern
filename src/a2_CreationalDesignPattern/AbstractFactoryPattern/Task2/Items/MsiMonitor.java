package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IMonitor;

public class MsiMonitor implements IMonitor {

	@Override
	public void assemble() {
		System.out.println("Msi Monitor is assembled");
	}
}
