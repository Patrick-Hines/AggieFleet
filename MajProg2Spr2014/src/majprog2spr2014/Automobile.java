/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary automobiles. It is also a subclass of
 Vehicle.

 Developed by: Patrick Hines
 Began: 3-21-2014
 Ended: 3-21-2014


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

    public Automobile() {

        hybrid = false;
        maxPassengers = 0;
        trunkSpace = 0;
    }

    public Automobile(boolean isHybrid, int givenMaxPassengers, float givenTrunkSpace) {

        hybrid = isHybrid;
        maxPassengers = givenMaxPassengers;
        trunkSpace = givenTrunkSpace;
    }

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
     * @return the hybrid
     */
    public boolean getHybrid() {
        return hybrid;
    }

    /**
     * @param hybrid the hybrid to set
     */
    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
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
     * @return the trunkSpace
     */
    public float getTrunkSpace() {
        return trunkSpace;
    }

    /**
     * @param trunkSpace the trunkSpace to set
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
        finalString += "A"
                + super.toString() + System.getProperty("line.separator")
                + getHybrid() + System.getProperty("line.separator")
                + getMaxPassengers() + System.getProperty("line.separator")
                + getTrunkSpace();

        return finalString;
    }
}
