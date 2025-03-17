package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IGpu;

public class AsusGpu implements IGpu {

	@Override
	public void assemble() {
		System.out.println("Asus Gpu is assembled");
	}
}
