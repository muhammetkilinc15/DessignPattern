package a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.ICheeseBurger;

public class DeluxeCheese implements ICheeseBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Deluxe Cheese Burger");
    }
}

