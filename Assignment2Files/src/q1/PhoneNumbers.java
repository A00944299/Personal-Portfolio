package q1;
import java.util.Random;

/**
 * This application will print a random phone number using
 * random number class.
 *
 * @author A00944299 Chris Qin Set A
 * @version 1.0
 */
public class PhoneNumbers {
    
    /**first digit enum variables.*/
    public enum Tensdigit {
        /**digits 0-7.*/
        zero, one, two, three, four, five, six, seven
    }
    
    /**second digit enum variables.*/
    public enum Ninesdigit {
        /**digits 0-7.*/
        zero, one, two, three, four, five, six, seven
    }
    
    /**third digit enum variables.*/
    public enum Eightsdigit {
        /**digits 0-7.*/
        zero, one, two, three, four, five, six, seven
    }
    
    /**seventh digit enum variables.*/
    public enum Foursdigit {
        /**digits 0-9.*/
        zero, one, two, three, four, five, six, seven, eight, nine
    }
    
    /**eighth digit enum variables.*/
    public enum Threesdigit {
        /**digits 0-9.*/
        zero, one, two, three, four, five, six, seven, eight, nine
    }
    
    /**ninth digit enum variables.*/
    public enum Twosdigit {
        /**digits 0-9.*/
        zero, one, two, three, four, five, six, seven, eight, nine
    }
    
    /**last digit enum variables.*/
    public enum Onesdigit {
        /**digits 0-9.*/
        zero, one, two, three, four, five, six, seven, eight, nine
    }
 
    /**
     * Uses random number class to generate a phone number.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int sixthreefive = 635;
        final int thousand = 1000;
        
        Random randomGen = new Random();
        
        int tensdigit = randomGen.nextInt(Tensdigit.values().length);
        int ninesdigit = randomGen.nextInt(Ninesdigit.values().length);
        int eightsdigit = randomGen.nextInt(Eightsdigit.values().length);
        
        int middleS = randomGen.nextInt(sixthreefive) + thousand;
        String middleSection = Integer.toString(middleS);
        
        int foursdigit = randomGen.nextInt(Foursdigit.values().length);
        int threesdigit = randomGen.nextInt(Threesdigit.values().length);
        int twosdigit = randomGen.nextInt(Twosdigit.values().length);
        int onesdigit = randomGen.nextInt(Onesdigit.values().length);
        
        
        System.out.println("(" + tensdigit + ninesdigit + eightsdigit
                + ")-" + middleSection.substring(1) + "-" + foursdigit 
                + threesdigit + twosdigit + onesdigit);
        
        
    }
}
