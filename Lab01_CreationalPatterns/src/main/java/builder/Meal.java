package builder;

/**
 * Meal class - Complex object to be built
 */
public class Meal {
    // Required parameters
    private final String mainCourse;
    
    // Optional parameters
    private String drink;
    private String dessert;
    private String appetizer;
    private String side;
    private boolean spicy;
    private int quantity;
    
    // Private constructor - chỉ Builder có thể khởi tạo
    private Meal(MealBuilder builder) {
        this.mainCourse = builder.mainCourse;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.appetizer = builder.appetizer;
        this.side = builder.side;
        this.spicy = builder.spicy;
        this.quantity = builder.quantity;
    }
    
    public void displayMeal() {
        System.out.println("=== Meal Details ===");
        System.out.println("Main Course: " + mainCourse);
        if (appetizer != null) System.out.println("Appetizer: " + appetizer);
        if (side != null) System.out.println("Side: " + side);
        if (drink != null) System.out.println("Drink: " + drink);
        if (dessert != null) System.out.println("Dessert: " + dessert);
        System.out.println("Spicy: " + (spicy ? "Yes" : "No"));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculatePrice() + " VND");
    }
    
    private double calculatePrice() {
        double price = 50000; // Base price for main course
        if (appetizer != null) price += 20000;
        if (side != null) price += 15000;
        if (drink != null) price += 10000;
        if (dessert != null) price += 25000;
        return price * quantity;
    }
    
    // Getters
    public String getMainCourse() { return mainCourse; }
    public String getDrink() { return drink; }
    public String getDessert() { return dessert; }
    public String getAppetizer() { return appetizer; }
    public String getSide() { return side; }
    public boolean isSpicy() { return spicy; }
    public int getQuantity() { return quantity; }
    
    // Static nested Builder class
    public static class MealBuilder {
        // Required parameters
        private final String mainCourse;
        
        // Optional parameters - initialized to default values
        private String drink = "Water";
        private String dessert;
        private String appetizer;
        private String side;
        private boolean spicy = false;
        private int quantity = 1;
        
        public MealBuilder(String mainCourse) {
            this.mainCourse = mainCourse;
        }
        
        public MealBuilder drink(String drink) {
            this.drink = drink;
            return this;
        }
        
        public MealBuilder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }
        
        public MealBuilder appetizer(String appetizer) {
            this.appetizer = appetizer;
            return this;
        }
        
        public MealBuilder side(String side) {
            this.side = side;
            return this;
        }
        
        public MealBuilder spicy(boolean spicy) {
            this.spicy = spicy;
            return this;
        }
        
        public MealBuilder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        
        public Meal build() {
            return new Meal(this);
        }
    }
}
