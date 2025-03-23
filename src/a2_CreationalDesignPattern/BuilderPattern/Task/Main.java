package a2_CreationalDesignPattern.BuilderPattern.Task;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Director director1 = new Director(new TurkishBreakfastBuilder());
        Director director2 = new Director(new AmericanBreakfastBuilder());

        Breakfast turkishBreakfast = director1.prepareBreakfast();
        Breakfast americanBreakfast = director2.prepareBreakfast();

        System.out.println(turkishBreakfast.toString());
        System.out.println("--------------------------");
        System.out.println(americanBreakfast.toString());
    }
}
