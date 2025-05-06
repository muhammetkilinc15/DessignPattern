package a4_BehaivoralDesignPattern.ChainOfResponsibility;

// Chain of Responsibility - Behavioral Category

// StockControl -> Payment -> Invoice -> Shipping

import java.util.Random;


class PaymentControl implements IOrderHandler {
    private  IOrderHandler nextHandler;

    public PaymentControl(IOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean Handle(Order order) {
        System.out.println("Payment Control is checking...");
        boolean paymentDone = true; // Check Payment Service
        if (paymentDone && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }

    @Override
    public void SetNext(IOrderHandler handler) {
    this.nextHandler = handler;
    }

}
class InvoiceControl implements IOrderHandler {
    private  IOrderHandler nextHandler;

    public InvoiceControl(IOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean Handle(Order order) {
        System.out.println("Invoice Control is checking...");
        boolean invoiceDone = true;    // Check Invoice Service
        if (invoiceDone && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }

    @Override
    public void SetNext(IOrderHandler handler) {
        this.nextHandler = handler;
    }
}
class ShippingControl implements IOrderHandler {
    private IOrderHandler nextHandler;

    public ShippingControl(IOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean Handle(Order order) {
        System.out.println("Shipping Control is checking...");
        boolean shippingDone = true;     // Check Shipping Service
        if (shippingDone && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }

    @Override
    public void SetNext(IOrderHandler handler) {
        this.nextHandler = handler;
    }
}
class StockControl implements IOrderHandler {
    private IOrderHandler nextHandler;
    public StockControl(IOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean Handle(Order order) {
        System.out.println("Stock Control is checking...");
        boolean stockAvailable = true; // Check Stock Service
        if (stockAvailable && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }

    @Override
    public void SetNext(IOrderHandler handler) {
        this.nextHandler = handler;
    }
}

// Abstract Handler
interface IOrderHandler {
    boolean Handle(Order order);
    void SetNext(IOrderHandler handler);
}

public class Order {
    public String ProductName;
    public int Quantity;
    public double Price;

    public Order(String productName, int quantity, double price) {
        this.ProductName = productName;
        this.Quantity = quantity;
        this.Price = price;
    }

    Order(){
    }
}

class Main {
    public static void main(String[] args) {
        IOrderHandler stockControl = new StockControl(null);
        IOrderHandler paymentControl = new PaymentControl(null);
        IOrderHandler invoiceControl = new InvoiceControl(null);
        IOrderHandler shippingControl = new ShippingControl(null);

        // Set Chain of Responsibility
        stockControl.SetNext(paymentControl);
        paymentControl.SetNext(invoiceControl);
        invoiceControl.SetNext(shippingControl);


        Order order = new Order("Keyboard", 1, 100);
        stockControl.Handle(order);
    }
}

