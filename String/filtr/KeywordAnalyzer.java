package String.filtr;

public abstract class KeywordAnalyzer implements TextAnalyzer {

   protected String[] keywords;




    abstract String[] getKeywords();
    abstract Label getLabel();

    public Label processText(String text){
        for(String word: keywords){
            if(text.contains(word)) {
            return getLabel();
            }
        }

        return Label.OK;
    }



}
