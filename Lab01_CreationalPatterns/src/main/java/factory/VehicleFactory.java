package factory;

/**
 * Factory class để tạo các loại Vehicle
 * Factory Pattern implementation
 */
public class VehicleFactory {
    
    public static Vehicle createVehicle(String type, String brand, String model) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        
        switch (type.toLowerCase()) {
            case "car":
                return new Car(brand, model);
            case "bike":
                return new Bike(brand, model);
            case "truck":
                return new Truck(brand, model, 10); // Default capacity
            default:
                System.out.println("Unknown vehicle type: " + type);
                return null;
        }
    }
    
    // Overloaded method for Truck with custom capacity
    public static Vehicle createTruck(String brand, String model, int capacity) {
        return new Truck(brand, model, capacity);
    }
}
