public class TaxCalculatorVisitor implements ProductVisitor {

    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + " - Tax: $0.00 (Tax Exempt)");
    }

    @Override
    public void visit(Electronics electronics) {
        double tax = electronics.getPrice() * 0.15;
        System.out.printf("Electronics: %s - Tax: $%.2f\n", electronics.getName(), tax);
    }

    @Override
    public void visit(Clothing clothing) {
        double taxRate = clothing.getPrice() > 100 ? 0.10 : 0.05;
        double tax = clothing.getPrice() * taxRate;
        System.out.printf("Clothing: %s - Tax: $%.2f\n", clothing.getBrand(), tax);
    }
}
