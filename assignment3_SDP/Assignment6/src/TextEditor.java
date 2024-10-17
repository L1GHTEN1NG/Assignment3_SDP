//Импортируем библиотеки для создания списков
import java.util.ArrayList;
import java.util.List;

//Создаем класс эдитора текста
public class TextEditor {
    //В нем создается текстовый документ, а затем класс фабрика символов
    private List<TextCharacter> document = new ArrayList<>();
    private CharacterFactory characterFactory;

    //конструктор класса
    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    //Внутренний класс текстового символа
    private class TextCharacter {
        //создаются объекты
        Character character;
        int x, y;

        //конструктор класса
        public TextCharacter(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        //рендеринг позиции
        public void render() {
            character.position(x, y);
        }
    }

    //Метод добавления текстового символа
    public void insertText(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        document.add(new TextCharacter(character, x, y));
    }

    //Метод рендеринга документа, проходящий по документу
    public void renderDocument() {
        for (TextCharacter textCharacter : document) {
            textCharacter.render();
        }
    }
}
