# Adapter Design Pattern

## 📌 Tanım

Adapter Design Pattern, bir nesnenin arayüzünü, başka bir nesnenin beklediği arayüze dönüştürmek için kullanılan yapısal bir tasarım desenidir. Bu desen, birbirleriyle uyumsuz olan iki sistemin veya bileşenin sorunsuz bir şekilde birlikte çalışmasını sağlar. Adaptör, bir ara katman gibi davranarak mevcut kodu değiştirmeden uyumluluk sağlar.

## 📚 Adapter Design Pattern Nedir?

Adapter Design Pattern, farklı sistemleri bir araya getirmek, eski kodlarla yeni kodları uyumlu hale getirmek veya belirli bir arayüzü başka bir arayüze adapte etmek için kullanılır. Temel bileşenleri şunlardır:

- **Target**: İstemcinin kullanacağı hedef arayüz.
- **Adaptee**: Mevcut sistem veya dönüştürülmesi gereken bileşen.
- **Adapter**: Adaptee ile Target arasında köprü kuran sınıf.

Bu örnekte, bir sıcaklık ölçüm sisteminde Celsius birimini Fahrenheit birimine çeviren bir adaptör tasarlayacağız.

---

## 💻 Kod Örneği (Java)

Aşağıda, Java ile yazılmış bir Adapter Design Pattern örneği yer alıyor. Senaryomuzda, eski bir sistem Celsius cinsinden sıcaklık verirken, yeni bir sistem Fahrenheit cinsinden sıcaklık bekliyor.

### 1. Target Arayüzü (Hedef)
```java
// TemperatureReader.java
public interface TemperatureReader {
    double getTemperature();
}
```

### 2. Adaptee (Mevcut Sistem)
```java
// CelsiusSensor.java
public class CelsiusSensor {
    private double celsius;

    public CelsiusSensor(double celsius) {
        this.celsius = celsius;
    }

    public double readCelsius() {
        return this.celsius;
    }
}
```

### 3. Adapter
```java
// FahrenheitSensor.java
public class FahrenheitSensor implements TemperatureReader {
    private CelsiusSensor celsiusSensor;

    public FahrenheitSensor(CelsiusSensor celsiusSensor) {
        this.celsiusSensor = celsiusSensor;
    }

    @Override
    public double getTemperature() {
        double celsius = celsiusSensor.readCelsius();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }
}
```

### 4. Kullanım
```java
// Main.java
public class Main {
    public static void main(String[] args) {
        CelsiusSensor celsiusSensor = new CelsiusSensor(25.0);
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(celsiusSensor);
        double temperature = fahrenheitSensor.getTemperature();
        System.out.println("Temperature: " + temperature);
    }
}
``` 

