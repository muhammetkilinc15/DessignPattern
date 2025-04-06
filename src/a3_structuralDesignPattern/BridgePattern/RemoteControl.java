package a3_structuralDesignPattern.BridgePattern;

public class RemoteControl {
    protected ITV tv;

    public RemoteControl(ITV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void setChannel(int channel) {
        tv.setChannel(channel);
    }
}