package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Store;


import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IGpu;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IMonitor;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items.AsusGpu;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items.AsusMonitor;


public class AsusStore extends Company{
    @Override
    public IGpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new AsusMonitor();
    }
}
