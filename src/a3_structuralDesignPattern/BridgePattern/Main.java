package a3_structuralDesignPattern.BridgePattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Samsung TV ==");
        ITV samsung = new SamsungTV();
        SmartRemoteControl samsungRemote = new SmartRemoteControl(samsung);
        samsungRemote.turnOn();
        samsungRemote.setChannel(7);
        samsungRemote.nextChannel();
        samsungRemote.turnOff();

        System.out.println("\n== LG TV ==");
        ITV lg = new LGTV();
        SmartRemoteControl lgRemote = new SmartRemoteControl(lg);
        lgRemote.turnOn();
        lgRemote.setChannel(11);
        lgRemote.previousChannel();
        lgRemote.turnOff();

        System.out.println("\n== Philips TV ==");
        ITV philips = new PhilipsTV();
        SmartRemoteControl philipsRemote = new SmartRemoteControl(philips);
        philipsRemote.turnOn();
        philipsRemote.setChannel(21);
        philipsRemote.nextChannel();
        philipsRemote.turnOff();
    }
}
