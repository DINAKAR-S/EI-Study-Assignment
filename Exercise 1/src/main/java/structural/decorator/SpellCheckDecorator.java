package structural.decorator;

public class SpellCheckDecorator extends TextDecorator {
    public SpellCheckDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return super.getText() + " [SpellChecked]";
    }
}
