//Создаем конкретный класс для ТВ, который взаимствует свойства интерфейса девайсов
public class TVDevice implements Device {
    //создаем категории канала и звука
    private int channel;
    private int volume;

    //также взаимствует метод включения
    public void powerOn() {
        System.out.println("TV: Power on");
    }

    //и выключения
    public void powerOff() {
        System.out.println("TV: Power off");
    }

    //также сеттер для канала
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println(channel + " channel is set to TV");
    }

    //и сеттер для звука
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(volume + " volume is set to TV");
    }
}
