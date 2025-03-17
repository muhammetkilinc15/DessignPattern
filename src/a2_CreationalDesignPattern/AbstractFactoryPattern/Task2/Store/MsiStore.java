package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Store;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IGpu;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Abstract.IMonitor;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items.MsiGpu;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Items.MsiMonitor;


public class MsiStore extends Company {
    @Override
    public IGpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new MsiMonitor();
    }
}
