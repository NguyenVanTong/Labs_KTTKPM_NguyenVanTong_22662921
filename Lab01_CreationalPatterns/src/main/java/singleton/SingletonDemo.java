package singleton;

/**
 * Demo class để test Singleton Pattern
 */
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("=== SINGLETON PATTERN DEMO ===\n");
        
        // Test DatabaseConnection Singleton
        System.out.println("1. Testing DatabaseConnection Singleton:");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        System.out.println("db1 == db2: " + (db1 == db2)); // Should be true
        db1.executeQuery("SELECT * FROM students WHERE mssv='22662921'");
        
        System.out.println("\n2. Testing Logger Singleton:");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        System.out.println("logger1 == logger2: " + (logger1 == logger2)); // Should be true
        logger1.log("Application started");
        logger2.log("User logged in");
        logger1.log("Processing request");
        
        System.out.println("\n3. All logs:");
        System.out.println(logger1.getLogs());
    }
}
