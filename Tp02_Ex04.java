

import javax.swing.*;
import java.awt.*;

public class Tp02_Ex04 {
	

		public static void main(String[] args) {
       
		        JFrame frame = new JFrame("Mon Dialogu");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(600, 400);

	    
                JPanel cNorthPanel = new JPanel(new GridLayout(5, 1)); 
              cNorthPanel.add(new JLabel("Nom:"));
              cNorthPanel.add(new JTextField(14)); 
              cNorthPanel.add(new JLabel("Prénom:"));
              cNorthPanel.add(new JTextField(14)); 
              cNorthPanel.add(new JLabel("Aadress:"));

		        
              JPanel cCenterPanel = new JPanel(); 
      			JTextField adressText = new JTextField (44);
      			adressText.setPreferredSize(new Dimension (500,150));
      			cCenterPanel.add(adressText);
			     
			     
			     
      			JPanel cSouthPanel = new JPanel(); // Panel for Sex
      			cSouthPanel.add(new JLabel("Sexe:"));
      			JRadioButton homme = new JRadioButton("Homme");
      			JRadioButton femme = new JRadioButton("Femme");
      			ButtonGroup sexGroup = new ButtonGroup();
      			sexGroup.add(homme);
      			sexGroup.add(femme);
      			
      			cSouthPanel.add(homme);
      			cSouthPanel.add(femme);
		      
	            
	 	        JPanel centerPanel = new JPanel();
		        centerPanel.setLayout(new BorderLayout());
		        centerPanel.add(cNorthPanel, BorderLayout.NORTH);
		        centerPanel.add(cSouthPanel, BorderLayout.SOUTH);
		        centerPanel.add(new JLabel("Adresse:"));
		        centerPanel.add(cCenterPanel, BorderLayout.CENTER);


		        frame.add(centerPanel, BorderLayout.CENTER); 
		    
		        JPanel eastPanel = new JPanel(new GridLayout(9, 1));
		        eastPanel.add(new JCheckBox("Tennis"));
		        eastPanel.add(new JCheckBox("Natation"));
		        eastPanel.add(new JCheckBox("Athlétisme"));
		        eastPanel.add(new JCheckBox("Randonnée"));
		        eastPanel.add(new JCheckBox("Foot"));
		        eastPanel.add(new JCheckBox("Basket"));
		        eastPanel.add(new JCheckBox("Pétanque"));
		        eastPanel.add(new JCheckBox("Basket"));
		        eastPanel.add(new JCheckBox("Pétanque"));
		        frame.add(eastPanel, BorderLayout.EAST); 
		        
		    
		        JPanel southPanel = new JPanel();
		        
		        JButton okButton = new JButton("OK");
		        okButton.setPreferredSize(new Dimension(100, 30)); 
		        JButton cancelButton = new JButton("Annuler");
		        cancelButton.setPreferredSize(new Dimension(100, 30));
		        
		        southPanel.add(okButton);
		        southPanel.add(cancelButton);
		        frame.add(southPanel, BorderLayout.SOUTH);
                
                frame.setVisible(true);
		    }
		}
			
