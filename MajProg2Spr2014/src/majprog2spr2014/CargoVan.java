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
 Ended:


 * ====================================================

 */
package majprog2spr2014;

/**
 *
 * @author Patrick Hines
 */
public class CargoVan extends Van {

    float maxLoad;
    float cargoArea;

    public CargoVan() {
        maxLoad = 0;
        cargoArea = 0;
    }

    public CargoVan(float givenMaxLoad, float givenCargoArea) {
        maxLoad = givenMaxLoad;
        cargoArea = givenCargoArea;

    }

    /**
     *
     * @param givenMaxLoad
     * @param givenCargoArea
     * @param superClearanceHeight
     * @param superNumWindows
     *
     * Formal-Arg constructor that takes in data for the superclass 'Van'
     */
    public CargoVan(float givenMaxLoad, float givenCargoArea, float superClearanceHeight, int superNumWindows) {

        super(superClearanceHeight, superNumWindows);
        maxLoad = givenMaxLoad;
        cargoArea = givenCargoArea;

    }

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

        finalString += "C" + System.getProperty("line.separator")
                + super.toString() + System.getProperty("line.separator")
                + maxLoad + System.getProperty("line.separator")
                + cargoArea + System.getProperty("line.separator");

        return finalString;

    }

}