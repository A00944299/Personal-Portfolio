package q4;

import java.util.Scanner;
/**
 * This class will use Java to solve a cube.
 *
 * @author Chris Qin Set A
 * @version 1.0
 */
public class Cube {
    
    /**Scanner import with no checkstyle error.*/
    private static Scanner myScanner;
    /**
     * This program will be used to calculate the surface area
     * and volume of a cube with a given side.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        final int numberOfFaces = 6;
        final int cubeVolumeFormula = 3;
        int side;
        int cubeSA;
        int cubeVolume;
        
        myScanner = new Scanner(System.in);
        
        System.out.println("Please give a value for the "
                + "side of a cube: ");
        side = myScanner.nextInt();
        
        //equation for cube surface area
        cubeSA = side * side * numberOfFaces;
        //equation for cube volume
        cubeVolume = (int) Math.pow(side, cubeVolumeFormula);
        
        System.out.println("\nThe surface area of this cube with "
                + "the given side " + side + " is: " + cubeSA);
        System.out.println("The volume of this cube with the"
                + " given side " + side + " is: " + cubeVolume);     
    }
}
