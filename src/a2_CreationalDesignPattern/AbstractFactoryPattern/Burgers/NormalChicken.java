package a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IChickenBurger;

public  class NormalChicken implements IChickenBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Normal Chicken Burger");
    }
}
