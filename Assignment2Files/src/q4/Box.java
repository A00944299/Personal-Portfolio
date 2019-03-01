package q4;

/**
 * This program instances box variables to be called by a
 * driver method.
 * 
 * @author Chris Qin A00944299 Set A
 * @version 1.0
 */
public class Box {
    /**Box Height.*/
    private double boxHeight;
    
    /**Box Width.*/
    private double boxWidth;
    
    /**Box Depth.*/
    private double boxDepth;
    
    /**Box boolean full/false.*/
    private boolean full;
    
    
    /**Constructs box height.
     * @param boxheight into double
     */
    public void setBoxHeight(double boxheight) {
        this.boxHeight = boxheight;
    }
    
    /**Retrieves box height.
     * @return boxHeight
     */
    public double getBoxHeight() {
        return boxHeight;
    }
    
    /**Constructs box width.
     * @param boxwidth into double
     */
    public void setBoxWidth(double boxwidth) {
        this.boxWidth = boxwidth;
    }
    
    /**Retrieves box width.
     * @return boxWidth
     */
    public double getBoxWidth() {
        return boxWidth;
    }
    
    /**Constructs box depth.
     * @param boxdepth into double
     */
    public void setBoxDepth(double boxdepth) {
        this.boxDepth = boxdepth;
    }
    
    /**Returns box depth.
     * @return boxDepth
     * */
    public double getBoxDepth() {
        return boxDepth;
    }
    
    /**Constructs if box is full.
     * @param boxfull 
     */
    public void setFullBox(boolean boxfull) {
        full = boxfull;
    }
    /**
     * a method that accepts a height, width, and depth and returns
     * a value of false.
     * @return height, width, depth as double
     */   
    public boolean getFullBox() {
        return full;
    }
    
    /**Retrieves box values.
     * @return box values as a string
     */
    public String toString() {
        String boxstring = "Height: " + boxHeight + "\nWidth: " + boxWidth 
                + "\nDepth: " + boxDepth + "\nBoolean Value: " + full;
        return boxstring;
    }
}
