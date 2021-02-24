public class VictorianFurnitureVictory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ChairVictorian();
    }

    @Override
    public Sofa createSofa() {
        return new SofaVictorian();
    }

    @Override
    public Table createTable() {
        return new TableVictorian();
    }
}
