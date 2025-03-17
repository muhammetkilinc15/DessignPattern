package a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.ICheeseBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IChickenBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IVeganBurger;

public abstract class BurgerFactory {
    public abstract IVeganBurger createVeganBurger();

    public abstract IChickenBurger createChickenBurger();

    public abstract ICheeseBurger createCheeseBurger();
}
