
import javax.swing.*;
import java.awt.*;

public class Tp02_Ex03 extends JFrame {

    public Tp02_Ex03() {
        // Configuration de la fenêtre
        setTitle("Exemple BoxLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Création du panneau principal avec un BoxLayout vertical (axe Y)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Création d'étiquettes et de champs de texte
        JLabel label1 = new JLabel("Nom");
        JTextField textField1 = new JTextField(15);

        JLabel label2 = new JLabel("Prénom");
        JTextField textField2 = new JTextField(15);

        JLabel label3 = new JLabel("Adresse");
        JTextField textField3 = new JTextField(15);

        // Ajout des composants dans le panneau avec un espacement flexible
        mainPanel.add(label1);
        mainPanel.add(textField1);
        mainPanel.add(Box.createVerticalStrut(10));  // Espacement vertical

        mainPanel.add(label2);
        mainPanel.add(textField2);
        mainPanel.add(Box.createVerticalStrut(10));  // Espacement vertical

        mainPanel.add(label3);
        mainPanel.add(textField3);

        // Ajout du panneau principal à la fenêtre
        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Tp02_Ex03();  
        });
    }
}

