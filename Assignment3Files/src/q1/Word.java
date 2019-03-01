package q1;

/**
 * Creates a Word class and sets a Comparable<Word> method.
 * 
 * @author A00944299
 * @version 2018
 */
public class Word implements Comparable<Word> {
    
    /**Final string variable.*/
    private final String word;
    
    /**Private frequency variable.*/
    private int frequency;
    
    /**Sets a word class.
     * @param newWord unused
     */
    public Word(String newWord) {
       this.frequency = 1;
       this.word = newWord;
    }
    
    /**Returns word as a string.
     * @return word as string 
     */
    public String getWord() {
        return word;
    }
    
    /**Returns frequency as an int.
     * @return frequency as int.
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**Increases frequency by 1 every time this method is called.*/
    public void increaseFrequency() {
        frequency++;
    }
    
    /**Return toString() in a certain format.
     * @return toString format
     */
    public String toString() {
        return word + ": " + frequency;
    }
    
    /**Sets the statement that a word with higher frequency appears first.
     *
     *@throws IllegalArgumentException throws illegal argument errors.
     *@return which word comes first
     *@param w unused
     */
    public int compareTo(Word w) throws IllegalArgumentException {
        if (frequency > w.getFrequency()) {
            return -1;
        } else if (frequency == w.getFrequency()) {
            return 0;
        } else {
            return 1;
        }
    }
}


