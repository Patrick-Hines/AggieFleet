/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary automobiles. It is also a subclass of
 Vehicle.

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
public class Automobile extends Vehicle {

    private boolean hybrid;
    private int maxPassengers;
    private float trunkSpace;

    /**
     *
     * @param isHybrid
     * @param givenMaxPassengers
     * @param givenTrunkSpace
     * @param superMake
     * @param superModel
     * @param superVin
     * @param superYear
     *
     * Formal-Arg constructor that takes in data for the superclass 'Vehicle'
     */
    public Automobile(boolean isHybrid, int givenMaxPassengers, float givenTrunkSpace,
            String superMake, String superModel, String superVin, int superYear) {

        super(superMake, superModel, superVin, superYear);

        hybrid = isHybrid;
        maxPassengers = givenMaxPassengers;
        trunkSpace = givenTrunkSpace;
    }

    /**
     * @return Returns the boolean value of 'hybrid'.
     */
    public boolean getHybrid() {
        return hybrid;
    }

    /**
     * @param hybrid The hybrid boolean value to set.
     */
    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    /**
     * @return The maximum number of passengers.
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * @param maxPassengers Set the maximum number of passengers.
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * @return The size of the trunk space.
     */
    public float getTrunkSpace() {
        return trunkSpace;
    }

    /**
     * @param trunkSpace Sets the size of the trunk space.
     */
    public void setTrunkSpace(float trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    /**
     * @return All data from the Automobile class as a single String
     */
    @Override
    public String toString() {
        String finalString = "";
        finalString += System.getProperty("line.separator") + "A"
                + super.toString() + System.getProperty("line.separator");
        if (getHybrid()) {
            finalString += "1" + System.getProperty("line.separator");
        } else {
            finalString += "0" + System.getProperty("line.separator");
        }

        finalString += getMaxPassengers() + System.getProperty("line.separator")
                + getTrunkSpace();

        return finalString;
    }
}
