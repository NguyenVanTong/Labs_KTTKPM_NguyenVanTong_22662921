package factory;

/**
 * Abstract Vehicle class
 */
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int wheels;
    
    public abstract void displayInfo();
    
    public void start() {
        System.out.println("Starting the " + brand + " " + model);
    }
    
    public void stop() {
        System.out.println("Stopping the " + brand + " " + model);
    }
}
