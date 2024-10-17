//Создаем класс для добавки сыра, он взаимствует свойства у класса топпинга
public class CheeseTopping extends ToppingDecorator {

    //конструктор, который берет свойства определяя интерфейс пиццы как супер интерфейс
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    //геттер для описания
    public String getDescription() {
        return pizzaWithTopping.getDescription() + ", topping: Cheese";
    }

    //геттер цены
    public double getCost() {
        return pizzaWithTopping.getCost() + 700;
    }
}
