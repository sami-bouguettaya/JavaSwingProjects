import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tp05_Ex01 {

    public static int afficheConfirm(JFrame parent, String question) {
        // Création de la boîte de dialogue
        JDialog dialog = new JDialog(parent, "CHOIX", true); // Fenêtre modale
        dialog.setSize(200, 100);
        dialog.setLayout(new BorderLayout());
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Texte de la question
        JLabel label = new JLabel(question, SwingConstants.CENTER);
        dialog.add(label, BorderLayout.CENTER);

        // Boutons Oui, Non, Annul
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton buttonOui = new JButton("Oui");
        JButton buttonNon = new JButton("Non");
        JButton buttonAnnul = new JButton("Annul");

        // Valeur de retour (0 pour Oui, 1 pour Non, 2 pour Annul, -1 pour fermeture)
        final int[] result = {-1};

        // Gestion des événements des boutons
        buttonOui.addActionListener(e -> {
            result[0] = 0;
            dialog.dispose();
        });

        buttonNon.addActionListener(e -> {
            result[0] = 1;
            dialog.dispose();
        });

        buttonAnnul.addActionListener(e -> {
            result[0] = 2;
            dialog.dispose();
        });

        // Ajout des boutons au panel
        buttonPanel.add(buttonOui);
        buttonPanel.add(buttonNon);
        buttonPanel.add(buttonAnnul);

        // Ajout du panel des boutons à la boîte de dialogue
        dialog.add(buttonPanel, BorderLayout.SOUTH);

        // Centrage de la boîte de dialogue
        dialog.setLocationRelativeTo(parent);

        // Affichage de la boîte de dialogue
        dialog.setVisible(true);

        return result[0];
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Exemple d'utilisation
        int choix = Tp05_Ex01.afficheConfirm(frame, "Voulez-vous continuer ?");
        System.out.println("Choix de l'utilisateur : " + choix);
    }
}

