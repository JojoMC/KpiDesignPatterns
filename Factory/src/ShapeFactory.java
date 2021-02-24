public class ShapeFactory {
    public static Shape getShape (ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new RuntimeException("Cannot determine shape");
        }
    }
}
