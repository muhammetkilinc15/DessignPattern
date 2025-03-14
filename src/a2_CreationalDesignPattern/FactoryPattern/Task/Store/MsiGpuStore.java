package a2_CreationalDesignPattern.Task.Store;

import a2_CreationalDesignPattern.Task.Abstract.IComponent;
import a2_CreationalDesignPattern.Task2.MsiGpu;

public class MsiGpuStore  extends  GpuStore{
    @Override
    public IComponent createGpu() {
        return new MsiGpu();
    }
}
