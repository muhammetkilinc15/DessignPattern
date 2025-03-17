package a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IChickenBurger;

public  class  DeluxeChicken  implements IChickenBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Deluxe Chicken Burger");
    }
}
