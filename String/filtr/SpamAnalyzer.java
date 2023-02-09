package String.filtr;

public class SpamAnalyzer extends KeywordAnalyzer {


    public SpamAnalyzer(String[] keywords) {
      super.label = Label.SPAM;
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
