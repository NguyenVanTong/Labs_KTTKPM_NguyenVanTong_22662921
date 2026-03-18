package factory;

/**
 * Demo class để test Factory Pattern
 */
public class FactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== FACTORY PATTERN DEMO ===\n");
        
        // Tạo Car thông qua Factory
        Vehicle car = VehicleFactory.createVehicle("car", "Toyota", "Camry");
        if (car != null) {
            car.displayInfo();
            car.start();
            System.out.println();
        }
        
        // Tạo Bike thông qua Factory
        Vehicle bike = VehicleFactory.createVehicle("bike", "Honda", "Wave");
        if (bike != null) {
            bike.displayInfo();
            bike.start();
            System.out.println();
        }
        
        // Tạo Truck thông qua Factory
        Vehicle truck = VehicleFactory.createTruck("Hino", "500 Series", 15);
        if (truck != null) {
            truck.displayInfo();
            truck.start();
            System.out.println();
        }
        
        // Test với invalid type
        Vehicle unknown = VehicleFactory.createVehicle("plane", "Boeing", "747");
        if (unknown == null) {
            System.out.println("Failed to create vehicle - unknown type\n");
        }
        
        System.out.println("=== Factory Pattern Benefits ===");
        System.out.println("1. Client không cần biết chi tiết implementation của từng vehicle");
        System.out.println("2. Dễ dàng thêm vehicle types mới mà không ảnh hưởng client code");
        System.out.println("3. Tập trung logic khởi tạo ở một nơi");
    }
}
