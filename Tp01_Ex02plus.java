
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tp01_Ex02plus {

    public static void main(String args[]) {
        JFrame fenetre1 = new JFrame();
        fenetre1.setTitle("Calc");
        fenetre1.setSize(200, 100);
        fenetre1.setResizable(false);
        fenetre1.setLocationRelativeTo(null);
        fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField text = new JTextField(10);
        JButton button1 = new JButton("+1");
        JButton button2 = new JButton("-1");

        // Action pour le bouton +1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                    int currentValue = Integer.parseInt(text.getText());
                    text.setText(String.valueOf(currentValue + 1));
             
            }
       });

        // Action pour le bouton -1
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                    int currentValue = Integer.parseInt(text.getText());
                    text.setText(String.valueOf(currentValue - 1));
                
            }
        });

        panel.add(text);
        panel.add(button1);
        panel.add(button2);
        fenetre1.setContentPane(panel);
        
        fenetre1.setVisible(true);
    }
}

