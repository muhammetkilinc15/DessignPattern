package a2_CreationalDesignPattern.Task2.Store;

import a2_CreationalDesignPattern.Task2.Abstract.IGpu;
import a2_CreationalDesignPattern.Task2.Abstract.IMonitor;
import a2_CreationalDesignPattern.Task2.MsiGpu;
import a2_CreationalDesignPattern.Task2.MsiMonitor;

public class MsiStore extends Company{
    @Override
    public IGpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new MsiMonitor();
    }
}
