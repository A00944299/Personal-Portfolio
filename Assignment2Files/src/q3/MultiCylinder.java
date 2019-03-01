package q3;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program will call the Cylinder method and execute
 * the instanced variables.
 *
 * @author Chris Qin A00944299 Set A
 * @version 1.0
 */
public class MultiCylinder {
     /**
      * Calls the Cylinder class.
      * 
      * @param args command line arguments.
      */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");
        
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder();
        
        System.out.println("Please enter a radius and height for "
                + "cylinder 1: ");
        double c1rad = scan.nextDouble();
        double c1height = scan.nextDouble();
        
        System.out.println("Pleaes enter a radius and height for "
                + "cylinder 2: ");
        double c2rad = scan.nextDouble();
        double c2height = scan.nextDouble();
        
        cylinder1.setRadius(c1rad);
        cylinder1.setHeight(c1height);
        
        cylinder2.setRadius(c2rad);
        cylinder2.setHeight(c2height);
        
        System.out.println("The surface area of the cylinder 1 is: "
                + fmt.format(cylinder1.toCylinderSA()) + " and the "
                + "volume is " + fmt.format(cylinder1.toCylinderVolume()));

        System.out.println("The surface area of the cylinder 2 is: "
                + fmt.format(cylinder2.toCylinderSA()) + " and the "
                + "volume is " + fmt.format(cylinder2.toCylinderVolume()));
        
        System.out.println("The radius for the first cylinder is: " 
                + cylinder1.getRadius() + " and the height is "
                + cylinder1.getHeight());
        
        System.out.println("The radius for the second cylinder is: " 
                + cylinder2.getRadius() + " and the height is "
                + cylinder2.getHeight());
        
        scan.close();
    }
   
}
