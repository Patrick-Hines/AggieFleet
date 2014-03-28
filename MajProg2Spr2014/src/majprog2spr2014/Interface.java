/*
 * ====================================================

 Objective:

 Developed by:
 Began:
 Ended:


 * ====================================================

 */
package majprog2spr2014;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Patrick Hines
 */
public class Interface extends JFrame {

    JPanel commandButtons;
    JPanel introSection;

    JButton view;
    JButton add;
    JButton save;
    JButton exit;

    JLabel intro;

    Fleet activeFleet;

    private boolean fileSaved;

    /**
     *
     * @param givenFleet
     *
     * Constructor method to set default values.
     */
    public Interface(Fleet givenFleet) {

        setLayout(new BorderLayout());

        activeFleet = givenFleet;
        fileSaved = true;

        introSection = new JPanel();

        commandButtons = new JPanel();
        commandButtons.setLayout(new FlowLayout(FlowLayout.CENTER));

        view = new JButton("View Fleet");
        add = new JButton("Add to Fleet");
        save = new JButton("Save Fleet");
        exit = new JButton("Exit Program");

        intro = new JLabel();
        intro.setText("Welcome to " + activeFleet.getFleetName() + ". To get started, please select one of the options below:");

        commandButtons.add(view);
        commandButtons.add(add);
        commandButtons.add(save);
        commandButtons.add(exit);

        introSection.add(intro);

        view.addActionListener(new ButtonCommands());
        add.addActionListener(new ButtonCommands());
        save.addActionListener(new ButtonCommands());
        exit.addActionListener(new ButtonCommands());

        add(introSection, BorderLayout.CENTER);
        add(commandButtons, BorderLayout.SOUTH);

    }

    /**
     * @return Returns, as a boolean, whether or not the file has been saved.
     */
    public boolean isFileSaved() {
        return fileSaved;
    }

    /**
     * @param fileSaved Sets, as a boolean, whether or not the file has been
     * saved.
     */
    public void setFileSaved(boolean fileSaved) {
        this.fileSaved = fileSaved;
    }

    private class ButtonCommands implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent eventObject) {
            JButton btnRef = (JButton) eventObject.getSource();

            if (btnRef.getText().equals("Exit Program")) { //Exit button is clicked

                if (isFileSaved()) {
                    System.exit(0);

                } else {
                    int userOption = JOptionPane.showConfirmDialog(null, "You have unsaved changes to your fleet. Would you like to save now?");

                    if (userOption == JOptionPane.YES_OPTION) {
                        saveFile();
                        System.exit(0);

                    } else if (userOption == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                }

            } else if (btnRef.getText().equals("Save Fleet")) { //Save button is clicked

                saveFile();

            } else if (btnRef.getText().equals("Add to Fleet")) { //Add button is clicked
                String userOption = JOptionPane.showInputDialog("Please enter the type of vehicle you would like to add (Automobile, Passenger Van or Cargo Van):");

                if (userOption.equalsIgnoreCase("Passenger Van")
                        || userOption.equalsIgnoreCase("PassengerVan")) { //User has entered 'Passenger Van'

                    displayForm("PassengerVan");

                } else if (userOption.equalsIgnoreCase("Automobile")) { //User has entered 'Automobile'
                    displayForm("Automobile");
                } else if (userOption.equalsIgnoreCase("Cargo Van")
                        || userOption.equalsIgnoreCase("CargoVan")) { //User has entered 'Cargo Van'

                    displayForm("CargoVan");

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid entry. Please enter either 'Automobile,' 'Passenger Van' or 'Cargo Van'");
                }

            } else if (btnRef.getText().equals("View Fleet")) { //View button is clicked
                ViewingInterface window = new ViewingInterface(activeFleet);

                window.setTitle("Fleet Summary");
                window.setSize(500, 200);
                window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                window.setLocationRelativeTo(null);
                window.setVisible(true);
            }
        }
    }

    /**
     *
     * @param formType
     *
     * Method that dynamically generates the form for adding a vehicle to the
     * current fleet.
     */
    private void displayForm(String formType) {

        AddingInterface window = new AddingInterface(activeFleet, this);

        if (formType.equalsIgnoreCase("Automobile")) {

            window.buildAutomobile();

        } else if (formType.equalsIgnoreCase("PassengerVan")) {

            window.buildPassengerVan();

        } else if (formType.equalsIgnoreCase("CargoVan")) {

            window.buildCargoVan();
        }

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    /**
     * Simple method to save the fleet as a plain text file
     */
    private void saveFile() {
        JFileChooser fileSelection = new JFileChooser();

        int returnVal = fileSelection.showSaveDialog(null);

        String filePath = fileSelection.getSelectedFile().getAbsolutePath();
        filePath = filePath.replace("\\", "//");

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            activeFleet.saveFleet(filePath);
            JOptionPane.showMessageDialog(null, "File Saved Successfully.");

        }

        setFileSaved(true);
    }

}
