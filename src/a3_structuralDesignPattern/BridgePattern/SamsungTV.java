package a3_structuralDesignPattern.BridgePattern;

public class SamsungTV implements ITV {
    public void turnOn() {
        System.out.println("Samsung TV açıldı.");
    }

    public void turnOff() {
        System.out.println("Samsung TV kapandı.");
    }

    public void setChannel(int channel) {
        System.out.println("Samsung TV kanal " + channel + "‘a ayarlandı.");
    }
}

