package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonInstance instance = SingletonInstance.getInstance();
        SingletonInstance instance2 = SingletonInstance.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        System.gc();
    }
}
