package a2_CreationalDesignPattern.PrototypeDesignPattern.Task;

public class Car extends Vehicle{
    public int toSpeed;
    
    public Car(String brand, String model, String year, int toSpeed) {
        super(brand, model, year);
        this.toSpeed = toSpeed;
    }
    
    public Car(Car car) {
        super(car);
        this.toSpeed = car.toSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
