# Lab 02: Structural Design Patterns
## Mẫu Thiết Kế Cấu Trúc

---

## Mục tiêu / Objectives

Hiểu và thực hành các mẫu thiết kế cấu trúc (Structural Design Patterns):
- Adapter Pattern
- Decorator Pattern
- Facade Pattern

Learn and practice Structural Design Patterns for organizing classes and objects.

---

## Nội dung / Content

### 1. Adapter Pattern

**Mục đích:** Chuyển đổi interface của một class thành interface khác mà client mong đợi.

**Purpose:** Convert the interface of a class into another interface that clients expect.

**Ứng dụng:**
- Integrating third-party libraries
- Legacy system integration
- Payment gateway adapters

**Code Example:** `src/main/java/adapter/`

### 2. Decorator Pattern

**Mục đích:** Thêm trách nhiệm mới cho object một cách linh hoạt mà không cần thay đổi code gốc.

**Purpose:** Attach additional responsibilities to an object dynamically.

**Ứng dụng:**
- Adding features to UI components
- Stream decorators in Java I/O
- Pizza/Coffee ordering systems

**Code Example:** `src/main/java/decorator/`

### 3. Facade Pattern

**Mục đích:** Cung cấp một interface đơn giản hóa cho một hệ thống phức tạp.

**Purpose:** Provide a simplified interface to a complex subsystem.

**Ứng dụng:**
- Simplifying complex library APIs
- Home automation systems
- Database access layers

**Code Example:** `src/main/java/facade/`

---

## Cấu trúc thư mục / Directory Structure

```
Lab02_StructuralPatterns/
├── README.md
└── src/
    └── main/
        └── java/
            ├── adapter/
            ├── decorator/
            └── facade/
```

---

## Hướng dẫn chạy / How to Run

### Compile and Run
```bash
cd Lab02_StructuralPatterns
javac -d bin src/main/java/**/*.java
java -cp bin adapter.AdapterDemo
java -cp bin decorator.DecoratorDemo
java -cp bin facade.FacadeDemo
```

---

## Bài tập / Exercises

1. **Adapter Pattern:** Create adapters for different payment methods
2. **Decorator Pattern:** Build a notification system with multiple decorators
3. **Facade Pattern:** Design a simplified interface for a complex e-commerce system

---

## Tài liệu tham khảo / References

- Design Patterns: Elements of Reusable Object-Oriented Software
- Head First Design Patterns
- Refactoring Guru: https://refactoring.guru/design-patterns