package iuh.fit.state;

import iuh.fit.strategy.TaxStrategy;

public class Product {
    private ProductState state;
    private TaxStrategy strategy;
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice() {
        return price;
    }

    public TaxStrategy getStrategy() {
        return strategy;
    }

    public double processTax() {
        state.handle(this);
        return strategy.calculate(price);
    }
}
