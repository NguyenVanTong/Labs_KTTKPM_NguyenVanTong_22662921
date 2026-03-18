package iuh.fit.decorator;

public class LoggingDecorator extends TaxDecorator {

    public LoggingDecorator(TaxCalculator calculator) {
        super(calculator);
    }

    public double calculate(double price) {
        System.out.println("Đang tính thuế cho giá: " + price);
        return super.calculate(price);
    }
}
