package q1;

import java.util.Scanner;

/**
 * This application calculates the mean and SD from an array of max 20 numbers.
 *
 * @author A00944299
 * @version 2018
 */
public class Statistics {
    /**
     * Drives the program.
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        //This variable can be changed very easily
        final int arraysize = 20;

        int[] numberarray = new int[arraysize];

        int sum = 0;
        float sumSD = 0;
        float mean;
        float deviation;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a max of 20 numbers. Press "
                + "'enter' to enter a new integer.");
        System.out.println("Press ctrl + z to calculate. ");
        
        while (scan.hasNext()) {
            numberarray[count] = scan.nextInt();
            sum += numberarray[count];
            count++;
        }

        mean = (float) sum / count;
        
        for (int i = 0; i < count; i++) {
            sumSD += Math.pow(numberarray[i] - mean, 2);
        }

        deviation = (float) Math.sqrt(sumSD / (count - 1));

        System.out.println("The mean is: " + mean + "."); 
        System.out.println("There were " + count + " numbers entered.");
        System.out.println("The standard deviation is: " + deviation + ".");

        scan.close();

    }

};