
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tp01_Ex03 {

	public static void main (String args[]){
		
		
            JFrame fenetre1 = new JFrame() ;
            fenetre1.setTitle("Carres");
            fenetre1.setSize(400, 100); // Increased the size
            fenetre1.setResizable(false);
            fenetre1.setLocationRelativeTo(null);
            fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
            JPanel panel = new JPanel();
            JLabel nombre = new JLabel("Nombre :");
            JLabel texte = new JLabel("125");
            JTextField text = new JTextField (10);
            
  
            JButton button1 = new JButton("calcule");
            JLabel carre = new JLabel("Carre : 15625");
            panel.add(nombre);
            panel.add(text);
            panel.add(button1);
            panel.add(carre);
           
            fenetre1.setContentPane(panel);
          
            fenetre1.setVisible(true);
            
          
        
        }
	
}