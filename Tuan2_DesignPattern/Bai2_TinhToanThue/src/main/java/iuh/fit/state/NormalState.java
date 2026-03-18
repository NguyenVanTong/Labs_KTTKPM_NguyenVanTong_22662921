package iuh.fit.state;

import iuh.fit.strategy.VATStrategy;

public class NormalState implements ProductState {
    public void handle(Product product) {
        System.out.println("Sản phẩm bình thường → áp dụng VAT");
        product.setStrategy(new VATStrategy());
    }
}
