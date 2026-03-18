package iuh.fit;

import iuh.fit.state.*;
import iuh.fit.decorator.*;

public class Main {
    public static void main(String[] args) {

        // ===== STATE + STRATEGY =====
        Product product = new Product(1000);

        product.setState(new NormalState());
        double tax = product.processTax();
        System.out.println("Thuế: " + tax);

        product.setState(new LuxuryState());
        tax = product.processTax();
        System.out.println("Thuế: " + tax);

        product.setState(new TaxFreeState());
        tax = product.processTax();
        System.out.println("Thuế: " + tax);

        // ===== DECORATOR =====
        System.out.println("\n--- Decorator ---");

        TaxCalculator calculator =
                new BasicTaxCalculator(product.getStrategy());

        calculator = new LoggingDecorator(calculator);
        calculator = new DiscountDecorator(calculator);

        double finalTax = calculator.calculate(1000);
        System.out.println("Thuế sau xử lý: " + finalTax);
    }
}