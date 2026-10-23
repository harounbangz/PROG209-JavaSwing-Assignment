import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAssignment extends JFrame {

    // Component declarations
    private JLabel label;
    private JButton changeTextBtn;
    private JButton changeBgBtn;
    private JPanel panel;

    // =========================================================================
    // STEP 4C: CONSTRUCTOR IMPLEMENTATION
    // All UI setup, configurations, and event handlers are placed inside.
    // =========================================================================
    public SwingAssignment() {

        // 1. Configure JFrame window properties
        setTitle("Java Swing Assignment");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 2. Set custom application icon using ImageIcon
        try {
            ImageIcon icon = new ImageIcon("assets/app_icon.png");
            setIconImage(icon.getImage());
        } catch (Exception e) {
            System.out.println("Icon image not found, running with default icon.");
        }

        // 3. Instantiate JPanel container
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        panel.setBackground(new Color(245, 245, 245));

        // 4. Instantiate JLabel with required text
        label = new JLabel("Welcome to Java Swing First Individual Assignment by Haroun Bangura");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(new Color(40, 40, 40));

        // 5. Instantiate JButtons with labels
        changeTextBtn = new JButton("Change Text");
        changeBgBtn = new JButton("Change Background");

        // Style buttons
        changeTextBtn.setFocusable(false);
        changeBgBtn.setFocusable(false);

        // 6. Event Handling: Add ActionListener to change JLabel text
        changeTextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text updated! Event Driven Programming in Java Swing.");
            }
        });

        // 7. Event Handling: Add ActionListener to change JPanel background color
        // 7. Event Handling: Add ActionListener to change JPanel background color
        changeBgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(173, 216, 230));
            }
        });

        // --- NEW LAYOUT CODE STARTS HERE ---
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        buttonPanel.setOpaque(false);

        buttonPanel.add(changeTextBtn);
        buttonPanel.add(changeBgBtn);

        panel.add(label);
        panel.add(buttonPanel);
        // --- NEW LAYOUT CODE ENDS HERE ---

        add(panel);
    }
    

    // =========================================================================
    // STEP 4D: MAIN ENTRY POINT
    // Executes the application safely on the Event Dispatch Thread (EDT).
    // =========================================================================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingAssignment app = new SwingAssignment();
                app.setVisible(true);
            }
        });
    }
}