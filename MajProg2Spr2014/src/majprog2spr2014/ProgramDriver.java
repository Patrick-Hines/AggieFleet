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

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Hines
 */
public class ProgramDriver {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello, and welcome to your new fleet management software! To get started, please select your fleet text file to load in. Click 'OK' to continue.");

//        String inputFilePath = args[0];
        JFileChooser fileSelection = new JFileChooser();

        fileSelection.showOpenDialog(null);

        String filePath = fileSelection.getSelectedFile().getAbsolutePath();
        filePath = filePath.replace("\\", "//");

        Fleet newFleet = new Fleet("Aggie Fleet");
        newFleet.loadFleet(filePath);

        Interface window = new Interface(newFleet);
        window.setTitle(newFleet.getFleetName());

        window.setSize(600, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
