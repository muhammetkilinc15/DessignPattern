package a3_structuralDesignPattern.Flyweight;

public class MainClass{
    public static void main(String[] args) {

        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(30, 40, "Pine", "Dark Green", "Smooth");
        forest.plantTree(50, 60, "Oak", "Green", "Rough");
        forest.draw();
    }
}
