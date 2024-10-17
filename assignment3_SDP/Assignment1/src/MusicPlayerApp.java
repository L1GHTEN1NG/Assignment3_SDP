//Создаем класс Приложение Музыкального Плэйера, который показывает функционал наших классов плэеров
public class MusicPlayerApp {
    public static void main(String[] args) {
        //создаем новый мп3 плэйер через интерфейс
        AudioPlayer player = new MP3Player();

        //используем встроенный метод плэй
        player.play("mp3", "song.mp3");

        //создаем новый плэйер вав через аудио адаптер
        //и испольуем метод плэй
        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "song.wav");

        //создаем новый плэйер аас через аудио адаптер
        //и испольуем метод плэй
        AudioPlayer aacPlayer = new AudioAdapter("aac");
        aacPlayer.play("aac", "song.aac");
    }
}
