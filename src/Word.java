public class Word {
    private String word_target;
    private String word_explain;

    /**
     * 3 ham construction
     */
    Word() {
        word_explain = "";
        word_target = "";
    }

    Word(String word_target, String word_explain) {
        this.word_explain = word_explain;
        this.word_target = word_target;
    }

    Word(Word newWord) {
        word_target = newWord.word_target;
        word_explain = newWord.word_explain;
    }

    /**
     * 2 ham getter.
     */
    public String getWord_target() {
        return word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    /**
     * 2 ham setter.
     */
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    /**
     * print  method.
     */
    public void print() {
        System.out.println(String.format("%-20s |%s", word_target, word_explain));
    }

    String printWord() {
        String str = "";
        //str = " |" + word_target + "                |" + word_explain; // 4 tap
        str = String.format("|%-20s |%s", word_target, word_explain);
        return str;
    }
}
