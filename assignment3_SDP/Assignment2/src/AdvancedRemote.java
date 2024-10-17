//Создаем продвинутый пульт управления который взаимствует свойства пульта управления
public class AdvancedRemote extends RemoteControl {

    //конструктор класса который берет свойства девайса взяв его как супер интерфейс
    public AdvancedRemote(Device device) {
        super(device);
    }

    //выключения звука
    public void mute() {
        System.out.println("Muting device");
        device.setVolume(0);
    }

    //сеттер любимого канала
    public void setFavouriteChannel() {
        System.out.println("Setting and moving to your favourite channel");
        device.setChannel(7);
    }

    //сеттер премиум каналов
    //допустим что список базы 100 каналов, а премиум начинается с 101-ого
    public void setPremiumChannels() {
        System.out.println("Setting and moving to premium channels");
        device.setChannel(101);
    }
}
