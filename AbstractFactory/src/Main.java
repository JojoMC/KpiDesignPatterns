public class Main {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory1 = new ModernFurnitureFactory();
        furnitureFactory1.createChair().printChairInfo();
        furnitureFactory1.createSofa().printSofaInfo();
        furnitureFactory1.createTable().printTableInfo();

        System.out.println("\n ******************** \n");

        FurnitureFactory furnitureFactory2 = new RetroFurnitureFactory();
        furnitureFactory2.createChair().printChairInfo();
        furnitureFactory2.createSofa().printSofaInfo();
        furnitureFactory2.createTable().printTableInfo();

        System.out.println("\n ******************** \n");

        FurnitureFactory furnitureFactory3 = new VictorianFurnitureVictory();
        furnitureFactory3.createChair().printChairInfo();
        furnitureFactory3.createSofa().printSofaInfo();
        furnitureFactory3.createTable().printTableInfo();
    }
}
