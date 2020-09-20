import java.util.Scanner;

public class DictionaryManagement {
    private Dictionary myDictionary;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Ham construction.
     */
    DictionaryManagement() {

    }

    DictionaryManagement(Dictionary myDictionary) {
        this.myDictionary = myDictionary;
    }

    /**
     * scan words.
     */
    public void insertFromCommandline() {
        int wordNumber = scanner.nextInt();
        String temp = scanner.nextLine(); // de enter xuong dong k bi mat string
        for (int i = 0; i < wordNumber; i++) {
            String engWord = scanner.nextLine();
            String vietsubWord = scanner.nextLine();
            Word wordTemp = new Word(engWord, vietsubWord);
            myDictionary.words[myDictionary.wordCount] = wordTemp;
            myDictionary.wordCount++;
        }
    }
}
