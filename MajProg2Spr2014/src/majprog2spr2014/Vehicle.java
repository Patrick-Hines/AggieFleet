/*
 * ====================================================

 Objective: This program will serve as the superclass of
 all classes other than Fleet. It will set the framework
 for all necessary vehicles.

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
public class Vehicle {

    //Declare class-level varables.
    protected String make;
    protected String model;
    protected String vin;
    protected int year;

    public Vehicle() {
        make = "No Data Given.";
        model = "No Data Given.";
        vin = "No Data Given.";

        year = 0;
    }

    /**
     *
     * @param make
     * @param model
     * @param vin
     * @param year
     *
     * Formal-Argument constructor that sets the class' properties to their
     * specified values.
     */
    public Vehicle(String make, String model, String vin, int year) {
        this.make = make;
        this.model = model;
        this.vin = vin;

        this.year = year;
    }

    /**
     * @return Returns the make of the vehicle.
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make Sets the make of the vehicle.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return Returns the model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model Sets the model of the vehicle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return Returns the vehicle identification number (VIN) of the vehicle.
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin Sets the vehicle identification number (VIN) of the vehicle.
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return Returns the year of the vehicle.
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year Sets the year of the vehicle.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return Returns a single String of all data in the class.
     */
    @Override
    public String toString() {
        String finalString = "";

        finalString += System.getProperty("line.separator") + getMake() + System.getProperty("line.separator")
                + getModel() + System.getProperty("line.separator")
                + getVin() + System.getProperty("line.separator")
                + getYear();

        return finalString;
    }
}
