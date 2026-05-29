import java.awt.*;
import java.awt.event.*;

// 1. The main method must be inside the class.
// 2. We implement ActionListener to handle the button click.
public class Calculator extends Frame implements ActionListener {
    
    // Declare components at the class level so the listener can see them
    TextField t1, t2, t3;
    Button b1;
    Label l1;

    public Calculator() {
        // Set up the layout and size
        this.setSize(400, 400);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Java is case-sensitive: 'TextField', not 'textField'
        t1 = new TextField(10);
        this.add(t1);

        l1 = new Label("-");
        this.add(l1);

        t2 = new TextField(10);
        this.add(t2);

        b1 = new Button("=");
        this.add(b1);

        // Attach an action listener to the button
        b1.addActionListener(this);

        t3 = new TextField(10);
        // Make the result field uneditable so users can't manually type in it
        t3.setEditable(false); 
        this.add(t3);

        // Allow the window to close when you click the 'X'
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }

    // This method triggers automatically when the "=" button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get text from fields, convert to integers
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            
            // Call your add method
            int result = add(num1, num2);
            
            // Display the result (convert int back to String)
            t3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            // Handle cases where the input is empty or not a number
            t3.setText("Error");
        }
    }

    public static int add(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Simply instantiate the class to run the GUI
        new Calculator();
    }
}