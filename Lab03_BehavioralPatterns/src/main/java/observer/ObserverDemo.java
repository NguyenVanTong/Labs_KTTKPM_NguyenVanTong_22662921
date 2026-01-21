package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject Interface
 */
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

/**
 * Observer Interface
 */
interface Observer {
    void update(String message);
}

/**
 * Concrete Subject - Weather Station
 */
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weatherInfo;
    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Observer đã được thêm");
    }
    
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer đã được gỡ bỏ");
    }
    
    @Override
    public void notifyObservers() {
        System.out.println("\n--- Thông báo tất cả observers ---");
        for (Observer observer : observers) {
            observer.update(weatherInfo);
        }
    }
    
    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo = weatherInfo;
        System.out.println("\nThời tiết mới: " + weatherInfo);
        notifyObservers();
    }
}

/**
 * Concrete Observers
 */
class PhoneDisplay implements Observer {
    private String name;
    
    public PhoneDisplay(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println("[" + name + " - Phone] Hiển thị: " + message);
    }
}

class TVDisplay implements Observer {
    private String location;
    
    public TVDisplay(String location) {
        this.location = location;
    }
    
    @Override
    public void update(String message) {
        System.out.println("[TV tại " + location + "] Broadcasting: " + message);
    }
}

class WebDisplay implements Observer {
    private String url;
    
    public WebDisplay(String url) {
        this.url = url;
    }
    
    @Override
    public void update(String message) {
        System.out.println("[Website " + url + "] Cập nhật: " + message);
    }
}

/**
 * Demo class
 */
public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("=== OBSERVER PATTERN DEMO ===\n");
        
        // Create subject
        WeatherStation weatherStation = new WeatherStation();
        
        // Create observers
        Observer phone1 = new PhoneDisplay("iPhone Tong");
        Observer phone2 = new PhoneDisplay("Samsung User");
        Observer tv = new TVDisplay("Phòng Khách");
        Observer web = new WebDisplay("weather.iuh.edu.vn");
        
        // Attach observers
        System.out.println("--- Đăng ký observers ---");
        weatherStation.attach(phone1);
        weatherStation.attach(phone2);
        weatherStation.attach(tv);
        weatherStation.attach(web);
        
        // Change weather - all observers get notified
        weatherStation.setWeatherInfo("Nắng, 32°C, Độ ẩm 65%");
        
        weatherStation.setWeatherInfo("Mưa, 28°C, Độ ẩm 85%");
        
        // Remove one observer
        System.out.println("\n--- Gỡ bỏ một observer ---");
        weatherStation.detach(phone2);
        
        // Change weather again
        weatherStation.setWeatherInfo("Nhiều mây, 30°C, Độ ẩm 70%");
        
        System.out.println("\n=== Observer Pattern Benefits ===");
        System.out.println("1. Loose coupling giữa Subject và Observer");
        System.out.println("2. Có thể thêm/bớt observers runtime");
        System.out.println("3. Subject không cần biết chi tiết về observers");
        System.out.println("4. Support broadcast communication");
    }
}
