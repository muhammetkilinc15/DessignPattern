package a2_CreationalDesignPattern.BuilderPattern.Task;

public class AmericanBreakfastBuilder implements Breakfastbuilder{

    public Breakfast breakfast;

    public AmericanBreakfastBuilder() {
        breakfast = new Breakfast();
    }
    @Override
    public void egg() {
        breakfast.setEgg(false);
    }

    @Override
    public void greenOlive() {
        breakfast.setGreenOlive(false);
    }

    @Override
    public void blackOlive() {
        breakfast.setBlackOlive(false);
    }

    @Override
    public void bread() {
        breakfast.setBread(false);
    }

    @Override
    public void erzincanBezTulum() {
        breakfast.setErzincanBezTulumCheese(false);
    }

    @Override
    public void jelly() {
        breakfast.setJelly(true);
    }

    @Override
    public void honey() {
        breakfast.setHoney(false);
    }

    @Override
    public void tea() {
        breakfast.setTea(false);
    }

    @Override
    public void coffee() {
        breakfast.setCoffee(true);
    }

    @Override
    public void peanutButter() {
        breakfast.setPeanutButter(true);
    }

    @Override
    public Breakfast build() {
        return breakfast;
    }
}
