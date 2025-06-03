package a4_BehaivoralDesignPattern.ObserverDesignPattern.Task;

public class Main {

	public static void main(String[] args) {
		Stock appleStock = new Stock("AAPL", 150.00);

        // Create observers
        StockObserver display = new StockDisplay();
        StockObserver logger = new StockLogger();
        StockObserver alert = new StockAlert(155.00);
        StockObserver newsService = new StockNewsService();

        // Register observers
        appleStock.addObserver(display);
        appleStock.addObserver(logger);
        appleStock.addObserver(alert);
        appleStock.addObserver(newsService);


        // Simulate price changes
        appleStock.setPrice(152.50);
        System.out.println("---");
        appleStock.setPrice(158.25);

	}

}
