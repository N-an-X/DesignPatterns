package Singleton;

public class Singleton {
    //懒汉式，线程不安全
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Hello World!");
    }
}
