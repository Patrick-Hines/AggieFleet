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
        Vehicle mainVehicle = new Vehicle("Toyota", "Corolla", "1234567", 1966);

        System.out.println("Vehicle class data (make, model, vin, year) : ");
        System.out.println(mainVehicle.toString());

        //Testing Automobile class
        mainVehicle = new Automobile(false, 5, 30, "Toyota", "Corolla", "1234567", 1966);

        System.out.println("Automobile class data (hybrid, maxPassengers, trunkSpace) : ");
        System.out.println(mainVehicle.toString());

        //Testing Van class
        mainVehicle = new Van(20, 6, "Toyota", "Corolla", "1234567", 1966);

        System.out.println("Van class data (clearanceHeight, numWindows) : ");
        System.out.println(mainVehicle.toString());

        //Testing Passenger Van class
        mainVehicle = new PassengerVan(3, 9, true, 20, 6, "Toyota", "Corolla", "1234567", 1966);

        System.out.println("PassengerVan class data (numSeatRows, maxPassengers, dvdPlayer) : ");
        System.out.println(mainVehicle.toString());

        //Testing Cargo Van class
        mainVehicle = new CargoVan(10, 25, 20, 6, "Toyota", "Corolla", "1234567", 1966);

        System.out.println("CargoVan class data (maxLoad, cargoArea) : ");
        System.out.println(mainVehicle.toString());
    }
}
