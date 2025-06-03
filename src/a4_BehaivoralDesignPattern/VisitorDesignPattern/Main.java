import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Product> cart = List.of(
	        new Book("Effective Java", 45.0),
	        new Electronics("Smartphone", 799.99),
	        new Clothing("Gucci Jacket", 250.0)
	    );

	    ProductVisitor taxVisitor = new TaxCalculatorVisitor();

	    for (Product product : cart) {
	        product.accept(taxVisitor);
	    }
	}
}


