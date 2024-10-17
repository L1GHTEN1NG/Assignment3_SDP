//Создал класс для кондицонера, который ставит температуру при ее выборе,
//также у него есть моды для сна и сохранения энергии
public class Conditioner {
    public void setTemp(int temp) {
        System.out.println("Temperature in your room is " + temp + " degrees.");
    }

    public void energySafeMode() {
        System.out.println("Temperature in your room is 20 degrees.");
    }

    public void sleepMode() {
        System.out.println("Temperature in your room is 24 degrees.");
    }
}
