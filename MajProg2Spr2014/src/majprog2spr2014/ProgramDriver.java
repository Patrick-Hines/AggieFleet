/*
 * ====================================================

 Objective: This program will serve as the hub
 for all other classes in the project.

 Developed by: Patrick Hines
 Began: 3-20-2014


 * ====================================================

 */
package majprog2spr2014;

/**
 *
 * @author Patrick Hines
 */
public class ProgramDriver {

    public static void main(String[] args) {

        //Testing Vehcile class
        Vehicle newVehicle = new Vehicle("Toyota", "Corolla", "Lorem Ipsum.", 1966);

        System.out.println("Vehicle class data (make, model, vin, year) : ");
        System.out.println(newVehicle.toString());

        //Testing Automobile class
        newVehicle = new Automobile(false, 5, 30);

        System.out.println("Automobile class data (hybrid, maxPassengers, trunkSpace) : ");
        System.out.println(newVehicle.toString());
    }
}
