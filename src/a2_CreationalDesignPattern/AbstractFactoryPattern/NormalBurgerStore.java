package a2_CreationalDesignPattern.AbstractFactoryPattern;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.ICheeseBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IChickenBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Abstract.IVeganBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers.NormalCheese;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers.NormalChicken;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Burgers.NormalVegan;

public class NormalBurgerStore extends BurgerStore {
    @Override
    public IVeganBurger createVeganBurger() {
        return new NormalVegan();
    }

    @Override
    public IChickenBurger createChickenBurger() {
        return new NormalChicken();
    }

    @Override
    public ICheeseBurger createCheeseBurger() {
        return new NormalCheese();
    }
}
