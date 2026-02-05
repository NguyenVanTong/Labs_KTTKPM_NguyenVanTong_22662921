package singleton;

/**
 * Singleton Pattern - Database Connection Example
 * Đảm bảo chỉ có một kết nối database duy nhất
 */
public class DatabaseConnection {
    // Static instance của class
    private static DatabaseConnection instance;
    private String connectionString;
    
    // Private constructor để ngăn khởi tạo từ bên ngoài
    private DatabaseConnection() {
        // Giả lập việc tạo kết nối database
        this.connectionString = "jdbc:mysql://localhost:3306/iuh_db";
        System.out.println("Database Connection created: " + connectionString);
    }
    
    // Synchronized method để đảm bảo thread-safe
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
    
    public String getConnectionString() {
        return connectionString;
    }
}
