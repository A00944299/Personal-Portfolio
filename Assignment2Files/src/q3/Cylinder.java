package q3;

/**
 * This program instances cylinder variables and calculates
 * the resulting surface area and volume.
 *
 * @author Chris Qin A00944299 Set A
 * @version 1.0
 */

public class Cylinder {

    /**Radius.*/
    private double r;
    
    /**Height.*/
    private double h;
    
    
    /**Constructs cylinder radius.
     * @param radius r
     */
    public void setRadius(double radius) {
        r = radius;
    }
    
    /**Retrieves cylinder radius.
     * @return radius r
     */
    public double getRadius() {
        return r;
    }
    
    /**Constructs cylinder radius.
     * @param height h
     */
    public void setHeight(double height) {
        h = height;
    }
    
    /**Retrieves cylinder radius.
     * @return height h
     */
    public double getHeight() {
        return h;
    }
    
    /**Calculates cylinder SA.
     * @return SA
     */
    public double toCylinderSA() {
        final double two = 2;
        double cylinderSA = (two * Math.PI * r) * (r + h);
        return cylinderSA;
    }
    
    /**Calculates cylinder volume.
     * @return Volume
     * */
    public double toCylinderVolume() {
        double cylinderVolume = Math.PI * Math.pow(r, 2) * h;
        return cylinderVolume;
    }
    
    /**Retrieves cylinder string.
     * @return cylinder string
     */
    public String toCylinderString() {
        String cylinderStats = r + " " + h;
        return cylinderStats;
    }
}
