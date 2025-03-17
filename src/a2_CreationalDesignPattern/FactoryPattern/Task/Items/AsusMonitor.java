package a2_CreationalDesignPattern.FactoryPattern.Task.Items;


import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;

public class AsusMonitor implements IComponent {
	@Override
	public void assemble() {
		System.out.println("Assembling Asus Monitor");
	}
}
