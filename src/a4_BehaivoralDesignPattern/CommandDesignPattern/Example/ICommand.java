package a4_BehaivoralDesignPattern.CommandDesignPattern.Example;

// 1. Command Arayüzü
public interface ICommand {
    void Execute();
    void Undo(); // İsteğe bağlı: geri alma işlemi
}

// 2. Receiver (Gerçek işi yapan sınıf)
class Light {
    public void TurnOn() {
        System.out.println("Light is ON");
    }

    public void TurnOff() {
        System.out.println("Light is OFF");
    }
}

// 3. ConcreteCommand: Işığı aç
class TurnOnCommand implements ICommand {
    private final Light _light;

    public TurnOnCommand(Light light) {
        _light = light;
    }

    @Override
    public void Execute() {
        _light.TurnOn();
    }

    @Override
    public void Undo() {
        _light.TurnOff();
    }
}

// 4. ConcreteCommand: Işığı kapat
class TurnOffCommand implements ICommand {
    private final Light _light;

    public TurnOffCommand(Light light) {
        _light = light;
    }

    @Override
    public void Execute() {
        _light.TurnOff();
    }

    @Override
    public void Undo() {
        _light.TurnOn();
    }
}

// 5. Invoker: Komutu tetikleyen sınıf
class RemoteControl {
    private ICommand _command;

    public void SetCommand(ICommand command) {
        _command = command;
    }

    public void PressButton() {
        _command.Execute();
    }
}

class Client {
    public static void main(String[] args) {
        Light light = new Light();
        ICommand turnOnCommand = new TurnOnCommand(light);
        ICommand turnOffCommand = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.SetCommand(turnOnCommand);
        remoteControl.PressButton();

        remoteControl.SetCommand(turnOffCommand);
        remoteControl.PressButton();

    }
}

