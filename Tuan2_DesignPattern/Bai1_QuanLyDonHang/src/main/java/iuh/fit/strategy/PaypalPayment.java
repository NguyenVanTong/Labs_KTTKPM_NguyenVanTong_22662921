package iuh.fit.strategy;

public class PaypalPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Thanh toán bằng Paypal");
    }
}
