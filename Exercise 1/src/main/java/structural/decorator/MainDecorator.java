package structural.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        TextComponent plainText = new PlainText("Hello World");

        TextComponent spellCheckedText = new SpellCheckDecorator(plainText);
        TextComponent highlightedText = new HighlightDecorator(spellCheckedText);

        System.out.println(highlightedText.getText());
    }
}
