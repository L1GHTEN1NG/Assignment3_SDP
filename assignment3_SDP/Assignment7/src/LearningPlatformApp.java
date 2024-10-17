//Класс приложения учебной платформы для проверки функционала
public class LearningPlatformApp {
    public static void main(String[] args) {
        //создаем онлайн курс
        OnlineCourse course = new OnlineCourse();

        //Добавляем лекции с прокси
        course.addLecture(new ProxyVideoLecture("Lecture 1: Introduction to HTML and CSS"));
        course.addLecture(new ProxyVideoLecture("Lecture 2: Advanced CSS"));
        course.addLecture(new ProxyVideoLecture("Lecture 3: Intro to JS"));

        //Получаем информацию о лекциях
        course.getLectureInfo(0);
        course.getLectureInfo(1);

        System.out.println("---------------------------------");

        //Воспроизводим лекции
        course.playLecture(0);
        course.playLecture(1);
    }
}
