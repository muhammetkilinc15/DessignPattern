package a2_CreationalDesignPattern.PrototypeDesignPattern.Task;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("BMW", "X5", "2020", 250);
        Vehicle bus1 = new Bus("Mercedes", "Sprinter", "2019", 20);

        Vehicle car2 = car1.clone();

        System.out.println(car1.brand);
        System.out.println(car2.brand);


    }
}
