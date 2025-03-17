package a2_CreationalDesignPattern.BuilderPattern.Examples.Example2;

public class Main {
    public static void main(String[] args) {
        
        CustomStringBuilder csb = new CustomStringBuilder();
        csb.append("Hello").append("World");
        System.out.println(csb.toString());
    }

}
