package q5;

import java.util.Scanner;     
/**
 * This class will encode and decode an integer from the 
 * MIX-character chart.
 *
 * @author Chris Qin Set A
 * @version 1.0
 */
public class Pack {
    
    /**Scanner import with no checkstyle error.*/
    private static Scanner myScanner; 
    /**
     * This program will encode an integer provided by the user
     * to MIX-characters (A-I only) and decode it back.
     *
     * @param args unused.
     */
    public static void main(String[] args) {   
        //the characters used are in base 56
        final int base = 56;
        //final int constants assigned to avoid checkstyle errors
        final int num0 = 0;
        final int num1 = 1;
        final int num2 = 2;
        final int num3 = 3;
        final int num4 = 4;
        
        double result;
        String userInput;
        
        myScanner = new Scanner(System.in);

        System.out.println("Please provide a 5 digit MIX character "
                + "string from \"A - I\" only.");
        userInput = myScanner.nextLine();
        
        //characters c0-c4 from right to left. (ABCDE) c0 = E, c4 = A
        char c0 = userInput.charAt(num4);
        char c1 = userInput.charAt(num3);
        char c2 = userInput.charAt(num2);
        char c3 = userInput.charAt(num1);
        char c4 = userInput.charAt(num0);

        //formula for converting to an int.
        //(ABCDE) value0 = 65 - 65 + 1 = 1. value4 = 69 - 65 + 1 = 5
        int value0 = c0 - 'A' + 1;
        int value1 = c1 - 'A' + 1;
        int value2 = c2 - 'A' + 1;
        int value3 = c3 - 'A' + 1;
        int value4 = c4 - 'A' + 1;

        //conversion to decimal
        result = (int) Math.pow(base, num0) * value0 
                 + (int) Math.pow(base, num1) * value1 
                 + (int) Math.pow(base, num2) * value2 
                 + (int) Math.pow(base, num3) * value3 
                 + (int) Math.pow(base, num4) * value4;

        System.out.println("The encoded result for " + userInput
                + " is " + result + ".");
        
        /*conversion back to base 56 along with result0-result4
        equal to value0-value4*/
        int result0 = (int) (result % base);
        int result1 = (int) (result / base % base);
        int result2 = (int) (result / base / base % base);
        int result3 = (int) (result / base / base / base % base);
        int result4 = (int) (result / base / base / base / base % base);

        //d0-d4 = c0-c4
        char d0 = (char) (result4 - 1 + 'A');
        char d1 = (char) (result3 - 1 + 'A');
        char d2 = (char) (result2 - 1 + 'A');
        char d3 = (char) (result1 - 1 + 'A');
        char d4 = (char) (result0 - 1 + 'A');
        
        
        System.out.println("The decoded result for " + userInput
                + " is " + d0 + d1 + d2 + d3 + d4 + ".");
        
    }
}
