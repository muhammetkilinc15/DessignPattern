package a3_structuralDesignPattern.BridgePattern;

public class SmartRemoteControl extends RemoteControl{
    public SmartRemoteControl(ITV tv) {
        super(tv);
    }

    public void nextChannel() {
        int randomChannel = (int)(Math.random() * 100 + 1);
        System.out.println("Sonraki kanala geçiliyor...");
        setChannel(randomChannel);
    }

    public void previousChannel() {
        int randomChannel = (int)(Math.random() * 100 + 1);
        System.out.println("Önceki kanala geçiliyor...");
        setChannel(randomChannel);
    }
}
