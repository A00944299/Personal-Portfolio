package q3;

import java.util.Scanner;
/**
 * This class will demonstrate simple arithmetic using
 * add, subtract, multiply, and divide.
 *
 * @author Chris Qin Set A
 * @version 1.0
 */
public class Arithmetic {
    
    /**Scanner import with no checkstyle error.*/
    private static Scanner myScanner; 
    /**
     * This program will calculate the sum, differences,
     * product, and quotients of 2 numbers provided by
     * the user.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        float input1;
        float input2;
        float sum;
        float difference1;
        float difference2;
        float product;
        float quotient1;
        float quotient2;
        
        myScanner = new Scanner(System.in);
        
        System.out.println("Note: providing a number that is 0\n" 
                + "may result in an error in calculation.");
        
        System.out.println("Please provide a number: ");
        input1 = myScanner.nextFloat();
        
        System.out.println("Please provide another number: ");
        input2 = myScanner.nextFloat();
        
        sum = input1 + input2;
        difference1 = input1 - input2;
        difference2 = input2 - input1;
        product = input1 * input2;
        quotient1 = input1 / input2;
        quotient2 = input2 / input1;
        
        System.out.println("The sum of " + input1 + " and "
                + input2 + " equals: " + sum);
        System.out.println("The difference of " + input1 
                + " and " + input2 + " equals: " + difference1);
        System.out.println("The difference of " + input2 
                + " and " + input1 + " equals: " + difference2);
        System.out.println("The product of " + input1 
                + " and " + input2 + " equals: " + product);
        System.out.println("The quotient of " + input1 
                + " and " + input2 + " equals: " + quotient1);
        System.out.println("The quotient of " + input2 
                + " and " + input1 + " equals: " + quotient2);
        
        
    }

};
