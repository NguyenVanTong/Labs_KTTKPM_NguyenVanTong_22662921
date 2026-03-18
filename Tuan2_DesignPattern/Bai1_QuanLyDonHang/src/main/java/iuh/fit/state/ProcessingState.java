package iuh.fit.state;

public class ProcessingState implements OrderState {
    public void handle(Order order) {
        System.out.println("Đóng gói và vận chuyển");
        order.setState(new DeliveredState());
    }
}