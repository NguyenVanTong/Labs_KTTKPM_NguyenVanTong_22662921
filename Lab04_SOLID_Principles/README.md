# Lab 04: SOLID Principles
## Nguyên Tắc SOLID

---

## Mục tiêu / Objectives

Hiểu và áp dụng 5 nguyên tắc SOLID trong thiết kế phần mềm hướng đối tượng.

Learn and apply the 5 SOLID principles for better object-oriented design.

---

## SOLID Principles

### S - Single Responsibility Principle (SRP)
**Nguyên tắc:** Một class chỉ nên có một lý do duy nhất để thay đổi.

**Principle:** A class should have only one reason to change.

**Lợi ích:**
- Code dễ maintain
- Giảm coupling
- Tăng cohesion

**Code Example:** `src/main/java/srp/`

---

### O - Open/Closed Principle (OCP)
**Nguyên tắc:** Mở cho mở rộng, đóng cho sửa đổi.

**Principle:** Open for extension, closed for modification.

**Lợi ích:**
- Dễ thêm tính năng mới
- Không ảnh hưởng code cũ
- Giảm bugs

**Code Example:** `src/main/java/ocp/`

---

### L - Liskov Substitution Principle (LSP)
**Nguyên tắc:** Các đối tượng của class con có thể thay thế class cha mà không làm thay đổi tính đúng đắn của chương trình.

**Principle:** Objects of a superclass should be replaceable with objects of its subclasses without breaking the application.

**Lợi ích:**
- Đảm bảo inheritance đúng đắn
- Tránh vi phạm contract
- Code predictable hơn

**Code Example:** `src/main/java/lsp/`

---

### I - Interface Segregation Principle (ISP)
**Nguyên tắc:** Client không nên bị ép phụ thuộc vào interface mà nó không sử dụng.

**Principle:** Clients should not be forced to depend on interfaces they don't use.

**Lợi ích:**
- Interface nhỏ và focused
- Giảm coupling
- Dễ implement

**Code Example:** `src/main/java/isp/`

---

### D - Dependency Inversion Principle (DIP)
**Nguyên tắc:** 
- High-level modules không nên phụ thuộc vào low-level modules. Cả hai nên phụ thuộc vào abstraction.
- Abstraction không nên phụ thuộc vào details. Details nên phụ thuộc vào abstraction.

**Principle:**
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.

**Lợi ích:**
- Giảm coupling
- Code linh hoạt hơn
- Dễ testing

**Code Example:** `src/main/java/dip/`

---

## Tổng kết / Summary

SOLID principles giúp:
1. Code dễ maintain và mở rộng
2. Giảm bugs và technical debt
3. Code dễ test
4. Team collaboration tốt hơn
5. Architecture bền vững

---

## Bài tập / Exercises

1. Refactor một class vi phạm SRP thành nhiều classes
2. Thiết kế hệ thống mở rộng theo OCP
3. Implement inheritance đúng theo LSP
4. Tách interface lớn thành nhiều interface nhỏ theo ISP
5. Áp dụng Dependency Injection theo DIP

---

## Tài liệu tham khảo / References

- Clean Code - Robert C. Martin
- Clean Architecture - Robert C. Martin
- SOLID Principles by Uncle Bob