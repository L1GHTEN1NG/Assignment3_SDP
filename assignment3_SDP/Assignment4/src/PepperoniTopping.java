//Создаем класс для добавки кусков колбасы, он взаимствует свойства у класса топпинга
public class PepperoniTopping extends ToppingDecorator {

    //конструктор, который берет свойства определяя интерфейс пиццы как супер интерфейс
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    //геттер для описания
    public String getDescription() {
        return pizzaWithTopping.getDescription() + ", topping: Pepperoni";
    }

    //геттер цены
    public double getCost() {
        return pizzaWithTopping.getCost() + 700;
    }
}
