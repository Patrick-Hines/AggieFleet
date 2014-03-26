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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

    public Interface() {

        setLayout(new BorderLayout());

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

        add(introSection, BorderLayout.CENTER);
        add(commandButtons, BorderLayout.SOUTH);

    }
}
