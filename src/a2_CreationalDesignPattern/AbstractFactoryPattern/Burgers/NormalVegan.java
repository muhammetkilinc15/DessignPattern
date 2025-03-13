package a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IVeganBurger;

public class NormalVegan implements IVeganBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Normal Vegan Burger");
    }
}

