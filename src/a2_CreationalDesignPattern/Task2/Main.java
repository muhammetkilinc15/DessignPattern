package a2_CreationalDesignPattern.Task2;

import a2_CreationalDesignPattern.Task2.Abstract.IComponent;
import a2_CreationalDesignPattern.Task2.Abstract.IGpu;
import a2_CreationalDesignPattern.Task2.Store.AsusStore;
import a2_CreationalDesignPattern.Task2.Store.Company;

public class Main {

    public static void main(String[] args) {
        Company asusCompany = new AsusStore();
        Company msiCompany = new AsusStore();

        IComponent gpu = asusCompany.createGpu();

        gpu.assemble();

    }
}
