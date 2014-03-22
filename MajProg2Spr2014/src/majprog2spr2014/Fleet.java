/*
 * ====================================================

 Objective: This class will serve as the grouping of
 all vehicles into a system.

 Developed by: Patrick Hines
 Began: 3-21-2014
 Ended:


 * ====================================================

 */
package majprog2spr2014;

import java.util.ArrayList;

/**
 *
 * @author Patrick Hines
 */
public class Fleet {

    String fleetName;
    ArrayList<Vehicle> fleetList;

    /**
     * No-Argument Constructor. Sets properties to their default values.
     */
    public Fleet() {
        fleetName = "";
        fleetList = null;
    }

    /**
     *
     * @param fleetName
     *
     * Constructor with formal parameters to set 'fleetName' to its specified
     * value.
     */
    public Fleet(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     *
     * @return All data within the Fleet class as a single String.
     */
    @Override
    public String toString() {
        String finalString = "";

        return finalString;
    }

    /**
     *
     * @param inputFileName
     *
     * Reads in data from the given filepath and assigns the proper values to
     * each property in the Fleet class.
     */
    public void loadFleet(String inputFileName) {

    }

    /**
     *
     * @param outputFileName
     *
     * Saves the current properties of the Fleet class to the specified
     * filepath.
     */
    public void saveFleet(String outputFileName) {

    }

    /**
     *
     * @return A Vehicle object within the fleetList ArrayList at a specific
     * index.
     */
    public Vehicle getVehicle(int index) {
        return null;
    }

    /**
     *
     * @return The number of items inside the fleetList ArrayList.
     */
    public int getNumVehicles() {
        return 0;
    }

    /**
     *
     * @param givenVehicle
     * @param index
     *
     * Takes in a Vehicle object and index integer to store the Vehicle within
     * the fleetList ArrayList at the specific index.
     *
     */
    public void setVehicle(Vehicle givenVehicle, int index) {

    }

    /**
     *
     * @param givenVehicle
     *
     * Appends the given Vehicle to the end of the fleetList ArrayList.
     */
    public void addVehicle(Vehicle givenVehicle) {

    }

    /**
     *
     * @param desiredClass
     * @return An ArrayList of Vehicle objects with the specified subclass.
     */
    public ArrayList<Vehicle> getVehicleList(Object desiredClass) {
        ArrayList<Vehicle> finalList = new ArrayList<>();

        if (desiredClass instanceof Vehicle) {
            for (int i = 0; i < fleetList.size(); i++) {
                if (fleetList.get(i) instanceof Vehicle) {
                    finalList.add(fleetList.get(i));
                }
            }

        } else if (desiredClass instanceof Van) {
            for (int i = 0; i < fleetList.size(); i++) {
                if (fleetList.get(i) instanceof Van) {
                    finalList.add(fleetList.get(i));
                }
            }

        } else if (desiredClass instanceof Automobile) {
            for (int i = 0; i < fleetList.size(); i++) {
                if (fleetList.get(i) instanceof Automobile) {
                    finalList.add(fleetList.get(i));
                }
            }

        } else if (desiredClass instanceof CargoVan) {
            for (int i = 0; i < fleetList.size(); i++) {
                if (fleetList.get(i) instanceof CargoVan) {
                    finalList.add(fleetList.get(i));
                }
            }

        } else if (desiredClass instanceof PassengerVan) {
            for (int i = 0; i < fleetList.size(); i++) {
                if (fleetList.get(i) instanceof PassengerVan) {
                    finalList.add(fleetList.get(i));
                }
            }

        }

        return finalList;
    }

}
