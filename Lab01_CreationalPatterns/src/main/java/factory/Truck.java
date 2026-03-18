package factory;

/**
 * Truck class - Concrete implementation
 */
public class Truck extends Vehicle {
    private int capacity;
    
    public Truck(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.wheels = 6;
        this.capacity = capacity;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== Truck Information ===");
        System.out.println("Type: Truck");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Features: Heavy load, cargo space");
    }
}
