public class HouseBuilder {

    private Integer rooms;
    private Double surface;
    private Integer floors;
    private String color;

    public HouseBuilder withRooms(Integer rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder withSurface(Double surface) {
        this.surface = surface;
        return this;
    }

    public HouseBuilder withFloors(Integer floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public House build() {
        House house = new House();
        house.setRooms(this.rooms);
        house.setSurface(this.surface);
        house.setFloors(this.floors);
        house.setColor(this.color);

        return house;
    }
}
