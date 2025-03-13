package a2_CreationalDesignPattern.FactoryPattern;

import a2_CreationalDesignPattern.FactoryPattern.Abstract.IBurger;

public class Main {
    public static void main(String[] args) {

        BurgerStore vegBurgerStore = new VeganBurgerStore();
        IBurger newBurger = vegBurgerStore.PrepareBurger();
        newBurger.cook();


        BurgerStore chickenBurgerStore = new ChickenBurgerStore();
        IBurger newBurger2 = chickenBurgerStore.PrepareBurger();
        newBurger2.cook();
    }
}
