import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame{
    private JButton createTeamButton, manageTeamButton, viewRidersButton, teamBudgetButton,
            createRaceButton, manageRaceButton, chooseRidersButton, raceBudgetButton, chooseSponsorsButton,
            viewSponsorsButton, sponsorBudgetButton;
    private JTextArea outputTextArea;

    public GUI() {
        setTitle("Propel"); // Set window title
        setSize(800, 500); // Set window size
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Set default close operation
        setLayout(new BorderLayout()); // Set layout for the frame

        initializeComponents(); // Initialize UI components

        // Add window listener to prompt for saving before exit
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                promptToSaveBeforeExit();
            }
        });

        setVisible(true); // Set window visibility
    }
}
