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
 Ended:


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

    public PassengerVan() {
        super();

        numSeatRows = 0;
        maxPassengers = 0;
        dvdPlayer = false;

    }

    public PassengerVan(int givenNumSeatRows, int givenMaxPassengers, boolean isDvdPlayer) {

        numSeatRows = givenNumSeatRows;
        maxPassengers = givenMaxPassengers;
        dvdPlayer = isDvdPlayer;
    }

    /**
     *
     * @param givenNumSeatRows
     * @param givenMaxPassengers
     * @param isDvdPlayer
     * @param superClearanceHeight
     * @param superNumWindow
     *
     * Formal-Arg constructor that takes in data for the superclass 'Van'
     */
    public PassengerVan(int givenNumSeatRows, int givenMaxPassengers, boolean isDvdPlayer,
            float superClearanceHeight, int superNumWindow) {

        super(superClearanceHeight, superNumWindow);

        numSeatRows = givenNumSeatRows;
        maxPassengers = givenMaxPassengers;
        dvdPlayer = isDvdPlayer;
    }

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
     * Formal-Arg constructor that takes in data for the superclass 'Van' that
     * also passes data to the superclass 'Van'
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

        finalString += "P" + System.getProperty("line.separator")
                + super.toString() + System.getProperty("line.separator")
                + numSeatRows + System.getProperty("line.separator")
                + maxPassengers + System.getProperty("line.separator")
                + dvdPlayer + System.getProperty("line.separator");

        return finalString;
    }

    /**
     * @return the numSeatRows
     */
    public int getNumSeatRows() {
        return numSeatRows;
    }

    /**
     * @param numSeatRows the numSeatRows to set
     */
    public void setNumSeatRows(int numSeatRows) {
        this.numSeatRows = numSeatRows;
    }

    /**
     * @return the maxPassengers
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * @param maxPassengers the maxPassengers to set
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * @return the dvdPlayer
     */
    public boolean getDvdPlayer() {
        return dvdPlayer;
    }

    /**
     * @param dvdPlayer the dvdPlayer to set
     */
    public void setDvdPlayer(boolean dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
}
