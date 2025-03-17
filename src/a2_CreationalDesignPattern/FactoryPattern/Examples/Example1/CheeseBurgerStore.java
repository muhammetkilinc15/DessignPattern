package a2_CreationalDesignPattern.FactoryPattern.Examples.Example1;

import a2_CreationalDesignPattern.FactoryPattern.Examples.Example1.Abstract.IBurger;

public class CheeseBurgerStore extends BurgerStore {

    @Override
    public IBurger PrepareBurger() {
        return new CheeseBurger();
    }
}
