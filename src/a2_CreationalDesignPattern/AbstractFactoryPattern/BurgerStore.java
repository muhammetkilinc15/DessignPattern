package a2_CreationalDesignPattern.AbstractFactoryPattern;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.ICheeseBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IChickenBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IVeganBurger;

public abstract class BurgerStore {
    public abstract IVeganBurger createVeganBurger();
    public  abstract IChickenBurger createChickenBurger();
    public  abstract ICheeseBurger createCheeseBurger();
}
