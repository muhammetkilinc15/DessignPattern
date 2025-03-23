package a2_CreationalDesignPattern.PrototypeDesignPattern.Examples.Example2;

interface Prototype {
    Car clone();
}

public class Car implements  Prototype{
    String brand;
    String model;
    String color;
    int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public  Car(Car car){
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}

class PrototypeMain{
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", "Black", 180);
        Car car2 = car1.clone();
        car2.color="Red";
        Car car3 = car2.clone();

        System.out.println(car1.brand + " " + car1.model + " " + car1.color + " " + car1.topSpeed);
        System.out.println(car2.brand + " " + car2.model + " " + car2.color + " " + car2.topSpeed);
        System.out.println(car3.brand + " " + car3.model + " " + car3.color + " " + car3.topSpeed);
    }
}

