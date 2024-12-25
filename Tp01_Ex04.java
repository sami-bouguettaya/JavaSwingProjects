       



import javax.swing.*;
import java.awt.*;

public class Tp01_Ex04{
    public static void main(String[] args) {
        // Créer la fenêtre principale
        JFrame frame = new JFrame("Identificateur");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginField = new JTextField(10);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(10);

        JButton enterButton = new JButton("Entrer");
        JPanel pane = new JPanel ();
   
       pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        pane.add(loginLabel);
        pane.add(loginField);
        pane.add(passwordLabel);
        pane.add(passwordField);
        pane.add(new JLabel(""));
        pane.add(enterButton);
 
        frame.setContentPane(pane);
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}