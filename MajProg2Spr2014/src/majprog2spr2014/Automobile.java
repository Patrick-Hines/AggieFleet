/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary vehicles. It is also a subclass of
 Vehicle.

 Developed by: Patrick Hines
 Began: 3-20-2014


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
        super();
        hybrid = false;
        maxPassengers = 0;
        trunkSpace = 0;
    }

    public Automobile(boolean isHybrid, int givenMaxPassengers, float givenTrunkSpace) {
        super("Toyota", "Corolla", "Lorem Ipsum.", 1966);
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
        finalString += super.toString() + System.getProperty("line.separator")
                + hybrid + System.getProperty("line.separator")
                + maxPassengers + System.getProperty("line.separator")
                + trunkSpace + System.getProperty("line.separator");

        return finalString;
    }
}
