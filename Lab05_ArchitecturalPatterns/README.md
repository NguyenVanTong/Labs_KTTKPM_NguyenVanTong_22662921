# Lab 05: Architectural Patterns
## Các Mẫu Kiến Trúc Phần Mềm

---

## Mục tiêu / Objectives

Hiểu và thực hành các mẫu kiến trúc phổ biến:
- MVC (Model-View-Controller)
- MVP (Model-View-Presenter)
- MVVM (Model-View-ViewModel)
- Layered Architecture

Learn and implement common architectural patterns for application structure.

---

## Nội dung / Content

### 1. MVC (Model-View-Controller)

**Mục đích:** Tách biệt business logic, presentation logic và input logic.

**Purpose:** Separate concerns into Model (data), View (UI), and Controller (logic).

**Thành phần:**
- **Model**: Quản lý data và business logic
- **View**: Hiển thị UI cho user
- **Controller**: Xử lý input và điều phối giữa Model và View

**Ứng dụng:**
- Web applications (Spring MVC, ASP.NET MVC)
- Desktop applications
- Mobile apps

**Code Example:** `src/main/java/mvc/`

### 2. Layered Architecture

**Mục đích:** Tổ chức code thành các lớp với trách nhiệm rõ ràng.

**Purpose:** Organize code into horizontal layers with specific responsibilities.

**Các lớp:**
1. Presentation Layer (UI)
2. Business Logic Layer
3. Data Access Layer
4. Database Layer

---

## Lợi ích của Architectural Patterns

1. **Separation of Concerns**: Mỗi component có trách nhiệm riêng biệt
2. **Testability**: Dễ test từng phần độc lập
3. **Maintainability**: Code dễ maintain và mở rộng
4. **Scalability**: Dễ scale từng layer riêng biệt
5. **Team Collaboration**: Nhiều người có thể làm việc song song

---

## Tài liệu tham khảo / References

- Clean Architecture - Robert C. Martin
- Software Architecture Patterns - Mark Richards
- Pattern-Oriented Software Architecture