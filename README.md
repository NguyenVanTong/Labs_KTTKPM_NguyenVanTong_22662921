# Bài Tập Thực Hành - Kiến Trúc và Thiết Kế Phần Mềm
## Labs - Software Architecture and Design

**Sinh viên:** Nguyễn Văn Tông  
**MSSV:** 22662921  
**Trường:** Đại học Công nghiệp TP.HCM (IUH)

---

## Mô tả môn học / Course Description

Repository này chứa các bài tập thực hành cho môn Kiến Trúc và Thiết Kế Phần Mềm, bao gồm:
- Các mẫu thiết kế (Design Patterns)
- Nguyên tắc SOLID
- Các kiến trúc phần mềm phổ biến
- Thực hành thiết kế hệ thống

This repository contains practical exercises for Software Architecture and Design course, including:
- Design Patterns
- SOLID Principles
- Common Software Architectures
- System Design Practice

---

## Cấu trúc thư mục / Directory Structure

```
Labs_KTTKPM_NguyenVanTong_22662921/
├── Lab01_CreationalPatterns/      # Mẫu thiết kế khởi tạo
├── Lab02_StructuralPatterns/      # Mẫu thiết kế cấu trúc
├── Lab03_BehavioralPatterns/      # Mẫu thiết kế hành vi
├── Lab04_SOLID_Principles/        # Nguyên tắc SOLID
├── Lab05_ArchitecturalPatterns/   # Các mẫu kiến trúc
├── Lab06_Microservices/           # Kiến trúc Microservices
├── Lab07_DatabaseDesign/          # Thiết kế cơ sở dữ liệu
└── Lab08_Testing/                 # Testing và QA
```

---

## Danh sách bài lab / Lab List

### Lab 01: Creational Design Patterns (Mẫu thiết kế khởi tạo)
- Singleton Pattern
- Factory Pattern
- Abstract Factory Pattern
- Builder Pattern
- Prototype Pattern

### Lab 02: Structural Design Patterns (Mẫu thiết kế cấu trúc)
- Adapter Pattern
- Bridge Pattern
- Composite Pattern
- Decorator Pattern
- Facade Pattern
- Proxy Pattern

### Lab 03: Behavioral Design Patterns (Mẫu thiết kế hành vi)
- Observer Pattern
- Strategy Pattern
- Command Pattern
- State Pattern
- Template Method Pattern
- Iterator Pattern

### Lab 04: SOLID Principles (Nguyên tắc SOLID)
- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

### Lab 05: Architectural Patterns (Các mẫu kiến trúc)
- MVC (Model-View-Controller)
- MVP (Model-View-Presenter)
- MVVM (Model-View-ViewModel)
- Layered Architecture

### Lab 06: Microservices Architecture
- Service Design
- API Gateway Pattern
- Service Discovery
- Circuit Breaker Pattern

### Lab 07: Database Design and Integration
- Database Schema Design
- Repository Pattern
- Unit of Work Pattern
- Data Access Layer

### Lab 08: Testing and Quality Assurance
- Unit Testing
- Integration Testing
- Test-Driven Development (TDD)
- Code Quality Metrics

---

## Công nghệ sử dụng / Technologies Used

- **Java**: Ngôn ngữ lập trình chính / Primary programming language
- **Maven/Gradle**: Quản lý build / Build management
- **JUnit**: Framework testing / Testing framework
- **UML**: Sơ đồ thiết kế / Design diagrams

---

## Hướng dẫn sử dụng / Usage Instructions

### Yêu cầu hệ thống / Requirements
- Java JDK 11 hoặc cao hơn / Java JDK 11 or higher
- Maven 3.6+ hoặc Gradle 6.0+ / Maven 3.6+ or Gradle 6.0+
- IDE: IntelliJ IDEA, Eclipse, hoặc VS Code

### Cài đặt / Installation
```bash
# Clone repository
git clone https://github.com/NguyenVanTong/Labs_KTTKPM_NguyenVanTong_22662921.git

# Di chuyển vào thư mục / Navigate to directory
cd Labs_KTTKPM_NguyenVanTong_22662921

# Chọn lab cần thực hành / Select the lab to work on
cd Lab01_CreationalPatterns
```

### Biên dịch và chạy / Build and Run
```bash
# Với Maven / With Maven
mvn clean compile
mvn exec:java

# Với Gradle / With Gradle
gradle build
gradle run
```

---

## Tài liệu tham khảo / References

1. **Design Patterns: Elements of Reusable Object-Oriented Software** - Gang of Four
2. **Clean Architecture** - Robert C. Martin
3. **Software Architecture Patterns** - Mark Richards
4. **Head First Design Patterns** - Eric Freeman, Elisabeth Robson

---

## Liên hệ / Contact

- **Email:** tongnguyenvan@student.iuh.edu.vn
- **GitHub:** [NguyenVanTong](https://github.com/NguyenVanTong)

---

## License

This project is for educational purposes as part of the Software Architecture and Design course at IUH.