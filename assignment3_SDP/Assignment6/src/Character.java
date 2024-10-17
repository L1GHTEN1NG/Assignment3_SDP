//Создаем класс для символа
public class Character {
    //у которого есть составляющее значения, шрифта и размера
    private char value;
    private String font;
    private int size;

    //конструктор класса
    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    //метод определения позиции по икс и уай
    public void position(int x, int y) {
        System.out.println("Your character " + value + " has categories: font - " + font + ", size - " + size);
    }
}
