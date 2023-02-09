package String.filtr;

public class NegativeTextAnalyzer extends KeywordAnalyzer  {


    public NegativeTextAnalyzer(String[] keywords) {
        super.label = Label.NEGATIVE_TEXT;
        super.keywords = keywords;


    }

    @Override
    String[] getKeywords() {
        return super.keywords;
    }

    @Override
    Label getLabel() {
        return super.label;
    }
}
