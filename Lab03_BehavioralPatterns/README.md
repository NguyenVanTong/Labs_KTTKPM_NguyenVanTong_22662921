# Lab 03: Behavioral Design Patterns
## Mẫu Thiết Kế Hành Vi

---

## Mục tiêu / Objectives

Hiểu và thực hành các mẫu thiết kế hành vi (Behavioral Design Patterns):
- Observer Pattern
- Strategy Pattern
- Command Pattern

Learn how objects communicate and distribute responsibilities.

---

## Nội dung / Content

### 1. Observer Pattern

**Mục đích:** Định nghĩa mối quan hệ một-nhiều giữa các đối tượng, khi một đối tượng thay đổi trạng thái, tất cả các đối tượng phụ thuộc được thông báo.

**Purpose:** Define a one-to-many dependency between objects where state changes are automatically notified.

**Ứng dụng:**
- Event handling systems
- News/Weather subscription systems
- Model-View updates

**Code Example:** `src/main/java/observer/`

### 2. Strategy Pattern

**Mục đích:** Định nghĩa một họ các thuật toán, đóng gói từng thuật toán và làm chúng có thể thay thế lẫn nhau.

**Purpose:** Define a family of algorithms, encapsulate each one, and make them interchangeable.

**Ứng dụng:**
- Payment processing strategies
- Sorting algorithms
- Compression strategies

**Code Example:** `src/main/java/strategy/`

### 3. Command Pattern

**Mục đích:** Đóng gói một request như một object, cho phép parameterize clients với các requests khác nhau.

**Purpose:** Encapsulate a request as an object, allowing parameterization and queuing of requests.

**Ứng dụng:**
- Undo/Redo operations
- Transaction systems
- Menu actions

**Code Example:** `src/main/java/command/`

---

## Tài liệu tham khảo / References

- Design Patterns: Elements of Reusable Object-Oriented Software
- Head First Design Patterns