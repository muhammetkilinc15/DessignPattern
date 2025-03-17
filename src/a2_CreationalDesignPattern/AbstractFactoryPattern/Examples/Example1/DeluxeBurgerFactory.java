package a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.ICheeseBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IChickenBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IVeganBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers.DeluxeCheese;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers.DeluxeChicken;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers.DeluxeVegan;

public class DeluxeBurgerFactory extends BurgerFactory {
    @Override
    public IVeganBurger createVeganBurger() {
        return new DeluxeVegan();
    }

    @Override
    public IChickenBurger createChickenBurger() {
        return new DeluxeChicken();
    }

    @Override
    public ICheeseBurger createCheeseBurger() {
        return new DeluxeCheese();
    }
}
