package q2;

import java.util.Scanner;
/**
 * This class will demonstrate the conversion from seconds 
 * to minutes and hours.
 *
 * @author Chris Qin Set A
 * @version 1.0
 */
public class SecondsConvert {
    
    /**Scanner import with no checkstyle error.*/
    private static Scanner myScanner;
    /**
     * This program will convert a user input of unit "seconds"
     * to a value of a regular 12-hour clock.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        //assigned constants for unit conversion
        final int secondsConversion = 1;
        final int minutesConvert = 60;
        final int hoursConvert = 3600;
        
        //number of seconds, minutes, and hours
        int secondsValue;
        int minutesValue;
        int hoursValue;
        
        myScanner = new Scanner(System.in);
        
        System.out.println("Provide the number of seconds to convert: ");
        //user input
        int userInput = myScanner.nextInt();
        
        //conversion calculations
        hoursValue = userInput / hoursConvert;
        
        minutesValue = userInput % hoursConvert / minutesConvert;
        
        secondsValue = userInput % hoursConvert % minutesConvert 
                / secondsConversion;                
        
        System.out.println(userInput + " is equivalent to " + hoursValue 
                + ":" + minutesValue + ":" + secondsValue);
        
    }
}
