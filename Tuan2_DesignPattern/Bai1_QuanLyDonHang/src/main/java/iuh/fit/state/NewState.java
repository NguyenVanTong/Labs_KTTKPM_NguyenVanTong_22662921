package iuh.fit.state;

public class NewState implements OrderState {
    public void handle(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng");
        order.setState(new ProcessingState());
    }
}