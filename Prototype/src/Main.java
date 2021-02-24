public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(2010, 20000.00, "red");

        Car car2 = car1.clone();
        Car car3 = car1.clone();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
