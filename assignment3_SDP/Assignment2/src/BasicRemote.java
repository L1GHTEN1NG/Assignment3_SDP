//Создаем простой пуль управления который взаимствует свойства пульта управления
public class BasicRemote extends RemoteControl {

    //конструктор класса который берет свойства девайса взяв его как супер интерфейс
    public BasicRemote(Device device) {
        super(device);
    }

    //выключения звука
    public void mute() {
        System.out.println("Muting device");
        device.setVolume(0);
    }
}
