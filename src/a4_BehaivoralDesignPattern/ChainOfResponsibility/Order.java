package a4_BehaivoralDesignPattern.ChainOfResponsibility;

// Chain of Responsibility - Behavioral Category

// StockControl -> Payment -> Invoice -> Shipping

// Request Object
public class Order {
    public String ProductName;
    public int Quantity;
    public double Price;

    public Order(String productName, int quantity, double price) {
        this.ProductName = productName;
        this.Quantity = quantity;
        this.Price = price;
    }
}

// Abstract Handler
interface IOrderHandler {
    boolean Handle(Order order);

    void SetNext(IOrderHandler handler);
}

abstract class BaseOrderHandler implements IOrderHandler {
    protected IOrderHandler nextHandler;

    @Override
    public void SetNext(IOrderHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean Handle(Order order) {
        if (nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }
}

class StockControl extends BaseOrderHandler {
    @Override
    public boolean Handle(Order order) {
        System.out.println("Stock Control is checking for " + order.ProductName);
        boolean stockAvailable = true; // Check Stock Service
        if (stockAvailable && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }
}

class PaymentControl extends BaseOrderHandler {
    @Override
    public boolean Handle(Order order) {
        System.out.println("Payment control is verifying the order for " + order.ProductName + " with quantity " + order.Quantity + " at price $" + order.Price + "...");
        boolean paymentDone = true; // Check Payment Service
        if (paymentDone && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }
}

class InvoiceControl extends BaseOrderHandler {
    @Override
    public boolean Handle(Order order) {
        System.out.println("Invoice Control is checking for " + order.ProductName);
        boolean invoiceDone = true;    // Check Invoice Service
        if (invoiceDone && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }
}

class ShippingControl extends BaseOrderHandler {
    @Override
    public boolean Handle(Order order) {
        System.out.println("Shipping Control is checking...");
        boolean shippingDone = true;     // Check Shipping Service
        if (shippingDone && nextHandler != null)
            return nextHandler.Handle(order);
        return false;
    }
}


class Main {
    public static void main(String[] args) {
        IOrderHandler stockControl = new StockControl();
        IOrderHandler paymentControl = new PaymentControl();
        IOrderHandler invoiceControl = new InvoiceControl();
        IOrderHandler shippingControl = new ShippingControl();

        // Set Chain of Responsibility
        stockControl.SetNext(paymentControl);
        paymentControl.SetNext(invoiceControl);
        invoiceControl.SetNext(shippingControl);

        Order order = new Order("Keyboard", 1, 100);
        stockControl.Handle(order);
    }
}

