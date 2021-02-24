public class Main {
    public static void main(String[] args) {
        SingletonClass sc1 = SingletonClass.getInstance();
        SingletonClass sc2 = SingletonClass.getInstance();

        System.out.println(sc1.hashCode() == sc2.hashCode());
    }
}
