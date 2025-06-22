package a4_BehaivoralDesignPattern.IteratorDesignPattern;


import java.util.*;

public interface IIterator<T> {
    boolean hasNext();
    T next();
    void reset();
    int currentPosition();
}

class ConcreteIterator<T> implements IIterator<T> {
    private final ConcreteCollection<T> collection;
    private int position = 0;

    public ConcreteIterator(ConcreteCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return collection.get(position++);
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public int currentPosition() {
        return position;
    }
}


interface IterableCollection<T> {
    IIterator<T> createIterator();
}

class ConcreteCollection<T> implements IterableCollection<T> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    @Override
    public IIterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}


class Client {
    public static void main(String[] args) {
        ConcreteCollection<Product> products = new ConcreteCollection<>();

        products.add(new Product("Laptop", 1000.0));
        products.add(new Product("Tablet", 500.0));
        products.add(new Product("Smartphone", 800.0));
        products.add(new Product("Monitor", 300.0));

        IIterator<Product> iterator = products.createIterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product: " + product.name + ", Price: $" + product.price);
        }
    }
}
