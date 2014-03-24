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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Hines
 */
public class Fleet {

    private String fleetName;
    private ArrayList<Vehicle> fleetList;

    /**
     * No-Argument Constructor. Sets properties to their default values.
     */
    public Fleet() {
        fleetName = "";
        fleetList = new ArrayList<>();
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
        fleetList = new ArrayList<>();
    }

    /**
     *
     * @return All data within the Fleet class as a single String.
     */
    @Override
    public String toString() {
        String finalString = "";
        finalString += getFleetName() + System.getProperty("line.separator");

        for (Vehicle pulledVehicle : fleetList) {
            finalString += pulledVehicle.toString();
        }

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
        try {
            File data = new File(inputFileName);
            Scanner dataParse = new Scanner(data);

            while (dataParse.hasNextLine()) {

                if (dataParse.hasNext("A") || dataParse.hasNext("a")) { //The following data will be for an Automobile.

                    dataParse.nextLine(); //Toss away the letter value

                    //Data for the 'Vehicle' class.
                    String make = dataParse.nextLine();
                    String model = dataParse.nextLine();
                    String vin = dataParse.nextLine();
                    int year = Integer.parseInt(dataParse.nextLine());

                    //Data for the 'Automobile' class.
                    boolean hybrid = Boolean.parseBoolean(dataParse.nextLine());
                    int maxPassengers = Integer.parseInt(dataParse.nextLine());
                    float trunkSpace = Float.parseFloat(dataParse.nextLine());

                    //Make a new Automobile object and store it in the fleetList ArrayList
                    Automobile newAuto = new Automobile(hybrid, maxPassengers, trunkSpace, make, model, vin, year);
                    fleetList.add(newAuto);

                } else if (dataParse.hasNext("V") || dataParse.hasNext("v")) { //The following data will be for a Van.

                    dataParse.nextLine(); //Toss away the letter value

                    //Data for the 'Vehicle' class.
                    String make = dataParse.nextLine();
                    String model = dataParse.nextLine();
                    String vin = dataParse.nextLine();
                    int year = Integer.parseInt(dataParse.nextLine());

                    //Data for the 'Van' class.
                    float clearanceHeight = Float.parseFloat(dataParse.nextLine());
                    int numWindows = Integer.parseInt(dataParse.nextLine());

                    //Make a new Van object and store it in the fleetList ArrayList.
                    Van newVan = new Van(clearanceHeight, numWindows, make, model, vin, year);
                    fleetList.add(newVan);

                } else if (dataParse.hasNext("P") || dataParse.hasNext("p")) { //The following data will be for a PassengerVan.

                    dataParse.nextLine(); //Toss away the letter value

                    //Data for the 'Vehicle' class.
                    String make = dataParse.nextLine();
                    String model = dataParse.nextLine();
                    String vin = dataParse.nextLine();
                    int year = Integer.parseInt(dataParse.nextLine());

                    //Data for the 'Van' superclass.
                    float clearanceHeight = Float.parseFloat(dataParse.nextLine());
                    int numWindows = Integer.parseInt(dataParse.nextLine());

                    //Data for the 'PassengerVan' class.
                    int numSeatRows = Integer.parseInt(dataParse.nextLine());
                    int maxPassengers = Integer.parseInt(dataParse.nextLine());
                    boolean dvdPlayer = Boolean.parseBoolean(dataParse.nextLine());

                    //Make a new PassengerVan object and store it in the fleetList ArrayList.
                    PassengerVan newPassengerVan = new PassengerVan(numSeatRows,
                            maxPassengers, dvdPlayer, clearanceHeight, numWindows,
                            make, model, vin, year);

                    fleetList.add(newPassengerVan);

                } else if (dataParse.hasNext("C") || dataParse.hasNext("c")) { //The following data will be for a CargoVan.

                    dataParse.nextLine(); //Toss away the letter value

                    //Data for the 'Vehicle' class.
                    String make = dataParse.nextLine();
                    String model = dataParse.nextLine();
                    String vin = dataParse.nextLine();
                    int year = Integer.parseInt(dataParse.nextLine());

                    //Data for the 'Van' superclass.
                    float clearanceHeight = Float.parseFloat(dataParse.nextLine());
                    int numWindows = Integer.parseInt(dataParse.nextLine());

                    //Data for the 'CargoVan' class.
                    float maxLoad = Float.parseFloat(dataParse.nextLine());
                    float cargoArea = Float.parseFloat(dataParse.nextLine());

                    //Make a new CargoVan object and store it in the fleetList ArrayList.
                    CargoVan newCargoVan = new CargoVan(maxLoad, cargoArea, clearanceHeight, numWindows,
                            make, model, vin, year);

                    fleetList.add(newCargoVan);

                }
            }

        } catch (FileNotFoundException notFound) {
            JOptionPane.showMessageDialog(null, "Sorry, the file that you have specified can not be found.");
        }

    }

    /**
     *
     * @param outputFileName
     *
     * Saves the current properties of the Fleet class to the specified
     * filepath.
     */
    public void saveFleet(String outputFileName) {
        try {
            File data = new File(outputFileName);

            PrintWriter writer = new PrintWriter(data);

            writer.println(this.toString());
            writer.close();

        } catch (FileNotFoundException notFound) {
            JOptionPane.showMessageDialog(null, "Sorry, the file that you have specified can not be found.");
        }
    }

    /**
     *
     * @return A Vehicle object within the fleetList ArrayList at a specific
     * index.
     */
    public Vehicle getVehicle(int index) {
        return fleetList.get(index);
    }

    /**
     *
     * @return The number of items inside the fleetList ArrayList.
     */
    public int getNumVehicles() {
        return fleetList.size();
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
        fleetList.set(index, givenVehicle);
    }

    /**
     *
     * @param givenVehicle
     *
     * Appends the given Vehicle to the end of the fleetList ArrayList.
     */
    public void addVehicle(Vehicle givenVehicle) {
        fleetList.add(givenVehicle);
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

    /**
     * @return the fleetName
     */
    public String getFleetName() {
        return fleetName;
    }

    /**
     * @param fleetName the fleetName to set
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

}
