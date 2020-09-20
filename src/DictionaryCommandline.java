public class DictionaryCommandline {
    Dictionary myDictionary = new Dictionary();
    DictionaryManagement scan = new DictionaryManagement(myDictionary);

    /**
     * ham construction.
     */
    DictionaryCommandline() {

    }

    DictionaryCommandline(Dictionary myDictionary) {
        this.myDictionary = myDictionary;
    }

    /**
     * methods.
     */
    public void showAllWords() {
        System.out.println("No      |English            |Vietnamese"); // 2 tap 3 tap
        for (int i = 0; i < myDictionary.wordCount; i++) {
            System.out.println(i + 1 + "       " + myDictionary.words[i].printWord());
        }
    }

    public void dictionaryBasic() {
        scan.insertFromCommandline();
        this.showAllWords();
    }

    public static void main(String[] args) {
        DictionaryCommandline commandline = new DictionaryCommandline();
        commandline.dictionaryBasic();
    }

}
