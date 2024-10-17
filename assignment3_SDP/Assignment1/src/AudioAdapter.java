//Как и просили, создали класс аудио адаптер, который взаимствует свойства интерфейса аудио плэера
public class AudioAdapter implements AudioPlayer {
    //Создали продвинутый аудио плэер через его класс
    AdvancedAudioPlayer advancedAudioPlayer;

    //конструктор нашего класса, который принимает тип аудио и
    //создает новый продвинутый плэер для типов вав и аас
    public AudioAdapter(String audioType) {
        if(audioType.equals("wav")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
        else if(audioType.equals("aac")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
    }

    //Взаимствует метод плэй с теми же аргументами, который выводит отдельные методы для вав и аас
    public void play(String audioType, String fileName) {
        if(audioType.equals("wav")) {
            advancedAudioPlayer.playWAV(fileName);
        }
        else if(audioType.equals("aac")) {
            advancedAudioPlayer.playAAC(fileName);
        }
    }
}
