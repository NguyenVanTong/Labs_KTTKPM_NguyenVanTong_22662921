package iuh.fit.singleton;

public class LoggerSingleton {

    private LoggerSingleton(){
    }
    private static class Helper{
        static final LoggerSingleton INSTANCE = new LoggerSingleton();
    }
    
    public static LoggerSingleton getInstance(){
        return Helper.INSTANCE;
    }
    public void log(String message){
        System.out.println("Log: "+ message);
    }
}
