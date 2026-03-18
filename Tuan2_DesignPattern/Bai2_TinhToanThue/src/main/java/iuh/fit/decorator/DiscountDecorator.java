package iuh.fit.decorator;

public class DiscountDecorator extends TaxDecorator {

    public DiscountDecorator(TaxCalculator calculator) {
        super(calculator);
    }

    public double calculate(double price) {
        double tax = super.calculate(price);
        System.out.println("Áp dụng giảm 10%");
        return tax * 0.9;
    }
}
