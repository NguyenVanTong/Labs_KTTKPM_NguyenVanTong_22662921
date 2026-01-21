package builder;

/**
 * Demo class để test Builder Pattern
 */
public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("=== BUILDER PATTERN DEMO ===\n");
        
        // Build một meal đơn giản - chỉ có main course
        System.out.println("1. Simple Meal:");
        Meal simpleMeal = new Meal.MealBuilder("Phở Bò")
                .build();
        simpleMeal.displayMeal();
        
        System.out.println("\n2. Complete Meal with all options:");
        // Build một meal đầy đủ với nhiều options
        Meal completeMeal = new Meal.MealBuilder("Cơm Tấm Sườn Bì Chả")
                .appetizer("Gỏi Cuốn")
                .side("Dưa Chua")
                .drink("Trà Đá")
                .dessert("Chè Ba Màu")
                .spicy(true)
                .quantity(2)
                .build();
        completeMeal.displayMeal();
        
        System.out.println("\n3. Custom Meal:");
        // Build một meal tùy chỉnh
        Meal customMeal = new Meal.MealBuilder("Bún Bò Huế")
                .drink("Coca Cola")
                .spicy(true)
                .quantity(1)
                .build();
        customMeal.displayMeal();
        
        System.out.println("\n4. Vegetarian Meal:");
        Meal veggeMeal = new Meal.MealBuilder("Cơm Chay")
                .appetizer("Rau Trộn")
                .side("Đậu Hũ")
                .drink("Nước Ép Cam")
                .dessert("Trái Cây")
                .spicy(false)
                .build();
        veggeMeal.displayMeal();
        
        System.out.println("\n=== Builder Pattern Benefits ===");
        System.out.println("1. Dễ đọc và dễ hiểu với fluent interface");
        System.out.println("2. Có thể tạo object với nhiều optional parameters");
        System.out.println("3. Object immutable sau khi được build");
        System.out.println("4. Không cần nhiều constructors với các tham số khác nhau");
    }
}
