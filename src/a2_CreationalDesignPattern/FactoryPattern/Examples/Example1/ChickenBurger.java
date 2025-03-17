package a2_CreationalDesignPattern.FactoryPattern.Examples.Example1;

import a2_CreationalDesignPattern.FactoryPattern.Examples.Example1.Abstract.IBurger;

public class ChickenBurger implements IBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Chicken Burger");
    }
}
