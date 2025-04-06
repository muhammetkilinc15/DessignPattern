# Decorator Design Pattern

## Tanım (Definition)
**Decorator Design Pattern (Dekoratör Tasarım Deseni)**, bir nesnenin davranışını veya özelliklerini dinamik olarak genişletmek için kullanılan yapısal bir tasarım desenidir. Bu desen, mevcut bir sınıfın işlevselliğini değiştirmeden veya alt sınıf oluşturmadan ek özellikler (**additional features**) eklemenize olanak tanır. **Decorator (Dekoratör)**, nesneyi "sararak" (**wrapping**) temel işlevselliği korur ve üzerine yeni davranışlar ekler. Bu, **"open-closed principle" (açık-kapalı prensibi)** ile uyumludur: sınıflar genişletmeye açık, değiştirmeye kapalıdır.

Bu desen, **inheritance (kalıtım)** yerine **composition (bileşim)** kullanarak esneklik sağlar ve özellikle bir nesneye isteğe bağlı özellikler eklemek istediğinizde faydalıdır.

---

## Ne Zaman Kullanılır? (When to Use)
- Bir nesneye dinamik olarak yeni işlevler (**functionalities**) eklemek istediğinizde.
- Mevcut bir sınıfı değiştirmeden veya alt sınıflar oluşturmadan özellik eklemek gerektiğinde.
- İşlevselliği isteğe bağlı olarak birleştirip çıkarmak (**add or remove functionalities**) istediğinizde.
- Kalıtımın pratik olmadığı veya çok sayıda kombinasyon gerektirdiği durumlarda.

---

## Avantajlar (Advantages)
- **Esneklik:** Nesnelere çalışma zamanında (**runtime**) yeni özellikler eklenebilir.
- **Kod Tekrarını Azaltır:** Her kombinasyon için ayrı sınıflar oluşturmak yerine dekoratörler kullanılır.
- **Açık-Kapalı Prensibi:** Mevcut kod değişmeden genişletilebilir.
- **Modülerlik:** Her dekoratör bağımsız çalışır ve birleştirilebilir.

---

## Dezavantajlar (Disadvantages)
- **Karmaşıklık Artışı:** Çok sayıda dekoratör kullanıldığında kodun takibi zorlaşabilir.
- **Hata Ayıklama Zorluğu:** Nesne katmanları nedeniyle hata bulmak karmaşık olabilir.
- **Başlangıç Maliyeti:** Küçük projelerde ek tasarım çabası gerektirebilir.

---

## Örnek Senaryo: Kahve Sipariş Sistemi (Coffee Order System Example)
Decorator desenini anlamak için bir **kahve sipariş sistemi** örneği kullanalım. Bir kahve dükkanında müşteriler temel bir kahveye (**plain coffee**) isteğe bağlı eklemeler (**add-ons**) yapabilir: süt (**milk**), şeker (**sugar**), veya krema (**cream**).

### Problem
Eğer her kahve kombinasyonu için ayrı sınıflar oluşturursak (örneğin, `CoffeeWithMilk`, `CoffeeWithSugar`, `CoffeeWithMilkAndSugar`), sınıf sayısı hızla artar ve bakım zorlaşır. Kalıtım burada esnek bir çözüm değildir.

### Çözüm: Decorator Deseni
Decorator deseni ile temel kahve (**coffee**) bir arayüzle tanımlanır ve eklemeler dekoratör sınıflarıyla dinamik olarak eklenir:
- **Component (Bileşen):** `Coffee` arayüzü (temel kahve).
- **Concrete Component (Somut Bileşen):** `SimpleCoffee` (sade kahve).
- **Decorator (Dekoratör):** `CoffeeDecorator` (ek özellikler için temel sınıf).
- **Concrete Decorators (Somut Dekoratörler):** `MilkDecorator`, `SugarDecorator`, `CreamDecorator`.

### Kod Örneği (Pseudo-Code)
```java
// Component (Bileşen) Arayüzü
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Component (Somut Bileşen)
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Sade Kahve";
    }

    public double getCost() {
        return 5.0; // Temel kahve fiyatı
    }
}

// Decorator (Dekoratör) Soyut Sınıfı
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

// Concrete Decorators (Somut Dekoratörler)
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Süt";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 2.0; // Süt ek maliyeti
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Şeker";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 1.0; // Şeker ek maliyeti
    }
}

class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Krema";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 3.0; // Krema ek maliyeti
    }
}

// Kullanım
public class Main {
    public static void main(String[] args) {
        // Sade kahve
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " - " + coffee.getCost() + " TL");
        // Çıktı: Sade Kahve - 5.0 TL

        // Süt eklenmiş kahve
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - " + coffee.getCost() + " TL");
        // Çıktı: Sade Kahve, Süt - 7.0 TL

        // Süt ve şeker eklenmiş kahve
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " - " + coffee.getCost() + " TL");
        // Çıktı: Sade Kahve, Süt, Şeker - 8.0 TL

        // Süt, şeker ve krema eklenmiş kahve
        coffee = new CreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " - " + coffee.getCost() + " TL");
        // Çıktı: Sade Kahve, Süt, Şeker, Krema - 11.0 TL
    }
}