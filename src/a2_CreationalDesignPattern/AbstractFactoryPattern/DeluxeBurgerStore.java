package a2_CreationalDesignPattern.AbstractFactoryPattern;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.ICheeseBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IChickenBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IVeganBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers.DeluxeCheese;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers.DeluxeChicken;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers.DeluxeVegan;

public class  DeluxeBurgerStore  extends  BurgerStore{
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
