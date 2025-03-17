package a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IVeganBurger;

public class NormalVegan implements IVeganBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Normal Vegan Burger");
    }
}

