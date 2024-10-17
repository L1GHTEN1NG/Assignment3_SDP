//Создаем класс пиццы Маргариты, который взаимствует свойства интерфейса пиццы
public class MargheritaPizza implements Pizza {

    //также геттер для описания
    public String getDescription() {
        return "Margherita Pizza";
    }

    //геттер для цены
    public double getCost() {
        return 1700;
    }
}
