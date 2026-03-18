package iuh.fit.strategy;

public class ConsumptionTaxStrategy implements TaxStrategy {
    public double calculate(double price) {
        return price * 0.05; // 5%
    }
}
