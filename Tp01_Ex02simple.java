

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tp01_Ex02simple extends JFrame {
    private JTextField text;
    private JButton button1, button2;

    public Tp01_Ex02simple() {
        text = new JTextField(15);
        button1 = new JButton("1");
        button2 = new JButton("2");

        setTitle("Fenetre simple");
        setSize(400, 100);
        setLayout(new FlowLayout());

        this.getContentPane().add(text);
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Pour fermer l'application
    }

    public static void main(String[] args) {
        Tp01_Ex02simple ma_fen = new Tp01_Ex02simple();
        ma_fen.setVisible(true);
    }
}

