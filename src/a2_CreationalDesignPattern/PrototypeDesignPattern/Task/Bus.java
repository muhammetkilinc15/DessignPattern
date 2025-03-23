package a2_CreationalDesignPattern.PrototypeDesignPattern.Task;

public class  Bus extends Vehicle{
    public int seatCount;
    public Bus(String brand, String model, String year, int seatCount) {
        super(brand, model, year);
        this.seatCount = seatCount;
    }

    public Bus(Bus bus) {
        super(bus);
        this.seatCount = bus.seatCount;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
