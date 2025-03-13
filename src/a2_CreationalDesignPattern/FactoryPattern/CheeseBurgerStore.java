package a2_CreationalDesignPattern.FactoryPattern;

import a2_CreationalDesignPattern.FactoryPattern.Abstract.IBurger;

public class CheeseBurgerStore extends BurgerStore {

    @Override
    public IBurger PrepareBurger() {
        return new CheeseBurger();
    }
}
