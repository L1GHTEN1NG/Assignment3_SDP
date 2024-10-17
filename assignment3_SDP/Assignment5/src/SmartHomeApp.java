//Создали класс приложения умного дома для проверки функционала
public class SmartHomeApp {
    public static void main(String[] args) {
        //тут мы создали каждое составляющее
        Lights lights = new Lights();
        TV tv = new TV();
        Conditioner conditioner = new Conditioner();
        Locker locker = new Locker();

        //Создаем фасад умного дома
        SmartHomeFacade smartHome = new SmartHomeFacade(lights, tv, conditioner, locker);

        //используем режимы для проверки
        smartHome.leaveHome();
        System.out.println("---------------------------");

        smartHome.arriveHome();
        System.out.println("---------------------------");

        smartHome.nightMode();
        System.out.println("---------------------------");

        smartHome.movieMode();
    }
}
