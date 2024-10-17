//Класс Магазина Пиццы для того чтобы показать функционал
public class PizzaShop {
    public static void main(String[] args) {
        //Заказываем пиццу маргариту
        Pizza margherita = new MargheritaPizza();
        System.out.println(margherita.getDescription() + " , Price(tg): " + margherita.getCost());

        //Эта уже вегетарианская с грибами
        Pizza vegetarianWithMushrooms = new MushroomTopping(new VegetarianPizza());
        System.out.println(vegetarianWithMushrooms.getDescription() + " , Price(tg): " + vegetarianWithMushrooms.getCost());
    }
}
