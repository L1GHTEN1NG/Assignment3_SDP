//Испортировали конкретные библиотеки хашмап для работы с символами
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    //создаем карту символов
    private Map<String, Character> characterBlank = new HashMap<>();

    //геттер для получения символа
    public Character getCharacter(char value, String font, int size) {
        //ключ для определения
        String key = value + font + size;
        //если ключ есть, создается новый символ который используют с ключем
        if (!characterBlank.containsKey(key)) {
            Character newCharacter = new Character(value, font, size);
            characterBlank.put(key, newCharacter);
        }
        //получения символа
        return characterBlank.get(key);
    }
}
