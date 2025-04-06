package a3_structuralDesignPattern.BridgePattern;

public class PhilipsTV implements ITV {
    public void turnOn() {
        System.out.println("Philips TV açıldı.");
    }

    public void turnOff() {
        System.out.println("Philips TV kapandı.");
    }

    public void setChannel(int channel) {
        System.out.println("Philips TV kanal " + channel + "‘a ayarlandı.");
    }
}
