package iuh.fit.state;

import iuh.fit.strategy.TaxStrategy;

public class TaxFreeState implements ProductState {
    public void handle(Product product) {
        System.out.println("Sản phẩm miễn thuế");
        product.setStrategy(price -> 0); // lambda strategy
    }
}
