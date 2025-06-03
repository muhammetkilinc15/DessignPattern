public class Clothing implements Product {
    private String brand;
    private double price;

    public Clothing(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getBrand() { return brand; }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}

