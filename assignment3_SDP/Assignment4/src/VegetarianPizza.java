//Создаем класс Вегетерианской пиццы, которая взаимствует свойства интерфейса пиццы
public class VegetarianPizza implements Pizza {

    //геттер для описания пиццы
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    //геттер для цены
    public double getCost() {
        return 1500;
    }
}
