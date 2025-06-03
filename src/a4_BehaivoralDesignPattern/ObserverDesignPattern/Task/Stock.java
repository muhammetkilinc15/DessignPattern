package a4_BehaivoralDesignPattern.ObserverDesignPattern.Task;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private double price;
    private List<StockObserver> observers = new ArrayList<StockObserver>();
    
    public Stock(String symbol, double initialPrice) {
        this.symbol = symbol;
        this.price = initialPrice;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(symbol, price);
        }
    }
}
