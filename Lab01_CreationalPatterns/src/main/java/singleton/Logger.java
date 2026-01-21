package singleton;

/**
 * Singleton Pattern - Logger Example
 * Thread-safe với Double-Checked Locking
 */
public class Logger {
    private static volatile Logger instance;
    private StringBuilder logs;
    
    private Logger() {
        logs = new StringBuilder();
        System.out.println("Logger initialized");
    }
    
    // Double-Checked Locking để tối ưu performance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    public void log(String message) {
        String logEntry = "[" + System.currentTimeMillis() + "] " + message;
        logs.append(logEntry).append("\n");
        System.out.println(logEntry);
    }
    
    public String getLogs() {
        return logs.toString();
    }
}
