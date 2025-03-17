package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IGpu;
import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;

public class AsusGpu implements IGpu {

	@Override
	public void assemble() {
		System.out.println("Asus Gpu is assembled");
	}
}
