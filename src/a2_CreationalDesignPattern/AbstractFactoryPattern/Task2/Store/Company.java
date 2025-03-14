package a2_CreationalDesignPattern.Task2.Store;

import a2_CreationalDesignPattern.Task2.Abstract.IGpu;
import a2_CreationalDesignPattern.Task2.Abstract.IMonitor;

public  abstract  class Company {
    public  abstract IGpu createGpu();
    public  abstract IMonitor createMonitor();
}
