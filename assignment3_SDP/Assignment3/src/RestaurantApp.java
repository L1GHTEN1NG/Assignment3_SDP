public class RestaurantApp {

    public static void main(String[] args) {
        //Создание отдельных блюд для меню
        MenuComponent doner = new MenuItem("Doner", "Cheese Doner", 2000);
        MenuComponent sushi = new MenuItem("Sushi", "Philadelphia Sushi", 2500);
        MenuComponent pizza = new MenuItem("Pizza", "Gawai Pizza", 1900);

        //Создания меню и добавления туда блюд
        MenuComponent mainMenu = new Menu("Dinner Menu", "Menu for tasting in evening");
        mainMenu.add(doner);
        mainMenu.add(pizza);

        // Printing the entire menu structure
        mainMenu.print();
    }
}
