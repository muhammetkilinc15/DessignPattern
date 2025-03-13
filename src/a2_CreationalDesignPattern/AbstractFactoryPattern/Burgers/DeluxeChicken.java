package a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IChickenBurger;

public  class  DeluxeChicken  implements IChickenBurger {
    @Override
    public void cook() {
        System.out.println("Cooking Deluxe Chicken Burger");
    }
}
