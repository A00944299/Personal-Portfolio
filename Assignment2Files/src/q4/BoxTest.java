package q4;

/**
 * This program calls a Box method to print out the dimensions of a
 * box and whether it is full or not.
 * 
 * @author Chris Qin A00944299 Set A
 * @version 1.0
 */
public class BoxTest {
    /**
     * Calls the Box class.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final double two = 2;
        final double three = 3;
        final double four = 4;
        final double five = 5;
        
        Box box1 = new Box();
        box1.setBoxHeight(two);
        box1.setBoxWidth(three);
        box1.setBoxDepth(five);
        
        Box box2 = new Box();
        box2.setBoxHeight(three);
        box2.setBoxWidth(four);
        box2.setBoxDepth(three);
        
        System.out.println("The info for box 1 is: "
                + box1 + ".");

        box1.setFullBox(true);
        
        System.out.println("The other value of full for box 1 is: "
                + box1.getFullBox());
        
        System.out.println("The info for box 2 is : "
                + box2 + ".");

        box2.setFullBox(true);
        
        System.out.println("The other value of full for box 2 is: "
                + box2.getFullBox());
    }

}
