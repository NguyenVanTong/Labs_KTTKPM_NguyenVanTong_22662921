package iuh.fit.state;

public class DeliveredState implements OrderState {
    public void handle(Order order) {
        System.out.println("Đơn hàng đã giao");
    }
}
