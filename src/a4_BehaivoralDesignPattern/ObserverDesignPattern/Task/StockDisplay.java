package a4_BehaivoralDesignPattern.ObserverDesignPattern.Task;

public class StockDisplay implements StockObserver {
    @Override
    public void update(String symbol, double price) {
        System.out.printf("DISPLAY: %s updated to $%.2f\n", symbol, price);
    }
}