package factory;

/**
 * Car class - Concrete implementation
 */
public class Car extends Vehicle {
    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.wheels = 4;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== Car Information ===");
        System.out.println("Type: Car");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Features: Air conditioning, 5 seats, trunk space");
    }
}
