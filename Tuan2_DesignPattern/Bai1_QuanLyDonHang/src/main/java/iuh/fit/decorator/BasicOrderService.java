package iuh.fit.decorator;


public class BasicOrderService implements OrderService {
    public void process() {
        System.out.println("Xử lý đơn hàng cơ bản");
    }
}
