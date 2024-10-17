//Создаем фасад умного дома, который имеет в себе разные режимы и контролирует процессы внутри дома
public class SmartHomeFacade {
    //Например, мы сощдали составляющие света, телевизора, кондиционера и локера для двери
    private Lights lights;
    private TV tv;
    private Conditioner conditioner;
    private Locker locker;

    //конструктор класса
    public SmartHomeFacade(Lights lights, TV tv, Conditioner conditioner, Locker locker) {
        this.lights = lights;
        this.tv = tv;
        this.conditioner = conditioner;
        this.locker = locker;
    }

    //режим ухода из дома
    public void leaveHome() {
        lights.turnOff();
        tv.turnOff();
        conditioner.energySafeMode();
        locker.lockDoor();
        System.out.println("~Host leaving from home~");
    }

    //режим прихода домой
    public void arriveHome() {
        lights.turnOn();;
        conditioner.setTemp(25);
        locker.openDoor(456);
        System.out.println("~Host arriving home~");
    }

    //ночной режим
    public void nightMode() {
        lights.turnOff();
        lights.automaticNightLamp();
        conditioner.sleepMode();
        tv.turnOff();
        System.out.println("~It's time to relax! Host wants to sleep~");
    }

    //режим для просмотра фильмов
    public void movieMode() {
        lights.turnOff();
        tv.turnOn();
        tv.movieBackLights();
        conditioner.setTemp(22);
        System.out.println("~It's time to watch movie! Host wants to see interesting film~");
    }
}
