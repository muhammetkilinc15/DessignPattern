package a2_CreationalDesignPattern.FactoryPattern.Task.Items;
import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;
public class MsiGpu implements IComponent {
	@Override
	public void assemble() {
		System.out.println("Msi GPU is assembled!");
	}
}
