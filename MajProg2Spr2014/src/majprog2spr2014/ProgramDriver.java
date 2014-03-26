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

import java.util.ArrayList;

/**
 *
 * @author Patrick Hines
 */
public class ProgramDriver {

    public static void main(String[] args) {

        Fleet newFleet = new Fleet("Aggie Fleet");
        newFleet.loadFleet("C://Users//Patrick Hines//Downloads//vehicles.txt");

        ArrayList<Vehicle> newList = newFleet.getVehicleList(PassengerVan.class);

//        newFleet.saveFleet("C://Users//Patrick Hines//Downloads//Driver.txt");
        for (Vehicle x : newList) {
            System.out.print(x.toString());
        }
//        System.out.print(newFleet.toString());

    }
}
