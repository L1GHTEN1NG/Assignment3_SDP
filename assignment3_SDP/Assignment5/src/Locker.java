//Создал класс для дверного замка, который открывается на пароль
public class Locker {
    public void lockDoor() {
        System.out.println("Your door is locked");
    }

    public void openDoor(int password){
        if (password == 456) {
            System.out.println("Your door is open");
        } else{
            System.out.println("Get out of here, thief!");
        }
    }
}