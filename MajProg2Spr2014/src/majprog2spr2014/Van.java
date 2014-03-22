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
 Ended:


 * ====================================================

 */
package majprog2spr2014;

/**
 *
 * @author Patrick Hines
 */
public class Van extends Vehicle {

    float clearanceHeight;
    int numWindows;

    public Van() {
        clearanceHeight = 0;
        numWindows = 0;
    }

    public Van(float givenClearanceHeight, int givenNumWindows) {
        clearanceHeight = givenClearanceHeight;
        numWindows = givenNumWindows;
    }

    /**
     * @param givenClearanceHeight
     * @param givenNumWindows
     * @param superMake
     * @param superModel
     * @param superVin
     * @param superYear
     *
     * Formal-Arg constructor that takes in data for the superclass 'Vehicle'
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

        finalString += "V" + System.getProperty("line.separator")
                + super.toString() + System.getProperty("line.separator")
                + clearanceHeight + System.getProperty("line.separator")
                + numWindows + System.getProperty("line.separator");

        return finalString;
    }
}
