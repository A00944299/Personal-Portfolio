package q2;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This application will print the dimensions of a cylinder
 * using a height and a radius.
 *
 * @author A00944299 Chris Qin Set A
 * @version 1.0
 */
public class CylinderStats {
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int two = 2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the cylinder radius: ");
        double radius = scanner.nextDouble();
        
        System.out.println("Please enter the cylinder height: ");
        double height = scanner.nextDouble();
        
        double surfaceArea = (two * Math.PI * radius) 
                * (radius + height);
                
        double volume = Math.PI * Math.pow(radius, 2) + height;
        
        DecimalFormat fmt = new DecimalFormat("0.####");
        
        System.out.println("The cylinder surface area is: "
                + fmt.format(surfaceArea));
        System.out.println("The cylinder volume is: "
                + fmt.format(volume));
        
        scanner.close();
        
    }
}
