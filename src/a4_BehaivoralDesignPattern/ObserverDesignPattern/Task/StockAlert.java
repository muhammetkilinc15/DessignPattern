package a4_BehaivoralDesignPattern.ObserverDesignPattern.Task;

public class StockAlert implements StockObserver {
    private double threshold;

    public StockAlert(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String symbol, double price) {
        if (price > threshold) {
            System.out.printf("ALERT: %s crossed threshold! Current price: $%.2f\n", symbol, price);
        }
    }
}