public class RetroFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ChairRetro();
    }

    @Override
    public Sofa createSofa() {
        return new SofaRetro();
    }

    @Override
    public Table createTable() {
        return new TableRetro();
    }
}
