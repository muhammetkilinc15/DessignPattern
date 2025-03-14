package a2_CreationalDesignPattern.Task.Store;

import a2_CreationalDesignPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.Task2.AsusMonitor;

public class AsusMonitorStore extends  MonitorStore{
    @Override
    public IComponent createMonitor() {
        return new AsusMonitor();
    }
}
