/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary vans. It is also a subclass of
 Vehicle.

 NOTE: This class includes an optional constructor to
 pass data to the superclass. This constructor is not
 explictly stated on the UML diagram for this class.

 Developed by: Patrick Hines
 Began: 3-21-2014
 Ended: 3-24-2014


 * ====================================================

 */
package majprog2spr2014;

/**
 *
 * @author Patrick Hines
 */
public class Van extends Vehicle {

    protected float clearanceHeight;
    protected int numWindows;

    /**
     * @param givenClearanceHeight
     * @param givenNumWindows
     * @param superMake
     * @param superModel
     * @param superVin
     * @param superYear
     *
     * Formal-Argument constructor that takes in data for the superclass
     * 'Vehicle'
     */
    public Van(float givenClearanceHeight, int givenNumWindows, String superMake, String superModel, String superVin, int superYear) {

        super(superMake, superModel, superVin, superYear);
        clearanceHeight = givenClearanceHeight;
        numWindows = givenNumWindows;
    }

    /**
     * @return All data in the 'Van' class as a String
     */
    @Override
    public String toString() {
        String finalString = "";

        finalString
                += //              "V" + System.getProperty("line.separator") +
                super.toString() + System.getProperty("line.separator")
                + getClearanceHeight() + System.getProperty("line.separator")
                + getNumWindows();

        return finalString;
    }

    /**
     * @return Returns the clearance height of the van.
     */
    public float getClearanceHeight() {
        return clearanceHeight;
    }

    /**
     * @param clearanceHeight Sets the clearance height of the van.
     */
    public void setClearanceHeight(float clearanceHeight) {
        this.clearanceHeight = clearanceHeight;
    }

    /**
     * @return Returns the number of windows on the van.
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * @param numWindows Sets the number of windows of the van.
     */
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
}
