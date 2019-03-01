package q3;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestMIXChar {
    
    /**Character array.*/
    private static char[] charArray = {' ', 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', '\u0394', 'J', 'K', 'L', 'M', 'N', 'O', 
            'P', 'Q', 'R', '\u03A3', '\u03A0', 'S', 'T', 'U', 'V', 
            'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', 
            '7', '8', '9', '.', ',', '(', ')', '+', '-', '*', '/', 
            '=', '$', '<', '>', '@', ';', ':', '\''};
    
    
    /**Private 56.*/
    private static int fiftysix = 56;
    
    /**Returns true for if c is a mixchar.
     * 
     * @param c mixchar
     * @return true or false
     */
    public static boolean isMIXChar(char c) {
       for (int i = 0; i < fiftysix; i++) {
           if (c == (charArray[i])) {
               return true;
           }
       }
       return false;
    }
    
    /**Returns a converted char.
     * 
     * @param c mixchar
     * @throws Exception thrown
     */
    public static void MIXChar(char c) throws Exception{
        for (int i = 0; i < fiftysix; i++) {
            c = (charArray[i]); 
        }
    }
    
    /**
     * Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] a) {
        
    }
    
}
