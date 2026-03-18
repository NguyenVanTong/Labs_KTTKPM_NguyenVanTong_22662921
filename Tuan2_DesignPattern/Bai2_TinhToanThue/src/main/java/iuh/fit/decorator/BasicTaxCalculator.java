package iuh.fit.decorator;

import iuh.fit.strategy.TaxStrategy;

public class BasicTaxCalculator implements TaxCalculator {

    private TaxStrategy strategy;

    public BasicTaxCalculator(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double price) {
        return strategy.calculate(price);
    }
}
