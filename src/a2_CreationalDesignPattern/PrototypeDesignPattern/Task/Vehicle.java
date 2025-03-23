package a2_CreationalDesignPattern.PrototypeDesignPattern.Task;

public abstract class Vehicle {
    public String brand;
    public String model;
    public String year;

    public Vehicle(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.year = vehicle.year;
    }

    public abstract Vehicle clone();
}


