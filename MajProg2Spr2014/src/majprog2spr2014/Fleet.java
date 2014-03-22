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

    public Fleet() {
        fleetName = "";
        fleetList = null;
    }

    public Fleet(String fleetName) {
        this.fleetName = fleetName;
    }

    @Override
    public String toString() {
        String finalString = "";

        return finalString;
    }

    public void loadFleet(String inputFileName) {

    }

    public void saveFleet(String outputFileName) {

    }

    public Vehicle getVehicle() {
        return null;
    }

    public int getNumVehicles() {
        return 0;
    }

    public void setVehicle(Vehicle givenVehicle, int index) {

    }

    public void addVehicle(Vehicle givenVehicle) {

    }

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
