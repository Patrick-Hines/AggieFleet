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
import java.awt.GridLayout;
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

    public Interface(Fleet givenFleet) {

        setLayout(new BorderLayout());

        activeFleet = givenFleet;

        introSection = new JPanel();

        commandButtons = new JPanel();
        commandButtons.setLayout(new GridLayout(1, 4));

        view = new JButton("View Fleet");
        add = new JButton("Add to Fleet");
        save = new JButton("Save Fleet");
        exit = new JButton("Exit Program");

        intro = new JLabel();
        intro.setText("Lorem ipsum dolor sit amet, obortis viverra. Cras semper lacinia massa et placerat.");

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

    private class ButtonCommands implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent eventObject) {
            JButton btnRef = (JButton) eventObject.getSource();

            if (btnRef.getText().equals("Exit Program")) { //Exit button is clicked

                System.exit(0);

            } else if (btnRef.getText().equals("Save Fleet")) { //Save button is clicked

                JFileChooser fileSelection = new JFileChooser();

                int returnVal = fileSelection.showSaveDialog(null);

                String filePath = fileSelection.getSelectedFile().getAbsolutePath();
                filePath = filePath.replace("\\", "//");

                if (returnVal == JFileChooser.APPROVE_OPTION) {

                    activeFleet.saveFleet(filePath);
                    JOptionPane.showMessageDialog(null, "File Saved Successfully.");

                }

            } else if (btnRef.getText().equals("Add to Fleet")) { //Add button is clicked
                String userOption = JOptionPane.showInputDialog("Please enter the type of vehicle you would like to add:");

            } else if (btnRef.getText().equals("View Fleet")) { //View button is clicked

            }
        }
    }

}
