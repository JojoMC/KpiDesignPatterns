public class SingletonClass {
    private static SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass () {}

    public static SingletonClass getInstance() {
        return INSTANCE;
    }
}
