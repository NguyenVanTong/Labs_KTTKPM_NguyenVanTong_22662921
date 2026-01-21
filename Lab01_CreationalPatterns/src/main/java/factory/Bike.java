package factory;

/**
 * Bike class - Concrete implementation
 */
public class Bike extends Vehicle {
    
    public Bike(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.wheels = 2;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== Bike Information ===");
        System.out.println("Type: Bike/Motorcycle");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Features: Fuel efficient, easy parking");
    }
}
