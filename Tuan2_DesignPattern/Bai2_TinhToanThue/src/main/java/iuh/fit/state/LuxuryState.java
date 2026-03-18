package iuh.fit.state;

import iuh.fit.strategy.LuxuryTaxStrategy;

public class LuxuryState implements ProductState {
    public void handle(Product product) {
        System.out.println("Sản phẩm xa xỉ → thuế cao");
        product.setStrategy(new LuxuryTaxStrategy());
    }
}
