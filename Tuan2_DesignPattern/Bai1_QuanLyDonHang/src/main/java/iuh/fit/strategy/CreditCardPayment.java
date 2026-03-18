package iuh.fit.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Thanh toán bằng thẻ tín dụng");
    }
}