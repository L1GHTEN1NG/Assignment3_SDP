//Мы создали интерфейс аудиоплеера как и сказано
public interface AudioPlayer {
    //добавили туда метод плэй, который захватывает два аргумента тип аудио и названия файла
    void play(String audioType, String fileName);
}
