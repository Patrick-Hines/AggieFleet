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

        Fleet newFleet = new Fleet("Aggie Fleet");
        newFleet.loadFleet("C://Users//Patrick Hines//Downloads//Driver.txt");

        newFleet.addVehicle(new Automobile(true, 789, 987, "Roar", "Something", "1234156548", 4884));

//        newFleet.saveFleet("C://Users//Patrick Hines//Downloads//Driver.txt");
        System.out.print(newFleet.toString());

    }
}
