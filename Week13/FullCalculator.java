import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FullCalculator extends JFrame implements ActionListener {

    // Display screen
    private JTextField display;

    // Calculator state variables
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public FullCalculator() {
        // Set up the window frame
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window on screen
        setLayout(new BorderLayout());

        // Create the display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        // Create the button panel with a 4x4 Grid Layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Define the buttons layout
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Populate the grid with buttons
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 22));
            button.setFocusPainted(false);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If a number or decimal point is pressed
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9')) {
            display.setText(display.getText() + command);
        }
        // If the Clear button is pressed
        else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
        }
        // If the Equals button is pressed
        else if (command.equals("=")) {
            if (!display.getText().isEmpty()) {
                num2 = Double.parseDouble(display.getText());
                
                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': 
                        if (num2 == 0) {
                            display.setText("Error (Div by 0)");
                            return;
                        }
                        result = num1 / num2; 
                        break;
                }
                
                // Format display to drop ".0" for whole numbers
                if (result % 1 == 0) {
                    display.setText(String.valueOf((int) result));
                } else {
                    display.setText(String.valueOf(result));
                }
                num1 = result; // Allow chaining calculations
            }
        }
        // If an operator button (+, -, *, /) is pressed
        else {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = command.charAt(0);
                display.setText(""); // Clear screen for next number
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new FullCalculator());
    }
}