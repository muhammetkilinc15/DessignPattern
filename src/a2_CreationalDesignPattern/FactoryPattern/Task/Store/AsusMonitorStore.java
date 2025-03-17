package a2_CreationalDesignPattern.FactoryPattern.Task.Store;

import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.FactoryPattern.Task.Items.AsusMonitor;


public class AsusMonitorStore extends  MonitorStore{
    @Override
    public IComponent createMonitor() {
        return new AsusMonitor();
    }
}
