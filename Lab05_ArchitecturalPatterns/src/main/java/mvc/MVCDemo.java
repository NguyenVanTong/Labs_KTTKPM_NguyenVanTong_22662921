package mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * MODEL - Chứa data và business logic
 */
class Student {
    private String id;
    private String name;
    private double gpa;
    
    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    
    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    
    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", GPA=" + String.format("%.2f", gpa) + "]";
    }
}

class StudentModel {
    private List<Student> students = new ArrayList<>();
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void removeStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
    }
    
    public Student getStudent(String id) {
        return students.stream()
                      .filter(s -> s.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }
    
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
    
    public List<Student> searchByName(String name) {
        List<Student> results = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(s);
            }
        }
        return results;
    }
}

/**
 * VIEW - Hiển thị dữ liệu cho user
 */
class StudentView {
    public void displayStudent(Student student) {
        if (student != null) {
            System.out.println("\n=== Student Details ===");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("GPA: " + String.format("%.2f", student.getGpa()));
            System.out.println("======================");
        } else {
            System.out.println("Student not found!");
        }
    }
    
    public void displayAllStudents(List<Student> students) {
        System.out.println("\n=== All Students ===");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
        System.out.println("====================");
    }
    
    public void displayMessage(String message) {
        System.out.println("\n>>> " + message);
    }
    
    public void displaySearchResults(List<Student> students, String query) {
        System.out.println("\n=== Search Results for: '" + query + "' ===");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
        System.out.println("================================");
    }
}

/**
 * CONTROLLER - Xử lý logic và điều phối giữa Model và View
 */
class StudentController {
    private StudentModel model;
    private StudentView view;
    
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void addStudent(String id, String name, double gpa) {
        Student student = new Student(id, name, gpa);
        model.addStudent(student);
        view.displayMessage("Student added successfully: " + name);
    }
    
    public void removeStudent(String id) {
        Student student = model.getStudent(id);
        if (student != null) {
            model.removeStudent(id);
            view.displayMessage("Student removed: " + student.getName());
        } else {
            view.displayMessage("Student ID not found: " + id);
        }
    }
    
    public void showStudent(String id) {
        Student student = model.getStudent(id);
        view.displayStudent(student);
    }
    
    public void showAllStudents() {
        List<Student> students = model.getAllStudents();
        view.displayAllStudents(students);
    }
    
    public void searchStudents(String name) {
        List<Student> results = model.searchByName(name);
        view.displaySearchResults(results, name);
    }
    
    public void updateStudentGPA(String id, double newGpa) {
        Student student = model.getStudent(id);
        if (student != null) {
            student.setGpa(newGpa);
            view.displayMessage("Updated GPA for " + student.getName() + " to " + newGpa);
        } else {
            view.displayMessage("Student ID not found: " + id);
        }
    }
}

/**
 * DEMO - Main application
 */
public class MVCDemo {
    public static void main(String[] args) {
        System.out.println("=== MVC PATTERN DEMO ===");
        System.out.println("Student Management System\n");
        
        // Create Model, View, Controller
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        // Add students
        System.out.println("1. Adding students:");
        controller.addStudent("22662921", "Nguyen Van Tong", 3.8);
        controller.addStudent("22662922", "Tran Thi Mai", 3.9);
        controller.addStudent("22662923", "Le Van Nam", 3.5);
        controller.addStudent("22662924", "Pham Thi Lan", 3.7);
        
        // Show all students
        System.out.println("\n2. Showing all students:");
        controller.showAllStudents();
        
        // Show specific student
        System.out.println("\n3. Showing specific student:");
        controller.showStudent("22662921");
        
        // Search students
        System.out.println("\n4. Searching students by name:");
        controller.searchStudents("Tran");
        
        // Update GPA
        System.out.println("\n5. Updating student GPA:");
        controller.updateStudentGPA("22662921", 4.0);
        controller.showStudent("22662921");
        
        // Remove student
        System.out.println("\n6. Removing a student:");
        controller.removeStudent("22662923");
        controller.showAllStudents();
        
        System.out.println("\n=== MVC Pattern Benefits ===");
        System.out.println("1. Separation of Concerns: Model, View, Controller tách biệt");
        System.out.println("2. Maintainability: Dễ sửa đổi từng component độc lập");
        System.out.println("3. Testability: Có thể test Model, View, Controller riêng");
        System.out.println("4. Flexibility: Dễ thay đổi UI mà không ảnh hưởng business logic");
        System.out.println("5. Reusability: Model có thể được sử dụng với nhiều View khác nhau");
    }
}
