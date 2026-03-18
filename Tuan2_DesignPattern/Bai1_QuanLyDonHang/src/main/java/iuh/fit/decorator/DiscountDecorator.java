package iuh.fit.decorator;

public class DiscountDecorator extends OrderDecorator {

    public DiscountDecorator(OrderService service) {
        super(service);
    }

    public void process() {
        super.process();
        System.out.println("Áp dụng giảm giá");
    }
}
