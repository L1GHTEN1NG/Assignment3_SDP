//Создаем интерфейс для всех девайсов
public interface Device {
    //добавляем туда методы включение, выключения, сохранения канала и звука
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void setVolume(int volume);
}
