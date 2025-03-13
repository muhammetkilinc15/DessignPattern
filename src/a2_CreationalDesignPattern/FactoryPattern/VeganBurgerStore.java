package a2_CreationalDesignPattern.FactoryPattern;

import a2_CreationalDesignPattern.FactoryPattern.Abstract.IBurger;

public class VeganBurgerStore extends BurgerStore {

    @Override
    public IBurger PrepareBurger() {
        return new VeganBurger();
    }
}
