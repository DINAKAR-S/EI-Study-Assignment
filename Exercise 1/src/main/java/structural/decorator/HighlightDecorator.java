package structural.decorator;

public class HighlightDecorator extends TextDecorator {
    public HighlightDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return super.getText() + " [Highlighted]";
    }
}
