package iuh.fit.state;

public class CancelledState implements OrderState {
    public void handle(Order order) {
        System.out.println("Hủy đơn và hoàn tiền");
    }
}