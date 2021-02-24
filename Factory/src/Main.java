public class Main {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        shape1.printShape();

        Shape shape2 = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape2.printShape();

        Shape shape3 = ShapeFactory.getShape(ShapeEnum.SQUARE);
        shape3.printShape();
    }
}
