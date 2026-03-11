package iuh.fit.singleton;

public class BillPughSingleton {
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton(){}

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
