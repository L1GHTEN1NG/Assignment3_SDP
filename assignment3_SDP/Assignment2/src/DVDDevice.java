//Создаем конкретный класс для Дивиди, который взаимствует свойства интерфейса девайсов
public class DVDDevice implements Device {
    //создаем категории канала и звука
    private int volume;
    private int channel;

    //также взаимствует метод включения
    public void powerOn() {
        System.out.println("DVD: Power on");
    }

    //и выключения
    public void powerOff() {
        System.out.println("DVD: Power off");
    }

    //также сеттер для канала
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println(channel + " channel is set to DVD");
    }

    //и сеттер для звука
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(volume + " volume is set to DVD");
    }
}
