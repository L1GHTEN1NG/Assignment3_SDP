//Создаем абстрактный класс топпинга, который взаимствует свойства интерфейса пиццы
public abstract class ToppingDecorator implements Pizza {
    //создаем объект пиццы
    protected Pizza pizzaWithTopping;

    //конструктор класса
    public ToppingDecorator(Pizza pizza) {
        this.pizzaWithTopping = pizza;
    }

    //геттер для описания
    public String getDescription() {
        return pizzaWithTopping.getDescription();
    }

    //геттер для цены
    public double getCost() {
        return pizzaWithTopping.getCost();
    }
}
