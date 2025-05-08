package a3_structuralDesignPattern.Flyweight;

public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " at (" + x + "," + y + ") with color " + color + " and texture " + texture);
    }
}

