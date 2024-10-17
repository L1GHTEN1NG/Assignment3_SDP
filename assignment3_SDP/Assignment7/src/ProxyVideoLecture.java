//Создали класс прокси видео лекции, который взаимствует свойства интерфейса
public class ProxyVideoLecture implements VideoLecture {
    //Также создается тайтл и класс видеолекции
    private String title;
    private RealVideoLecture realVideoLecture;

    //конструктор видеолекции
    public ProxyVideoLecture(String title) {
        this.title = title;
    }

    //метод получения информации
    public void getInfo() {
        System.out.println("Has information about " + title);
    }

    //метод проигрывателя, если его нет, то не проигрывается
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title);
        }
        realVideoLecture.play();
    }
}
