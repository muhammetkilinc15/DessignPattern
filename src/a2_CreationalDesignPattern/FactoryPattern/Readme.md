# 🏭 Factory Pattern

## 📌 Tanım
**Factory Pattern**, nesne oluşturmayı bir sınıfa devrederek **bağımlılıkları azaltan** ve **esnekliği artıran** bir tasarım desenidir.  
Bu desen, istemcinin nesneleri **hangi sınıftan türeteceğini bilmesine gerek kalmadan** nesne oluşturmasını sağlar.

## 🎯 Amaç
- **Nesne oluşturmayı merkezileştirmek**
- **Bağımlılığı azaltmak**
- **Gelecekte kolay genişletilebilirlik sağlamak**

---

## 📌 UML Diyagramı

```plaintext
       Factory
         ▲
 ┌──────┴──────┐
ProductA   ProductB
```

---

## 📂 Klasör Yapısı

```
factory/
│── products/        # Concrete ve Abstract Product sınıfları
│── Factory.java     # Factory sınıfı
│── Main.java        # Kullanım örneği
```

---

## 🛠 Kullanım Senaryosu
Bir **araç üretim sistemi** geliştirdiğimizi düşünelim.  
**Factory Pattern** kullanarak **Otomobil ve Kamyon nesnelerini** oluşturacağız.

### **1️⃣ Abstract Product (Ortak Arayüz)**
```java
public interface Vehicle {
    void drive();
}
```

### **2️⃣ Concrete Products (Ürün Sınıfları)**
```java
public class Car implements Vehicle {
    public void drive() {
        System.out.println("🚗 Car is driving!");
    }
}

public class Truck implements Vehicle {
    public void drive() {
        System.out.println("🚚 Truck is driving!");
    }
}
```

### **3️⃣ Factory Class (Fabrika)**
```java
public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }
}
```

### **4️⃣ Kullanım Örneği**
```java
public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive();
    }
}
```

---

## ✅ Avantajlar
✔ **Bağımlılığı azaltır**: Ana kod, nesne oluşturma detaylarını bilmez.  
✔ **Kod tekrarını önler**: Tüm nesne oluşturma işlemleri tek bir yerde yönetilir.  
✔ **Esneklik sağlar**: Yeni bir ürün eklemek için Factory'yi genişletmek yeterlidir.

## ❌ Dezavantajlar
❌ **Kod karmaşıklığını artırabilir**: Küçük projelerde gereksiz olabilir.  
❌ **Yeni tür eklerken Factory güncellenmelidir**: Open-Closed Principle'a tam uymaz.

---

## 🚀 Kullanım Alanları
✅ **Veri tabanı bağlantıları** (MySQL, PostgreSQL vb.)  
✅ **GUI bileşen üretimi** (Button, TextBox vb.)  
✅ **Oyun geliştirme** (Farklı karakter türleri)

---

## 📚 Kaynaklar
- [Factory Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/factory-method)
- [Factory Pattern - GeeksforGeeks](https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/)  
