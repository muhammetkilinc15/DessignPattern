# Tasarım Desenleri ve SOLID Prensipleri

Bu proje, yazılım mühendisliğinde yaygın olarak kullanılan **Tasarım Desenleri** (Design Patterns) ve **SOLID Prensipleri** üzerine odaklanmaktadır. Bu proje, yazılım geliştirme sürecinde karşılaşılan yaygın problemlere çözüm sunmayı amaçlayan tasarım desenlerini ve her bir deseni uygularken dikkat edilmesi gereken **SOLID** prensiplerini açıklamaktadır.

## İçindekiler

- [Giriş](#giriş)
- [SOLID Prensipleri](#solid-prensipleri)
    - [Single Responsibility Principle](#single-responsibility-principle-srp)
    - [Open/Closed Principle](#openclosed-principle-ocp)
    - [Liskov Substitution Principle](#liskov-substitution-principle-lsp)
    - [Interface Segregation Principle](#interface-segregation-principle-isp)
    - [Dependency Inversion Principle](#dependency-inversion-principle-dip)
- [Tasarım Desenleri](#tasarım-desenleri)
    - [Creational Desenler](#creational-desenler)
    - [Structural Desenler](#structural-desenler)
    - [Behavioral Desenler](#behavioral-desenler)
- [Kullanım](#kullanım)
- [Katkı](#katkı)
- [Lisans](#lisans)

## Giriş

Yazılım geliştirme sürecinde, projelerin daha sürdürülebilir, modüler ve anlaşılır olması için bazı tasarım prensiplerine ve desenlerine ihtiyaç duyulur. Bu proje, **Tasarım Desenleri** ve **SOLID Prensipleri** üzerinde durarak, yazılım geliştirme sürecini daha verimli hale getirmeyi amaçlamaktadır.

### Neden SOLID?
SOLID prensipleri, yazılım tasarımını düzenlemeye yönelik güçlü kurallardır. Bu prensipler, yazılımın esnekliğini artırır, kod tekrarını önler ve bakım sürecini kolaylaştırır. SOLID prensipleri şunlardır:

1. **Single Responsibility Principle (SRP)**: Her sınıfın yalnızca bir sorumluluğu olmalıdır.
2. **Open/Closed Principle (OCP)**: Yazılım varlıkları (sınıflar, fonksiyonlar, modüller) uzatılabilir ancak değiştirilmemelidir.
3. **Liskov Substitution Principle (LSP)**: Alt sınıflar, üst sınıfların yerine kullanılabilir olmalıdır.
4. **Interface Segregation Principle (ISP)**: Bir sınıf, kullanmadığı bir interface’e bağlı olmamalıdır.
5. **Dependency Inversion Principle (DIP)**: Yüksek seviyeli modüller, düşük seviyeli modüllere bağımlı olmamalıdır. İkisi de soyutlamalara bağımlı olmalıdır.

Her bir SOLID prensibi, yazılım projelerinde daha temiz, anlaşılır ve sürdürülebilir bir yapı inşa etmemize yardımcı olur.

## Tasarım Desenleri

Tasarım desenleri, yazılım geliştirme sürecinde karşılaşılan yaygın problemleri çözmek için geliştirilmiş, tekrar kullanılabilir çözüm yollarıdır. Desenler, belirli bir problem durumunda, en iyi çözümü sunmak için bir "şablon" görevi görür.

Bu projede aşağıdaki tasarım desenleri ele alınmaktadır:

### Creational Desenler
Bu grup, nesne yaratma ile ilgili desenleri içerir. Amaç, nesne oluşturma sürecini soyutlayarak esneklik kazandırmaktır.

- **Singleton**
- **Factory Method**
- **Abstract Factory**: [Kaynak Kodu](https://github.com/muhammetkilinc15/DessignPattern/tree/Master/src/a2_CreationalDesignPattern/AbstractFactoryPattern)
- **Builder**
- **Prototype**

### Structural Desenler
Yapısal desenler, sınıfların ve nesnelerin birbirleriyle nasıl ilişkilendirileceği üzerine odaklanır. Amaç, yazılımın yapısını modüler hale getirmektir.

- **Adapter**
- **Bridge**
- **Composite**
- **Decorator**
- **Facade**
- **Flyweight**
- **Proxy**

### Behavioral Desenler
Davranışsal desenler, nesnelerin ve sınıfların birbirleriyle nasıl etkileşimde bulunduğuna odaklanır. Bu desenler, yazılımın davranışlarını yönetir ve esnekliği artırır.

- **Chain of Responsibility**
- **Command**
- **Interpreter**
- **Iterator**
- **Mediator**
- **Memento**
- **Observer**
- **State**
- **Strategy**
- **Template Method**
- **Visitor**

## Kullanım

Projeyi kullanmak için, ilgili deseni ve örneğini inceleyebilir, her deseni nasıl uygulayabileceğinize dair fikir sahibi olabilirsiniz. Ayrıca, **SOLID prensiplerine** uygun tasarım yapıları ve örnekler, yazılım geliştirme sürecinizde size rehberlik edecektir.

## Katkı

Bu projeye katkı sağlamak isterseniz, öncelikle bu reposu **fork** edin, ardından yaptığınız değişiklikleri **pull request** ile gönderin. Herhangi bir sorunuz veya öneriniz olursa, **issues** bölümünden bize ulaşabilirsiniz.

## Lisans

Bu proje, [MIT Lisansı](LICENSE) ile lisanslanmıştır.
