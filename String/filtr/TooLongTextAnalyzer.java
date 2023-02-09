package String.filtr;

public class TooLongTextAnalyzer implements TextAnalyzer {
    Label label;
    protected int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
        this.label = Label.TOO_LONG;
    }


    @Override
    public Label processText(String text) {
        if (maxLength < text.length()) {
            return label;
        }
        return Label.OK;
    }
}
