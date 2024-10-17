//Создали класс Продвинутого Аудио Плэйера, который взаимствует свойства интерфейсов вав и аас плэйеров
public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    //взаимствует метод плэй вав
    public void playWAV(String fileName) {
        System.out.println(fileName + " playing. Type of audio: wav");
    }

    //взаимствует метод плэй аас
    public void playAAC(String fileName) {
        System.out.println(fileName + " playing. Type of audio: aac");
    }
}