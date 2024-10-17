//Создаем абстрактный класс пульта управления
public abstract class RemoteControl {
    //который имеет аргумент девайса
    protected Device device;

    //конструктор класс
    public RemoteControl(Device device) {
        this.device = device;
    }

    //метод включения
    public void powerOn() {
        device.powerOn();
    }

    //метод выключения
    public void powerOff() {
        device.powerOff();
    }

    //сеттер канала
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    //сеттер звука
    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}
