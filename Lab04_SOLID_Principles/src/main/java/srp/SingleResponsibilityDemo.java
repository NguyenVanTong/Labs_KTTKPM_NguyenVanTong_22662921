package srp;

/**
 * BAD EXAMPLE - Vi phạm Single Responsibility Principle
 * Class này có quá nhiều trách nhiệm
 */
class UserManagerBad {
    public void createUser(String username, String email) {
        // Validate user
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        
        // Save to database
        System.out.println("Saving user to database: " + username);
        
        // Send welcome email
        System.out.println("Sending welcome email to: " + email);
        
        // Log the action
        System.out.println("User created: " + username);
    }
}

/**
 * GOOD EXAMPLE - Tuân theo Single Responsibility Principle
 * Mỗi class có một trách nhiệm duy nhất
 */

// Class chỉ validate
class UserValidator {
    public boolean validate(String username, String email) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (email == null || !email.contains("@")) {
            return false;
        }
        return true;
    }
}

// Class chỉ lưu database
class UserRepository {
    public void save(String username, String email) {
        System.out.println("Saving user to database: " + username + " (" + email + ")");
        // Database logic here
    }
}

// Class chỉ gửi email
class EmailService {
    public void sendWelcomeEmail(String email) {
        System.out.println("Sending welcome email to: " + email);
        // Email sending logic here
    }
}

// Class chỉ log
class UserLogger {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

// Manager class orchestrates các services
class UserManagerGood {
    private UserValidator validator;
    private UserRepository repository;
    private EmailService emailService;
    private UserLogger logger;
    
    public UserManagerGood() {
        this.validator = new UserValidator();
        this.repository = new UserRepository();
        this.emailService = new EmailService();
        this.logger = new UserLogger();
    }
    
    public void createUser(String username, String email) {
        // Validate
        if (!validator.validate(username, email)) {
            logger.log("Invalid user data");
            throw new IllegalArgumentException("Invalid user data");
        }
        
        // Save
        repository.save(username, email);
        
        // Send email
        emailService.sendWelcomeEmail(email);
        
        // Log
        logger.log("User created successfully: " + username);
    }
}

/**
 * Demo class
 */
public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        System.out.println("=== SINGLE RESPONSIBILITY PRINCIPLE DEMO ===\n");
        
        System.out.println("1. BAD EXAMPLE - All in one class:");
        try {
            UserManagerBad badManager = new UserManagerBad();
            badManager.createUser("tongnguyenvan", "tong@iuh.edu.vn");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n2. GOOD EXAMPLE - Separated responsibilities:");
        try {
            UserManagerGood goodManager = new UserManagerGood();
            goodManager.createUser("tongnguyenvan", "tong@iuh.edu.vn");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n=== Benefits of SRP ===");
        System.out.println("1. Mỗi class dễ hiểu và maintain");
        System.out.println("2. Dễ dàng test từng class riêng biệt");
        System.out.println("3. Thay đổi một trách nhiệm không ảnh hưởng các trách nhiệm khác");
        System.out.println("4. Code reusable - có thể sử dụng EmailService ở nơi khác");
    }
}
