import javax.swing.*;
import java.awt.event.*;

public class Tp03_Ex01_2 extends JFrame implements MouseListener {

    public Tp03_Ex01_2() {
        this.setTitle("exo01");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        this.setContentPane(p);
        this.setVisible(true);
        p.addMouseListener(this); // Passer l'instance de la classe en tant que MouseListener
    }

    // Implement all methods of the MouseListener interface
    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new Tp03_Ex01_2(); // Instantiate the JFrame
    }
}
