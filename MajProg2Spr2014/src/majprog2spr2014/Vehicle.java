/*
 * ====================================================

 Objective: This program will serve as the superclass of
 all classes other than Fleet. It will set the framework
 for all necessary vehicles.

 Developed by: Patrick Hines
 Began: 3-20-2014


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
        make = "";
        model = "";
        vin = "";

        year = 0;
    }

    public Vehicle(String make, String model, String vin, int year) {
        this.make = make;
        this.model = model;
        this.vin = vin;

        this.year = year;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return A single String of all data in the class.
     */
    @Override
    public String toString() {
        String finalString = "";

        finalString += make + System.getProperty("line.separator")
                + model + System.getProperty("line.separator")
                + make + System.getProperty("line.separator")
                + vin + System.getProperty("line.separator")
                + year + System.getProperty("line.separator");

        return finalString;
    }
}
