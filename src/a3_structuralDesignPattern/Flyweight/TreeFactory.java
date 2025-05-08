package a3_structuralDesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes=new HashMap<>();
    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        if (!treeTypes.containsKey(key)) {
            TreeType treeType = new TreeType(name, color, texture);
            treeTypes.put(key, treeType);
            System.out.println("Created new tree type: " + key);
        }
        return treeTypes.get(key);
    }
}
