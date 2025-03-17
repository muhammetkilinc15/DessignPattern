package a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.ICheeseBurger;

public  class NormalCheese implements ICheeseBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Normal Cheese Burger");
    }
}
