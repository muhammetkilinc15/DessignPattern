package a2_CreationalDesignPattern.AbstractFactoryPattern.Task2;


import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Store.AsusStore;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Task2.Store.Company;

public class Main {

    public static void main(String[] args) {
        Company asusCompany = new AsusStore();
        Company msiCompany = new AsusStore();

        asusCompany.createGpu().assemble(); // Asus Gpu Assembled
        asusCompany.createMonitor().assemble(); // Asus Monitor Assembled

        msiCompany.createMonitor().assemble();
        msiCompany.createGpu().assemble();


    }
}
