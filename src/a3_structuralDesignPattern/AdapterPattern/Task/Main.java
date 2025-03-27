package a3_structuralDesignPattern.AdapterPattern.Task;

public class Main {
    public static void main(String[] args) {

        Celsius celsius = new Celsius();
        Fahrenheit fahrenheit = new CelsiusToFahrenheitAdapter(celsius);
        System.out.println("Celsius: " + celsius.getCelsiusTemperature());
        System.out.println("Fahrenheit: " + fahrenheit.convertToFahrenheit(30));
    }
}
