/*
 * ====================================================

 Objective: This program will set the framework
 for all necessary cargo vans. It is also a subclass of
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
public class CargoVan extends Van {

    private float maxLoad;
    private float cargoArea;

    /**
     *
     * @param givenMaxLoad
     * @param givenCargoArea
     * @param superClearanceHeight
     * @param superNumWindows
     * @param superMake
     * @param superModel
     * @param superVin
     * @param superYear
     *
     * Formal-Arg constructor that takes in data for the superclass 'Van' and
     * 'Vehicle'
     */
    public CargoVan(float givenMaxLoad, float givenCargoArea, float superClearanceHeight,
            int superNumWindows, String superMake, String superModel, String superVin, int superYear) {

        super(superClearanceHeight, superNumWindows, superMake, superModel, superVin, superYear);
        maxLoad = givenMaxLoad;
        cargoArea = givenCargoArea;

    }

    /**
     *
     * @return The CargoVan data as a single String.
     */
    @Override
    public String toString() {
        String finalString = "";

        finalString += System.getProperty("line.separator") + "C"
                + super.toString() + System.getProperty("line.separator")
                + getMaxLoad() + System.getProperty("line.separator")
                + getCargoArea();

        return finalString;

    }

    /**
     * @return The maximum load of the cargo van.
     */
    public float getMaxLoad() {
        return maxLoad;
    }

    /**
     * @param maxLoad Set the maximum load of the cargo van.
     */
    public void setMaxLoad(float maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     * @return The cargo area of the cargo van.
     */
    public float getCargoArea() {
        return cargoArea;
    }

    /**
     * @param cargoArea Set the cargo area of the cargo van.
     */
    public void setCargoArea(float cargoArea) {
        this.cargoArea = cargoArea;
    }

}
