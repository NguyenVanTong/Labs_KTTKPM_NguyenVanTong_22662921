package strategy;

/**
 * Strategy Interface
 */
interface PaymentStrategy {
    void pay(double amount);
}

/**
 * Concrete Strategies
 */
class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + String.format("%,.0f", amount) + " VND bằng Tiền mặt");
        System.out.println("✓ Giao dịch hoàn tất!");
    }
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;
    
    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + String.format("%,.0f", amount) + " VND bằng Thẻ tín dụng");
        System.out.println("Card: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Holder: " + cardHolder);
        System.out.println("✓ Giao dịch thành công!");
    }
}

class MoMoPayment implements PaymentStrategy {
    private String phoneNumber;
    
    public MoMoPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + String.format("%,.0f", amount) + " VND qua MoMo");
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("✓ Thanh toán MoMo thành công!");
    }
}

class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;
    private String bankName;
    
    public BankTransferPayment(String bankAccount, String bankName) {
        this.bankAccount = bankAccount;
        this.bankName = bankName;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Chuyển khoản " + String.format("%,.0f", amount) + " VND");
        System.out.println("Ngân hàng: " + bankName);
        System.out.println("Tài khoản: " + bankAccount);
        System.out.println("✓ Chuyển khoản thành công!");
    }
}

/**
 * Context - Shopping Cart
 */
class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("❌ Vui lòng chọn phương thức thanh toán!");
            return;
        }
        
        System.out.println("\n=== Thanh toán đơn hàng ===");
        System.out.println("Tổng tiền: " + String.format("%,.0f", amount) + " VND");
        paymentStrategy.pay(amount);
        System.out.println("========================\n");
    }
}

/**
 * Demo class
 */
public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println("=== STRATEGY PATTERN DEMO ===\n");
        
        ShoppingCart cart = new ShoppingCart();
        
        // Thanh toán bằng tiền mặt
        System.out.println("1. Khách hàng chọn thanh toán tiền mặt:");
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(150000);
        
        // Thanh toán bằng thẻ tín dụng
        System.out.println("2. Khách hàng chọn thanh toán thẻ:");
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "Nguyen Van Tong"));
        cart.checkout(250000);
        
        // Thanh toán qua MoMo
        System.out.println("3. Khách hàng chọn thanh toán MoMo:");
        cart.setPaymentStrategy(new MoMoPayment("0123456789"));
        cart.checkout(180000);
        
        // Thanh toán chuyển khoản
        System.out.println("4. Khách hàng chọn chuyển khoản:");
        cart.setPaymentStrategy(new BankTransferPayment("123456789", "VietcomBank"));
        cart.checkout(500000);
        
        System.out.println("\n=== Strategy Pattern Benefits ===");
        System.out.println("1. Định nghĩa họ các thuật toán có thể thay thế lẫn nhau");
        System.out.println("2. Dễ thêm strategy mới mà không sửa code cũ");
        System.out.println("3. Tách biệt implementation khỏi code sử dụng nó");
        System.out.println("4. Client có thể chọn strategy runtime");
    }
}
