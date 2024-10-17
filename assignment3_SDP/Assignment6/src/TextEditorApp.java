//Создали класс приложения текствого эдитора
public class TextEditorApp {
    public static void main(String[] args) {
        //Сотавляющие фабрики символов и едитора
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor editor = new TextEditor(characterFactory);

        //Проверяем разные варианты символов
        editor.insertText('A', "Times New Roman", 14, 5, 5);
        editor.insertText('B', "Helvetica", 14, 6, 6);
        editor.insertText('C', "Calibri", 14, 7, 7);
        editor.insertText('D', "Arial", 14, 8, 8);
        editor.insertText('E', "Sanserif", 14, 9, 9);

        // Рендеринг документа
        editor.renderDocument();
    }
}
