//Испортируем библиотеки списков для работы с видеолекциями
import java.util.ArrayList;
import java.util.List;

//Создаем класс онлайн курса по лекциям
public class OnlineCourse {
    //Список лекций создаем
    private List<VideoLecture> lectures = new ArrayList<>();

    //метод добавления лекций в курс
    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    //метод получения дополнительной инфы
    public void getLectureInfo(int index) {
        if (index < lectures.size()) {
            lectures.get(index).getInfo();
        } else {
            System.out.println("Lecture not found.");
        }
    }

    //метод проигрывателя
    public void playLecture(int index) {
        if (index < lectures.size()) {
            lectures.get(index).play();
        } else {
            System.out.println("Lecture not found.");
        }
    }
}
