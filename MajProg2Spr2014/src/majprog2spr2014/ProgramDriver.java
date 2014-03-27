/*
 * ====================================================

 Objective: This program will serve as the hub
 for all other classes in the project.



 Developed by: Patrick Hines
 Began: 3-21-2014
 Ended: 3-24-2014


 * ====================================================

 */
package majprog2spr2014;

import javax.swing.JFrame;

/**
 *
 * @author Patrick Hines
 */
public class ProgramDriver {

    public static void main(String[] args) {
        //Testing Automobile class
        Automobile auto = new Automobile(false, 5, 30, "Dodge", "Corolla", "Lorem Ipsum.", 1966);
        System.out.println(auto.toString());

        //Testing Passenger Van class
        PassengerVan passVan = new PassengerVan(3, 9, true, 20, 6, "Audi", "Corolla", "Lorem Ipsum.", 1966);
        System.out.println(passVan.toString());

        //Testing Cargo Van class
        CargoVan cargoVan = new CargoVan(10, 25, 20, 6, "Ford", "Corolla", "Lorem Ipsum.", 1966);
        System.out.println(cargoVan.toString());

        Fleet newFleet = new Fleet("Aggie Fleet");
        newFleet.loadFleet("C://Users//Patrick Hines//Downloads//vehicles.txt");

        newFleet.addVehicle(auto);
        newFleet.addVehicle(passVan);
        newFleet.addVehicle(cargoVan);

//        ArrayList<Vehicle> newList = newFleet.getVehicleList(PassengerVan.class);
//        newFleet.saveFleet("C://Users//Patrick Hines//Downloads//Driver.txt");
//        for (Vehicle x : newList) {
//            System.out.print(x.toString());
//        }
        System.out.println(newFleet.toString());

        Interface window = new Interface(newFleet);
        window.setTitle(newFleet.getFleetName());

        window.setSize(600, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
