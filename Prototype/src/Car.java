public class Car {

    private Integer manufacturingYear;
    private Double price;
    private String color;

    public Car () {}

    public Car (Integer manufacturingYear, Double price, String color) {
        this.manufacturingYear = manufacturingYear;
        this.price = price;
        this.color = color;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car clone () {
        Car car = new Car();
        car.color = this.color;
        car.manufacturingYear = this.manufacturingYear;
        car.price = this.price;

        return car;
    }

    @Override
    public String toString() {
        return "Car{" + "manufacturingYear=" + manufacturingYear + ", price=" + price + ", color='" + color + '\'' + '}';
    }
}
