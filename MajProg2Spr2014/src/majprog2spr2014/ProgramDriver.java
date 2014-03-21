/*
 * ====================================================

 Objective: This program will serve as the hub
 for all other classes in the project.

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
public class ProgramDriver {

    public static void main(String[] args) {

        //Testing Vehcile class
        Vehicle mainVehicle = new Vehicle("Toyota", "Corolla", "Lorem Ipsum.", 1966);

        System.out.println("Vehicle class data (make, model, vin, year) : ");
        System.out.println(mainVehicle.toString());

        //Testing Automobile class
        mainVehicle = new Automobile(false, 5, 30);

        System.out.println("Automobile class data (hybrid, maxPassengers, trunkSpace) : ");
        System.out.println(mainVehicle.toString());

        //Testing Van class
        mainVehicle = new Van(20, 6);

        System.out.println("Van class data (clearanceHeight, numWindows) : ");
        System.out.println(mainVehicle.toString());
    }
}
