package a3_structuralDesignPattern.AdapterPattern.Task;

public class CelsiusToFahrenheitAdapter implements Fahrenheit{

    private Celsius celsiusTemperature;

    public CelsiusToFahrenheitAdapter(Celsius celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public double convertToFahrenheit(double celsius) {
        celsiusTemperature.getCelsiusTemperature();
        return celsius * 1.8 + 32;
    }
}
