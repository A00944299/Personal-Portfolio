package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * This program calls the Word class and prints out the top ten 
 * most frequent appearing words.
 *
 * @author A00944299
 * @version 2018
 */
public class WordCounter {
    
    /**Private final static integer 10.*/
    private static final int TEN = 10;
    
    /**Private scanner class.*/
    private static Scanner scan;
    
    /**private array list declaration.*/
    private ArrayList<Word> listOfWords = new ArrayList<Word>();
    
    /**Parsebook method to scan a document for words.
     *@return listOfWords amount.
     *@param fileName unused
     *@throws FileNotFoundException errors
     */
    public int parseBook(String fileName) throws FileNotFoundException {
        File bibleFile = new File(fileName);
        scan = new Scanner(bibleFile);
        int count = 0;
        while (scan.hasNext()) {
            boolean repeatWord = false;
            String nextWord = scan.next().replaceAll("[\\W]", "");
            Word newWord = new Word(nextWord);
            for (Word word : listOfWords) {
                if (newWord.getWord().equalsIgnoreCase(word.getWord())) {
                    word.increaseFrequency();
                    repeatWord = true;
                    break;
                }                
            }
            if (!repeatWord) {
                listOfWords.add(newWord);
            }
        }
        for (Word word : listOfWords) {
            count += word.getFrequency();
        }
        System.out.println("The number of unique words are: "
                + listOfWords.size());
        System.out.println("The number of words in the text are: "
                + count);
        return listOfWords.size();
    }
    
    /**Method that prints out the top ten most frequent words.
     *@param n unused 
     */
    public void printTopWords(int n) {
        listOfWords.sort(null);
        for (int i = 0; i < n; i++) {
            System.out.println(listOfWords.get(i).toString());
        }
    }

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     * @throws IOException errors
     */
    public static void main(String[] args) throws IOException {
        WordCounter runningTest = new WordCounter();
        // system.out.println();
        runningTest.parseBook("src/bible.txt");
        runningTest.printTopWords(TEN);
    }
};