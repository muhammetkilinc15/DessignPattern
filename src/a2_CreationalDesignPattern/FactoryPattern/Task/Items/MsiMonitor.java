package a2_CreationalDesignPattern.FactoryPattern.Task.Items;
import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;

public class MsiMonitor implements IComponent {

	@Override
	public void assemble() {
		System.out.println("Msi Monitor is assembled");
	}
}
