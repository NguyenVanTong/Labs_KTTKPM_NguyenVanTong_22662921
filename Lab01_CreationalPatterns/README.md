# Lab 01: Creational Design Patterns
## Mẫu Thiết Kế Khởi Tạo

---

## Mục tiêu / Objectives

Hiểu và thực hành các mẫu thiết kế khởi tạo (Creational Design Patterns):
- Singleton Pattern
- Factory Pattern
- Builder Pattern

Learn and practice Creational Design Patterns:
- Understanding object creation patterns
- Implementing flexible and reusable code
- Managing object instantiation

---

## Nội dung / Content

### 1. Singleton Pattern

**Mục đích:** Đảm bảo một class chỉ có duy nhất một instance và cung cấp một điểm truy cập toàn cục đến instance đó.

**Purpose:** Ensure a class has only one instance and provide a global point of access to it.

**Ứng dụng:**
- Database Connection Pool
- Logger
- Configuration Manager
- Cache Manager

**Code Example:** `src/main/java/singleton/`

### 2. Factory Pattern

**Mục đích:** Định nghĩa một interface để tạo đối tượng, nhưng để các subclass quyết định class nào sẽ được khởi tạo.

**Purpose:** Define an interface for creating objects, but let subclasses decide which class to instantiate.

**Ứng dụng:**
- Creating different types of database connections
- UI component factories
- Document creator

**Code Example:** `src/main/java/factory/`

### 3. Builder Pattern

**Mục đích:** Tách rời việc xây dựng một đối tượng phức tạp khỏi biểu diễn của nó, cho phép cùng một quá trình xây dựng có thể tạo ra các biểu diễn khác nhau.

**Purpose:** Separate the construction of a complex object from its representation, allowing the same construction process to create different representations.

**Ứng dụng:**
- Building complex objects with many optional parameters
- Constructing immutable objects
- Meal/Order builders in restaurant systems

**Code Example:** `src/main/java/builder/`

---

## Cấu trúc thư mục / Directory Structure

```
Lab01_CreationalPatterns/
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── singleton/
            │   ├── DatabaseConnection.java
            │   ├── Logger.java
            │   └── SingletonDemo.java
            ├── factory/
            │   ├── Vehicle.java
            │   ├── Car.java
            │   ├── Bike.java
            │   ├── VehicleFactory.java
            │   └── FactoryDemo.java
            └── builder/
                ├── Meal.java
                ├── MealBuilder.java
                └── BuilderDemo.java
```

---

## Hướng dẫn chạy / How to Run

### Compile
```bash
cd Lab01_CreationalPatterns
javac -d bin src/main/java/**/*.java
```

### Run Singleton Demo
```bash
java -cp bin singleton.SingletonDemo
```

### Run Factory Demo
```bash
java -cp bin factory.FactoryDemo
```

### Run Builder Demo
```bash
java -cp bin builder.BuilderDemo
```

---

## Bài tập / Exercises

1. **Singleton Pattern:**
   - Implement a thread-safe Singleton
   - Compare eager vs lazy initialization
   - Implement Double-Checked Locking

2. **Factory Pattern:**
   - Create a factory for different payment methods (Cash, Card, Online)
   - Implement Abstract Factory for cross-platform UI components

3. **Builder Pattern:**
   - Build a complex User object with optional fields
   - Create a fluent interface for building queries

---

## Tài liệu tham khảo / References

- Design Patterns: Elements of Reusable Object-Oriented Software (Gang of Four)
- Head First Design Patterns
- Java Design Patterns: https://java-design-patterns.com/

---

## Notes

- Singleton nên được sử dụng cẩn thận vì có thể gây khó khăn trong testing
- Factory Pattern giúp code dễ mở rộng và bảo trì
- Builder Pattern đặc biệt hữu ích cho objects với nhiều parameters