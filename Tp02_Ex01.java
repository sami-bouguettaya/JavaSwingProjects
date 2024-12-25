
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Tp02_Ex01 extends JFrame {

    public Tp02_Ex01() {
        
        setTitle("Exemple BorderLayout");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("LE MENU"));
        add(menuBar, BorderLayout.NORTH);

      
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Arbre de navigation");
        root.add(new DefaultMutableTreeNode("fils 1"));
        
        JTree arbreNavigation = new JTree(root);
        add(arbreNavigation, BorderLayout.WEST);

       
        JPanel barreVisualisation = new JPanel();
        barreVisualisation.setBorder(BorderFactory.createTitledBorder("Barre de visualisation"));
        barreVisualisation.setPreferredSize(new Dimension (150,100));
        add(barreVisualisation, BorderLayout.EAST);
        
        
        JPanel southBarre = new JPanel();
        southBarre.setBorder(BorderFactory.createTitledBorder("North Barre "));
        add(southBarre, BorderLayout.SOUTH);
        
        
        JPanel panneau = new JPanel();
        panneau.setBorder(BorderFactory.createTitledBorder("Espace principal"));
        panneau.setBackground(Color.WHITE);
        add(panneau, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tp02_Ex01 fenetre = new Tp02_Ex01();
            fenetre.setVisible(true);
        });
    }
}

