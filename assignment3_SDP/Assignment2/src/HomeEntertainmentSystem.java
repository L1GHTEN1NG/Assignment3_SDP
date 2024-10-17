//Создаем класс Домашней Системы Развлечений
public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        //тут создаем разные девайсы: телик, дивиди и звуковая системы
        Device TV = new TVDevice();
        Device DVD = new DVDDevice();
        Device SoundSystem = new SoundSystemDevice();

        //через пульт управления используем телевизор и его методы
        RemoteControl basicRemote = new BasicRemote(TV);
        basicRemote.powerOn();
        basicRemote.setChannel(8);
        basicRemote.setVolume(80);
        basicRemote.powerOff();

        //через пульт управления используем телевизор и его методы, только тут уже продвинутый пульт
        RemoteControl advancedRemote = new AdvancedRemote(DVD);
        advancedRemote.powerOn();
        advancedRemote.setChannel(2);
        advancedRemote.setVolume(25);
        advancedRemote.setFavouriteChannel();
        advancedRemote.setPremiumChannels();
        advancedRemote.powerOff();

        //через пульт управления используем звуковую систему и ее методы
        basicRemote = new BasicRemote(SoundSystem);
        basicRemote.powerOn();
        basicRemote.mute;
        basicRemote.powerOff();
    }
}
