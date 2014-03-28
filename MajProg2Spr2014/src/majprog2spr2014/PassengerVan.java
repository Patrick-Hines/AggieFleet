/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary vans. It is also a subclass of
 Van.

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
public class PassengerVan extends Van {

    private int numSeatRows;
    private int maxPassengers;
    private boolean dvdPlayer;

    /**
     *
     * @param givenNumSeatRows
     * @param givenMaxPassengers
     * @param isDvdPlayer
     * @param superClearanceHeight
     * @param superNumWindow
     * @param superMake
     * @param superModel
     * @param superVin
     * @param superYear
     *
     * Formal-Argument constructor that takes in data for the superclass 'Van'
     * and 'Vehicle'
     */
    public PassengerVan(int givenNumSeatRows, int givenMaxPassengers, boolean isDvdPlayer,
            float superClearanceHeight, int superNumWindow, String superMake, String superModel, String superVin, int superYear) {

        super(superClearanceHeight, superNumWindow, superMake, superModel, superVin, superYear);

        numSeatRows = givenNumSeatRows;
        maxPassengers = givenMaxPassengers;
        dvdPlayer = isDvdPlayer;
    }

    /**
     * @return Returns all data of the 'PassengerVan' class as a single String.
     */
    @Override
    public String toString() {
        String finalString = "";

        finalString += System.getProperty("line.separator") + "P"
                + super.toString() + System.getProperty("line.separator")
                + getNumSeatRows() + System.getProperty("line.separator")
                + getMaxPassengers() + System.getProperty("line.separator");

        if (getDvdPlayer()) {
            finalString += "1";
        } else {
            finalString += "0";
        }

        return finalString;
    }

    /**
     * @return Returns the number of seat rows.
     */
    public int getNumSeatRows() {
        return numSeatRows;
    }

    /**
     * @param numSeatRows Sets the number of seat rows.
     */
    public void setNumSeatRows(int numSeatRows) {
        this.numSeatRows = numSeatRows;
    }

    /**
     * @return Returns the maximum number of passengers
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * @param maxPassengers Sets the maximum number of passengers
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * @return Returns, as a boolean, whether the van has a DVD player or not.
     */
    public boolean getDvdPlayer() {
        return dvdPlayer;
    }

    /**
     * @param dvdPlayer Sets, as a boolean, whether the van has a DVD player or
     * not.
     */
    public void setDvdPlayer(boolean dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
}
