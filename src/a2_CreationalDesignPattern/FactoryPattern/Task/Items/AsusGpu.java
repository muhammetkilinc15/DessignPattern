package a2_CreationalDesignPattern.FactoryPattern.Task.Items;
import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;

public class AsusGpu implements IComponent {

	@Override
	public void assemble() {
		System.out.println("Asus Gpu is assembled");
	}
}
