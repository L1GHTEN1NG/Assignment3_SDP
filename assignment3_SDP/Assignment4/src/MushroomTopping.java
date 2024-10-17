//Создаем класс для добавки грибов, он взаимствует свойства у класса топпинга
public class MushroomTopping extends ToppingDecorator {

    //конструктор, который берет свойства определяя интерфейс пиццы как супер интерфейс
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    //геттер для описания
    public String getDescription() {
        return pizzaWithTopping.getDescription() + ", topping: Mushrooms";
    }

    //геттер цены
    public double getCost() {
        return pizzaWithTopping.getCost() + 700;
    }
}
