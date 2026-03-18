package iuh.fit.decorator;

public class LoggingDecorator extends OrderDecorator {

    public LoggingDecorator(OrderService service) {
        super(service);
    }

    public void process() {
        System.out.println("Log: bắt đầu xử lý");
        super.process();
    }
}
