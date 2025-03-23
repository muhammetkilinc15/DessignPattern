package a2_CreationalDesignPattern.BuilderPattern.Task;

public class Director {
    private Breakfastbuilder breakfastBuilder;

    public Director(Breakfastbuilder breakfastBuilder) {
        this.breakfastBuilder = breakfastBuilder;
    }

    public Breakfast prepareBreakfast() {
        breakfastBuilder.egg();
        breakfastBuilder.greenOlive();
        breakfastBuilder.blackOlive();
        breakfastBuilder.bread();
        breakfastBuilder.erzincanBezTulum();
        breakfastBuilder.jelly();
        breakfastBuilder.honey();
        breakfastBuilder.tea();
        breakfastBuilder.coffee();
        breakfastBuilder.peanutButter();
        return breakfastBuilder.build();
    }
}
