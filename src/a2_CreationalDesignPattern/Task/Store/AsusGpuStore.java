package a2_CreationalDesignPattern.Task.Store;

import a2_CreationalDesignPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.Task2.AsusGpu;

public class AsusGpuStore extends  GpuStore{
    @Override
    public IComponent createGpu() {
        return new AsusGpu();
    }
}
