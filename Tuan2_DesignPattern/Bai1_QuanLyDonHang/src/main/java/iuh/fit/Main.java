package iuh.fit;

import iuh.fit.state.*;
import iuh.fit.strategy.*;
import iuh.fit.decorator.*;

public class Main {
    public static void main(String[] args) {

        // ===== STATE =====
        Order order = new Order();
        order.setState(new NewState());

        order.process();
        order.process();
        order.process();

        // ===== STRATEGY =====
        PaymentStrategy payment = new CreditCardPayment();
        payment.pay();

        payment = new PaypalPayment();
        payment.pay();

        // ===== DECORATOR =====
        OrderService service = new BasicOrderService();
        service = new LoggingDecorator(service);
        service = new DiscountDecorator(service);

        service.process();
    }
}