//Создаем класс для составляющей меню
public class MenuItem extends MenuComponent {
    //создаем атрибуты имени, объяснения и цены
    private String name;
    private String description;
    private double price;

    //конструктор класса
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    //метод геттера имени
    public String getName() {
        return name;
    }

    //метод геттера объяснения
    public String getDescription() {
        return description;
    }

    //метод геттера цены
    public double getPrice() {
        return price;
    }

    //метод вывода на экран
    public void print() {
        System.out.println("Type of dish is " + getName() + ": " + getDescription() + ", price:" + getPrice());
    }
}
