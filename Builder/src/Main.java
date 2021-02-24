public class Main {

    public static void main(String[] args) {
        House house = new HouseBuilder().withFloors(2).withColor("white").withRooms(8).build();

        System.out.println(house.getRooms());
        System.out.println(house.getColor());
        System.out.println(house.getFloors());
        System.out.println(house.getSurface());
    }
}
