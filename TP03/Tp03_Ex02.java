
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Tp03_Ex02 extends JFrame {

    private JTextField fnameField, lnameField, emailField, phoneField;

    public Tp03_Ex02() {
        // Configuration de la fenêtre
        this.setTitle("Gestion des étudiants");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5, 2, 10, 10));

        // Création des champs et labels
        JLabel fnameLabel = new JLabel("Prénom:");
        fnameField = new JTextField();
        JLabel lnameLabel = new JLabel("Nom:");
        lnameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel phoneLabel = new JLabel("Téléphone:");
        phoneField = new JTextField();

        // Boutons
        JButton registerButton = new JButton("Enregistrer");
        JButton clearButton = new JButton("Effacer");

        // Ajout des composants à la fenêtre
        this.add(fnameLabel);
        this.add(fnameField);
        this.add(lnameLabel);
        this.add(lnameField);
        this.add(emailLabel);
        this.add(emailField);
        this.add(phoneLabel);
        this.add(phoneField);
        this.add(registerButton);
        this.add(clearButton);

        // Actions des boutons
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveStudentData();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Rendre la fenêtre visible
        this.setVisible(true);
    }

    private void saveStudentData() {
        try {
            File bdd = new File("./bdd.txt");
            BufferedWriter bf = new BufferedWriter(new FileWriter(bdd, true));
            bf.write(fnameField.getText() + "\t" +
                     lnameField.getText() + "\t" +
                     emailField.getText() + "\t" +
                     phoneField.getText() + "\n");
            bf.flush();
            bf.close();
        } catch (IOException e) {
        }
    }

    private void clearFields() {
        fnameField.setText("");
        lnameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }

    public static void main(String[] args) {
        new Tp03_Ex02();
    }
}
