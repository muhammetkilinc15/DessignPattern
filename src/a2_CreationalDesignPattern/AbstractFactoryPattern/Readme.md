# 🏭 Abstract Factory Pattern

## 📌 Tanım
**Abstract Factory**, nesne oluşturmayı bir üst seviye fabrika ile yöneterek **ilgili nesnelerin bir arada üretilmesini** sağlayan bir tasarım desenidir.  
Factory Pattern'den farkı, **farklı ürün ailelerini** yönetebilmesi ve birden fazla nesneyi **uyumlu** şekilde oluşturabilmesidir.

---

## 🎯 Amaç
- **Birbiriyle ilişkili nesneleri birlikte üretmek**
- **Nesne oluşturma mantığını istemciden soyutlamak**
- **Bağımlılığı azaltarak kodun genişletilebilirliğini artırmak**

---

## 📌 UML Diyagramı

```plaintext
        AbstractFactory
             ▲
  ┌─────────┴─────────┐
ConcreteFactoryA  ConcreteFactoryB
     ▲                 ▲
 ProductA1         ProductB1
 ProductA2         ProductB2
```

---

## 📂 Klasör Yapısı

```
abstract-factory/
│── factories/        # Concrete ve Abstract Factory sınıfları
│── products/         # Concrete ve Abstract Product sınıfları
│── Main.java         # Kullanım örneği
```

---

## 🛠 Kullanım Senaryosu
Bir **grafik arayüz (GUI) kütüphanesi** geliştirdiğimizi düşünelim.  
Farklı **tema destekleri** (Light ve Dark) için **Abstract Factory Pattern** kullanacağız.

---

### **1️⃣ Abstract Product (Ortak Arayüzler)**
```java
// Button Arayüzü
public interface Button {
    void render();
}

// Checkbox Arayüzü
public interface Checkbox {
    void check();
}
```

---

### **2️⃣ Concrete Products (Gerçek Ürünler)**
```java
// Light Mode için Button
public class LightButton implements Button {
    public void render() {
        System.out.println("☀️ Light Button Rendered");
    }
}

// Dark Mode için Button
public class DarkButton implements Button {
    public void render() {
        System.out.println("🌙 Dark Button Rendered");
    }
}

// Light Mode için Checkbox
public class LightCheckbox implements Checkbox {
    public void check() {
        System.out.println("☀️ Light Checkbox Checked");
    }
}

// Dark Mode için Checkbox
public class DarkCheckbox implements Checkbox {
    public void check() {
        System.out.println("🌙 Dark Checkbox Checked");
    }
}
```

---

### **3️⃣ Abstract Factory (Soyut Fabrika Arayüzü)**
```java
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

---

### **4️⃣ Concrete Factories (Gerçek Fabrikalar)**
```java
// Light Mode için Fabrika
public class LightFactory implements GUIFactory {
    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}

// Dark Mode için Fabrika
public class DarkFactory implements GUIFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
```

---

### **5️⃣ Kullanım Örneği**
```java
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new DarkFactory(); // Tema değiştirilebilir
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.check();
    }
}
```

---

## ✅ Avantajlar
✔ **Bağımlılığı azaltır**: İstemci, hangi nesneleri oluşturduğunu bilmez.  
✔ **Kod tekrarını önler**: Tüm ürünler tek bir noktada yönetilir.  
✔ **Birbiriyle uyumlu nesneler üretir**: Aynı fabrikadan gelen nesneler uyumludur.  
✔ **Gelecekte kolay genişletilebilir**: Yeni ürünler eklemek kolaydır.

---

## ❌ Dezavantajlar
❌ **Karmaşıklık artar**: Yeni bir ürün eklemek için fabrikalar da güncellenmelidir.  
❌ **Daha fazla kod gerektirir**: Factory Method'a göre daha fazla soyutlama yapılır.

---

## 🚀 Kullanım Alanları
✅ **GUI Kütüphaneleri**: Farklı platformlar için arayüz bileşenleri üretmek.  
✅ **Veritabanı Bağlantıları**: Farklı veritabanlarına (MySQL, PostgreSQL) uygun nesneler oluşturmak.  
✅ **Oyun Geliştirme**: Farklı oyun motorlarına uygun nesne üretimi.

---

## 📚 Kaynaklar
- [Abstract Factory - Refactoring Guru](https://refactoring.guru/design-patterns/abstract-factory)
- [Abstract Factory - GeeksforGeeks](https://www.geeksforgeeks.org/abstract-factory-pattern/)  
