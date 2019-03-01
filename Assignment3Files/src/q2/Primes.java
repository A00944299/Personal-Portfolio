package q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Primes {
    
    /**private integer instance variable.*/
    private int newInt;
    
    /**private boolean instance variable.*/
    private boolean[] primes;
    
    /**private arraylist instance variable.*/
    private ArrayList<Integer> primeList = new ArrayList<Integer>(newInt);
    
    /**constructor for variable N.
     * @param n unused
     */
    public Primes(int n) {
        n = newInt;
    }
    
    /**Calculates whether something is true if prime or false if not.
     * @param n unused 
     */
    public void calculatePrimes(int n) {
        primes = new boolean[n];
        
        /**Initialize all boolean values to false*/
        primes[0] = false;
        for (int i = 1; i < n; i++) {
            primes[i] = true;
        }
        for (int j = 2; j <= n; j++) {    
            if (primes[j - 1]) {
                System.out.print(j + "  ");
                primeList.add(n);
                
                /** Cross out all the non-primes using this filter*/
                for (int k = j * j; k <= n; k += j) {
                    primes[k - 1] = false;
                }
            }
        }
    }
    
    /**Counts the number of primes in an ArrayList.
     * @param n unused
     * @return n
     */
    public int countPrimes(int n) {
        System.out.println("\nThere are "
            + primeList.size() + " primes.");
        return n;
    }

    /**Prints the prime numbers.
     * @param n unused
     */
    public void printPrimes(int n) {
        calculatePrimes(n);
    }
    
    /**Checks if int x is prime or not.
     * @param x unused
     * @return x
     */
    public boolean isPrime(int x) {
       calculatePrimes(x);
       return true;
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an upper bound: ");
        int n = scan.nextInt();
        Primes prime = new Primes(n);
        prime.printPrimes(n);
        prime.countPrimes(n);
        scan.close();
    }

};
