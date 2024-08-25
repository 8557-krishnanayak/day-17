package Singleton;

public class SingletonInstance {
    private static SingletonInstance instance;

    private SingletonInstance() {
    }

    public static SingletonInstance getInstance() {

        if (instance == null) {
//            synchronized (SingletonInstance.class) {
//                if (instance == null) {
                    instance = new SingletonInstance();
//                }
//            }
        }
        return instance;
    }
}
