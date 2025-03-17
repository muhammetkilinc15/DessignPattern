package a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1;

import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.ICheeseBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IChickenBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Abstract.IVeganBurger;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers.NormalCheese;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers.NormalChicken;
import a2_CreationalDesignPattern.AbstractFactoryPattern.Examples.Example1.Burgers.NormalVegan;

public class NormalBurgerFactory extends BurgerFactory {
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
