package decorator;

/**
 * Component Interface
 */
interface Coffee {
    String getDescription();
    double getCost();
}

/**
 * Concrete Component
 */
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Cà phê đen (Simple Coffee)";
    }
    
    @Override
    public double getCost() {
        return 15000; // 15k VND
    }
}

/**
 * Abstract Decorator
 */
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

/**
 * Concrete Decorators
 */
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Sữa (Milk)";
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 5000; // +5k
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Đường (Sugar)";
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2000; // +2k
    }
}

class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Kem (Whipped Cream)";
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 8000; // +8k
    }
}

class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Vani (Vanilla)";
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 6000; // +6k
    }
}

/**
 * Demo class
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("=== DECORATOR PATTERN DEMO ===\n");
        
        // Simple coffee
        Coffee coffee1 = new SimpleCoffee();
        printCoffee(coffee1);
        
        // Coffee with milk
        Coffee coffee2 = new MilkDecorator(new SimpleCoffee());
        printCoffee(coffee2);
        
        // Coffee with milk and sugar
        Coffee coffee3 = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        printCoffee(coffee3);
        
        // Fancy coffee - milk, sugar, whipped cream, vanilla
        Coffee coffee4 = new VanillaDecorator(
                            new WhippedCreamDecorator(
                                new SugarDecorator(
                                    new MilkDecorator(
                                        new SimpleCoffee()))));
        printCoffee(coffee4);
        
        System.out.println("\n=== Decorator Pattern Benefits ===");
        System.out.println("1. Thêm chức năng mới mà không thay đổi code gốc");
        System.out.println("2. Linh hoạt hơn inheritance - có thể thêm/bớt tính năng runtime");
        System.out.println("3. Single Responsibility - mỗi decorator chỉ thêm 1 tính năng");
        System.out.println("4. Có thể kết hợp nhiều decorators theo bất kỳ thứ tự nào");
    }
    
    private static void printCoffee(Coffee coffee) {
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: " + String.format("%,.0f", coffee.getCost()) + " VND");
        System.out.println();
    }
}
