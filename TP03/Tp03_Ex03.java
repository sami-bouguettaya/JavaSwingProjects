
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tp03_Ex03 extends JFrame implements KeyListener, ActionListener {
     
    JTextField tf;
    JLabel lbl;
    JButton btn;

    public Tp03_Ex03() {
        
        lbl = new JLabel();
        tf = new JTextField(15);
        tf.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(tf);
        panel.add(btn);
        this.setLayout(new BorderLayout());
      this.add(lbl, BorderLayout.NORTH);
      this.add(panel, BorderLayout.SOUTH);

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(300, 100);
      this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        lbl.setText("You have typed " + ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        lbl.setText("You have pressed " +
                ke.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        lbl.setText("You have released " +
                ke.getKeyChar());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        tf.setText("");
    }

public static void main(String args[]) {
new Tp03_Ex03();
}
}