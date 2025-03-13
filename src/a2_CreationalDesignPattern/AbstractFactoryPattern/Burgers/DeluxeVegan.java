package a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IVeganBurger;

public  class  DeluxeVegan implements IVeganBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Deluxe Vegan Burger");
    }
}
