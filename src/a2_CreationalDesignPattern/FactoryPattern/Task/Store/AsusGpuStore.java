package a2_CreationalDesignPattern.FactoryPattern.Task.Store;

import a2_CreationalDesignPattern.FactoryPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.FactoryPattern.Task.Items.AsusGpu;

public class AsusGpuStore extends GpuStore {
    @Override
    public IComponent createGpu() {
        return new AsusGpu();
    }
}
