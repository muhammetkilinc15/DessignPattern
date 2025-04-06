package a3_structuralDesignPattern.BridgePattern;

public class LGTV implements ITV {
    public void turnOn() {
        System.out.println("LG TV açıldı.");
    }

    public void turnOff() {
        System.out.println("LG TV kapandı.");
    }

    public void setChannel(int channel) {
        System.out.println("LG TV kanal " + channel + "‘a ayarlandı.");
    }
}

