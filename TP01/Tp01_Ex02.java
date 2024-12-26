
import javax.swing.*;

public class Tp01_Ex02 {

	public static void main(String[] args) {
		
		
	
		            JFrame fenetre1 = new JFrame() ;
		            fenetre1.setTitle("Calc");
		            fenetre1.setSize(350, 200); // Increased the size
		            fenetre1.setResizable(false);
		            fenetre1.setLocationRelativeTo(null);
		            fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    
		            JPanel panel = new JPanel();

		            JTextField text = new JTextField (10);
		            JButton button1 = new JButton("+1");
		            JButton button2 = new JButton("-1");
		            panel.add(text);
		            panel.add(button1);
		            panel.add(button2);
		            fenetre1.setContentPane(panel);
		          //fenetre1.pack(); traja3lak lfentre tbanaylak ktiba meme sghira auto
		            fenetre1.setVisible(true);
		            
		        
		        }
		        

	
	}

























