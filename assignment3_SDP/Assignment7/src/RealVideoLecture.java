//Создали класс видео лекции, который взаимствует свойства интерфейса
public class RealVideoLecture implements VideoLecture {
    //Создаем составляющее названия
    private String title;

    //конструктор класса
    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    //метод загрузки видео
    private void loadVideo() {
        System.out.println(title + " loaded to the channel");
    }

    //метод получения инфы о нем
    public void getInfo() {
        System.out.println("Additional information: " + title);
    }

    //метод для проигрывания
    public void play() {
        System.out.println(title + " video played on player");
    }
}
