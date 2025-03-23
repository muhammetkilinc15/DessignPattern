package a2_CreationalDesignPattern.BuilderPattern.Task;

public class TurkishBreakfastBuilder implements Breakfastbuilder {

    public Breakfast breakfast;

    public TurkishBreakfastBuilder() {
        breakfast = new Breakfast();
    }
    @Override
    public void egg() {
        breakfast.setEgg(true);
    }

    @Override
    public void greenOlive() {
        breakfast.setGreenOlive(true);
    }

    @Override
    public void blackOlive() {
        breakfast.setBlackOlive(true);
    }

    @Override
    public void bread() {
        breakfast.setBread(true);
    }

    @Override
    public void erzincanBezTulum() {
        breakfast.setErzincanBezTulumCheese(true);
    }

    @Override
    public void jelly() {
        breakfast.setJelly(false);
    }

    @Override
    public void honey() {
        breakfast.setHoney(true);
    }

    @Override
    public void tea() {
        breakfast.setTea(true);
    }

    @Override
    public void coffee() {
        breakfast.setCoffee(false);
    }

    @Override
    public void peanutButter() {
        breakfast.setPeanutButter(false);
    }

    @Override
    public Breakfast build() {
        return breakfast;
    }
}
