package TP04;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tp04_Ex03 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton copyButton, cutButton, pasteButton;

    public Tp04_Ex03() {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Création de la zone de texte
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea); // Pour permettre le défilement
        textArea.setLineWrap(true); // Retour à la ligne automatique
        textArea.setWrapStyleWord(true);

        // Création des boutons
        copyButton = new JButton("Copy");
        cutButton = new JButton("Cut");
        pasteButton = new JButton("Paste");

        // Ajout des écouteurs d'événements
        copyButton.addActionListener(this);
        cutButton.addActionListener(this);
        pasteButton.addActionListener(this);

        // Organisation des boutons dans un panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(copyButton);
        buttonPanel.add(cutButton);
        buttonPanel.add(pasteButton);

        // Ajout des composants à la fenêtre
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == copyButton) {
            textArea.copy(); // Copie le texte sélectionné
        } else if (e.getSource() == cutButton) {
            textArea.cut(); // Coupe le texte sélectionné
        } else if (e.getSource() == pasteButton) {
            textArea.paste(); // Colle le texte dans la zone
        }
    }

    public static void main(String[] args) {
        new Tp04_Ex03();
    }
}
