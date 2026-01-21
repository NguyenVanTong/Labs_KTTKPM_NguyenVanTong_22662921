package ocp;

/**
 * BAD EXAMPLE - Vi phạm Open/Closed Principle
 * Mỗi khi thêm shape mới phải sửa AreaCalculator
 */
class Rectangle {
    public double width;
    public double height;
}

class Circle {
    public double radius;
}

class AreaCalculatorBad {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.width * rectangle.height;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        // Nếu thêm Triangle, phải sửa code ở đây => Vi phạm OCP
        return 0;
    }
}

/**
 * GOOD EXAMPLE - Tuân theo Open/Closed Principle
 * Mở rộng bằng cách thêm class mới, không sửa code cũ
 */
interface Shape {
    double calculateArea();
}

class RectangleGood implements Shape {
    private double width;
    private double height;
    
    public RectangleGood(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    public String getName() {
        return "Rectangle";
    }
}

class CircleGood implements Shape {
    private double radius;
    
    public CircleGood(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public String getName() {
        return "Circle";
    }
}

// Thêm shape mới mà KHÔNG sửa code cũ
class Triangle implements Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    
    public String getName() {
        return "Triangle";
    }
}

// Thêm shape mới nữa - vẫn không sửa code cũ
class Square implements Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
    public String getName() {
        return "Square";
    }
}

class AreaCalculatorGood {
    public double calculateArea(Shape shape) {
        // Code này KHÔNG cần thay đổi khi thêm shape mới
        return shape.calculateArea();
    }
}

/**
 * Demo class
 */
public class OpenClosedDemo {
    public static void main(String[] args) {
        System.out.println("=== OPEN/CLOSED PRINCIPLE DEMO ===\n");
        
        System.out.println("1. BAD EXAMPLE - Violates OCP:");
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 10;
        
        Circle circ = new Circle();
        circ.radius = 7;
        
        AreaCalculatorBad badCalc = new AreaCalculatorBad();
        System.out.println("Rectangle area: " + badCalc.calculateArea(rect));
        System.out.println("Circle area: " + badCalc.calculateArea(circ));
        System.out.println("❌ Vấn đề: Thêm Triangle phải sửa AreaCalculatorBad\n");
        
        System.out.println("2. GOOD EXAMPLE - Follows OCP:");
        Shape rectangle = new RectangleGood(5, 10);
        Shape circle = new CircleGood(7);
        Shape triangle = new Triangle(6, 8);
        Shape square = new Square(5);
        
        AreaCalculatorGood goodCalc = new AreaCalculatorGood();
        System.out.println("Rectangle area: " + String.format("%.2f", goodCalc.calculateArea(rectangle)));
        System.out.println("Circle area: " + String.format("%.2f", goodCalc.calculateArea(circle)));
        System.out.println("Triangle area: " + String.format("%.2f", goodCalc.calculateArea(triangle)));
        System.out.println("Square area: " + String.format("%.2f", goodCalc.calculateArea(square)));
        System.out.println("✓ Thêm shape mới KHÔNG cần sửa AreaCalculatorGood\n");
        
        System.out.println("=== Open/Closed Principle Benefits ===");
        System.out.println("1. Mở rộng chức năng mà không sửa code cũ");
        System.out.println("2. Giảm risk khi thêm tính năng mới");
        System.out.println("3. Code existing đã tested không bị ảnh hưởng");
        System.out.println("4. Dễ maintain và scale");
    }
}
