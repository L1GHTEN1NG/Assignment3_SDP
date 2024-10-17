//Мы создали класс мп3 плэйер, который взаимствует свойства интерфейса аудиоплэйера
public class MP3Player implements AudioPlayer {
    //он также взаимствует метод плэй с теми же двумя ячейками
    public void play(String audioType, String fileName) {
        //если данный тип аудио равен мп3, то проигрываем его
        if(audioType.equals("mp3")) {
            System.out.println(fileName + " playing. Type of audio: mp3");
        }
        //если нет, то выводим сообщение о том, что формат не подошел
        else {
            System.out.println(audioType + " can't played. Because, type isn't mp3, not supported.");
        }
    }
}