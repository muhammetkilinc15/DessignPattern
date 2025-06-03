
public class Book implements Product {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getTitle() { return title; }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
