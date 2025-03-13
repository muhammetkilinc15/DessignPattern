package a2_CreationalDesignPattern.FactoryPattern;

import a2_CreationalDesignPattern.FactoryPattern.Abstract.IBurger;

public class ChickenBurger implements IBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Chicken Burger");
    }
}
