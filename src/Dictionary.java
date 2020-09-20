public class Dictionary {
    final int max = 10000; // so tu toi da.
    public Word[] words;

    {
        words = new Word[max];
    }

    public int wordCount; // so tu hien tai.

    /**
     * ham construction.
     */
    Dictionary() {
        wordCount = 0;
    }
}
