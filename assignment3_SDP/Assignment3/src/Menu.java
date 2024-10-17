//Импортируем библиотеки для хранения списка блюд
import java.util.ArrayList;
import java.util.List;

//Создаем класс меню, который взаимствует свойства класса компоненты меню
public class Menu extends MenuComponent {
    //создаем список компонентов, название и объяснение
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    //конструктор класса
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //метод добавления компонента
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    //метод удаления компонента
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    //геттер для имени
    public String getName() {
        return name;
    }

    //геттер для объяснения
    public String getDescription() {
        return description;
    }

    //метод вывода
    public void print() {
        System.out.println("Name of menu group: " + getName() + ": " + getDescription());
        System.out.println("---------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
