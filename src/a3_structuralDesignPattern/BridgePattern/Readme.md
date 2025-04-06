# Bridge Design Pattern

## Tanım (Definition)
**Bridge Design Pattern (Köprü Tasarım Deseni)**, bir soyutlamayı (**abstraction**) gerçekleştirmesinden (**implementation**) ayırmak için kullanılan yapısal bir tasarım desenidir. Bu desen, soyutlama ile uygulama arasında bir "köprü" oluşturarak her ikisinin de bağımsız bir şekilde geliştirilmesine ve genişletilmesine olanak tanır. Böylece sistemin esnekliği artar, kod tekrarı azalır ve bağımlılıklar minimuma iner. Temel hedef, bir sınıf hiyerarşisini iki ayrı hiyerarşiye bölmektir:
- **Abstraction (Soyutlama):** Sistemin üst düzey mantığını tanımlar.
- **Implementation (Uygulama):** Alt düzeydeki teknik detayları içerir.

Bu desen, **"composition over inheritance" (kalıtım yerine bileşim)** prensibine dayanır ve özellikle birden fazla boyutta değişiklik beklendiğinde (örneğin, hem iş mantığı hem de altyapı) oldukça faydalıdır.

---

## Ne Zaman Kullanılır? (When to Use)
- Bir sistemde soyutlama ve uygulama katmanlarının ayrı ayrı gelişmesi gerektiğinde.
- Aynı soyutlamanın farklı uygulamalarla çalışması gerektiğinde.
- Kodun yeniden kullanılabilirliğini artırmak ve bakımını kolaylaştırmak istediğinizde.
- Kalıtım ile oluşabilecek karmaşık ve esnek olmayan sınıf hiyerarşilerinden kaçınmak istediğinizde.

---

## Avantajlar (Advantages)
- **Bağımsız Gelişim:** Soyutlama ve uygulama birbirinden bağımsız olarak genişletilebilir.
- **Esneklik:** Yeni soyutlamalar veya uygulamalar kolayca eklenebilir.
- **Kod Tekrarını Azaltır:** Aynı uygulamanın farklı soyutlamalarla paylaşılmasını sağlar.
- **Açık-Kapalı Prensibi (Open-Closed Principle):** Mevcut kodu değiştirmeden yeni özellikler eklenebilir.

---

## Dezavantajlar (Disadvantages)
- **Karmaşıklık Artışı:** Küçük projelerde gereksiz bir karmaşıklık yaratabilir.
- **Tasarım Zorluğu:** İlk tasarım aşamasında soyutlama ve uygulamayı doğru şekilde ayırmak zor olabilir.

---

## Örnek Senaryo: ITV ve Uzaktan Kumanda (ITV and Remote Example)
Bu README'de **Bridge Design Pattern**'ı, bir **ITV** arayüzü ve iki TV markası (**SonyTV** ve **SamsungTV**) ile **Remote** ve **AdvancedRemote** örneği üzerinden açıklayalım. Bir sistemde farklı TV markalarının farklı uzaktan kumanda türleri (temel ve gelişmiş) ile kontrol edilmesi gerektiğini düşünelim.

### Problem
Eğer her TV markası için her uzaktan kumanda türüne özel bir sınıf oluşturursak (örneğin, `SonyTVBasicRemote`, `SonyTVAdvancedRemote`, `SamsungTVBasicRemote`, `SamsungTVAdvancedRemote`), sınıf sayısı hızla artar ve bakım zorlaşır. Kalıtım burada esnek bir çözüm sunmaz.

### Çözüm: Bridge Deseni
Bridge deseni ile **ITV** soyutlamasını ve **Remote** uygulamasını ayırabiliriz:
- **Abstraction (Soyutlama):** `ITV` arayüzü ve somut sınıflar (örneğin, `SonyTV`, `SamsungTV`).
- **Implementation (Uygulama):** `Remote` arayüzü (örneğin, `BasicRemote`, `AdvancedRemote`).

`ITV` uygulayan sınıflar, bir `Remote` nesnesine sahip olur ve kontrol işlemlerini ona delege eder. Böylece yeni bir TV markası veya uzaktan kumanda eklemek diğerini etkilemez.

### Kod Örneği (Pseudo-Code)
```java
// Abstraction (Soyutlama) Arayüzü
public interface ITV {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
}

// Implementation (Uygulama) Arayüzü
interface Remote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

// Concrete Implementations (Somut Uygulamalar)
class BasicRemote implements Remote {
    private ITV tv;

    public BasicRemote(ITV tv) {
        this.tv = tv;
    }

    public void powerOn() {
        tv.turnOn();
    }

    public void powerOff() {
        tv.turnOff();
    }

    public void changeChannel(int channel) {
        tv.setChannel(channel);
    }
}

class AdvancedRemote implements Remote {
    private ITV tv;

    public AdvancedRemote(ITV tv) {
        this.tv = tv;
    }

    public void powerOn() {
        System.out.println("Gelişmiş kumanda ile açma işlemi...");
        tv.turnOn();
    }

    public void powerOff() {
        System.out.println("Gelişmiş kumanda ile kapama işlemi...");
        tv.turnOff();
    }

    public void changeChannel(int channel) {
        System.out.println("Gelişmiş kumanda ile kanal değiştiriliyor...");
        tv.setChannel(channel);
    }
}

// Refined Abstractions (Geliştirilmiş Soyutlamalar)
class SonyTV implements ITV {
    public void turnOn() {
        System.out.println("Sony TV açılıyor.");
    }

    public void turnOff() {
        System.out.println("Sony TV kapanıyor.");
    }

    public void setChannel(int channel) {
        System.out.println("Sony TV kanal: " + channel);
    }
}

class SamsungTV implements ITV {
    public void turnOn() {
        System.out.println("Samsung TV açılıyor.");
    }

    public void turnOff() {
        System.out.println("Samsung TV kapanıyor.");
    }

    public void setChannel(int channel) {
        System.out.println("Samsung TV kanal: " + channel);
    }
}

// Kullanım
public class Main {
    public static void main(String[] args) {
        ITV sonyTV = new SonyTV();
        ITV samsungTV = new SamsungTV();

        Remote basicRemote = new BasicRemote(sonyTV);
        Remote advancedRemote = new AdvancedRemote(samsungTV);

        basicRemote.powerOn();        // Çıktı: Sony TV açılıyor.
        basicRemote.changeChannel(5); // Çıktı: Sony TV kanal: 5
        basicRemote.powerOff();       // Çıktı: Sony TV kapanıyor.

        advancedRemote.powerOn();        // Çıktı: Gelişmiş kumanda ile açma işlemi... Samsung TV açılıyor.
        advancedRemote.changeChannel(3); // Çıktı: Gelişmiş kumanda ile kanal değiştiriliyor... Samsung TV kanal: 3
        advancedRemote.powerOff();       // Çıktı: Gelişmiş kumanda ile kapama işlemi... Samsung TV kapanıyor.
    }
}
```

## Açıklama (Explanation)
- `ITV` arayüzü, TV'nin temel işlevlerini tanımlar.
- `Remote` arayüzü, uzaktan kumandanın temel işlevlerini tanımlar.
- `BasicRemote` ve `AdvancedRemote`, `Remote` arayüzünü uygulayan somut sınıflardır.
- `SonyTV` ve `SamsungTV`, `ITV` arayüzünü uygulayan somut sınıflardır.
- `Main` sınıfında, `ITV` ve `Remote` nesneleri oluşturulur ve kullanılır. Bu sayede yeni bir TV markası veya uzaktan kumanda türü eklemek kolaylaşır.
- Kod, soyutlama ve uygulama arasındaki bağımlılığı azaltarak esnek bir yapı sunar. Yeni bir TV markası veya uzaktan kumanda türü eklemek için mevcut kodu değiştirmek gerekmez, sadece yeni sınıflar eklenir.
- Bu desen, sistemin genişletilebilirliğini artırır ve bakımını kolaylaştırır. Ayrıca, kod tekrarını azaltarak daha temiz ve anlaşılır bir yapı sağlar.
- Sonuç olarak, Bridge Design Pattern, karmaşık sistemlerde esneklik ve genişletilebilirlik sağlamak için etkili bir yöntemdir. Bu desen, özellikle farklı soyutlamaların ve uygulamaların birlikte çalışması gereken durumlarda oldukça faydalıdır.
