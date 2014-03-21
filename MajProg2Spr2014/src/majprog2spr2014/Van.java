/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary vans. It is also a subclass of
 Vehicle.

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
     * @return All data in the 'Van' class as a String
     */
    @Override
    public String toString() {
        String finalString = "";

        finalString += "V" + super.toString() + System.getProperty("line.separator")
                + clearanceHeight + System.getProperty("line.separator")
                + numWindows + System.getProperty("line.separator");

        return finalString;
    }
}
