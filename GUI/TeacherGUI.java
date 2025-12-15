import javax.swing.*;

public class TeacherGUI {
    public static void main(String[] args) {
        // 1. Top-Level Container
        JFrame frame = new JFrame("My First Swing App");
        
        // 2. Intermediate Container
        JPanel panel = new JPanel();
        
        // 3. Elements (Components)
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Hello Student!");
        
        // The Assembly
        panel.add(label);   // Put label on panel
        panel.add(button);  // Put button on panel
        frame.add(panel);   // Put panel in frame
        
        // Final Setup
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
    
}
