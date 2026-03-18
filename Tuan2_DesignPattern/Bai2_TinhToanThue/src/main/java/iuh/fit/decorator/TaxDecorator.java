package iuh.fit.decorator;

public abstract class TaxDecorator implements TaxCalculator {
    protected TaxCalculator calculator;

    public TaxDecorator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculate(double price) {
        return calculator.calculate(price);
    }
}
