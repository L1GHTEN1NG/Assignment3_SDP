//Создаем конкретный класс для Звуковой Системы, который взаимствует свойства интерфейса девайсов
public class SoundSystemDevice implements Device {
    //создаем категорию только для звука, потому что он не может иметь категорию канала
    private int volume;

    //также взаимствует метод включения
    public void powerOn() {
        System.out.println("Sound System: Power on");
    }

    //и выключения
    public void powerOff() {
        System.out.println("Sound System: Power off");
    }

    //также сеттер для канала
    public void setChannel(int channel) {
        System.out.println("Sound System can't have to be channels");
    }

    //и сеттер для звука
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(volume + " volume is set to Sound System");
    }
}
