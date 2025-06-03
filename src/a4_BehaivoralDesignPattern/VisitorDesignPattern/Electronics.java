public class Electronics implements Product {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}

