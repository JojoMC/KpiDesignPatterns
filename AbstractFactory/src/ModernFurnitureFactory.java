public class ModernFurnitureFactory implements  FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ChairModern();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModern();
    }

    @Override
    public Table createTable() {
        return new TableModern();
    }
}
