package q1;

import java.util.Scanner;

/**
 * This class uses Java to perform simple calculations for monetary
 * components ranging from one cent to ten dollars.
 *
 * @author Chris Qin Set A
 * @version 1.0
 */
public class Change {
    
    /**Scanner import with no checkstyle error.*/
    private static Scanner myScanner; 
    
    /**
     * This program will determine the amount of change for a 
     * given value.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //define user input value
        double userValue;

        //initializing variables for number of bills/coins
        int tens;
        int fives;
        int twos;
        int ones;
        int quarters;
        int tenths;
        int twentieths;
        int hundredths;
        
        //assigned constant values for corresponding money amounts
        final int tenDollars = 1000;
        final int fiveDollars = 500;
        final int twoDollars = 200;
        final int oneDollar = 100;
        final int quarterDollar = 25;
        final int tenCents = 10;
        final int fiveCents = 5;
        final int oneCent = 1;
        
        myScanner = new Scanner(System.in);
        
        System.out.println("Please enter a monetary value: ");
        userValue = myScanner.nextDouble();
        
        /*converting regular %xx.yy money format to thousands value
        for easier calculations*/
        int userValue1 = (int) ((double) userValue * oneDollar);
        
        //decimal - binary conversion formulas
        tens = userValue1 / tenDollars;
        fives = userValue1 % tenDollars / fiveDollars;
        twos = userValue1 % tenDollars % fiveDollars / twoDollars;
        ones = userValue1 % tenDollars % fiveDollars % twoDollars / oneDollar;
        quarters = userValue1 % tenDollars % fiveDollars % twoDollars 
                % oneDollar / quarterDollar;
        tenths = userValue1 % tenDollars % fiveDollars % twoDollars % oneDollar 
                % quarterDollar / tenCents;
        twentieths = userValue1 % tenDollars % fiveDollars % twoDollars 
                % oneDollar % quarterDollar % tenCents / fiveCents;
        hundredths = userValue1 % tenDollars % fiveDollars % twoDollars 
                % oneDollar % quarterDollar % tenCents % fiveCents / oneCent;
        
        //prints out number of bills and coins
        System.out.println(userValue + " is equal to:\n"
                + tens + " ten dollar bills.\n" + fives 
                + " five dollar bills.\n" + twos + " toonies.\n" 
                + ones + " loonies.\n" + quarters + " quarters.\n" 
                + tenths + " dimes. \n" + twentieths + " nickels.\n" 
                + hundredths + " pennies.");
                
    }
}
