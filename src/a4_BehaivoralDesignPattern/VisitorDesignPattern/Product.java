package a4_BehaivoralDesignPattern.VisitorDesignPattern;

public interface Product {

	void accept(ProductVisitor visitor);
	
}
