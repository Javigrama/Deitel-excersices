package ejer14_7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



public class Cerdo extends JFrame implements KeyListener {

	   private String line1 = ""; // first line of textarea
	   private String line2 = ""; // second line of textarea
	   
	   private JTextArea textArea; // textarea to display output
	   String[] latin;
	   
	   public Cerdo() {
		   
		   super("Latin cerdo");
		   setLayout(new FlowLayout());
		   textArea=new JTextArea(10, 45);
		  
		   addKeyListener(this);
		   add(textArea);
		   textArea.setText("Introduzca una frase...");
		   textArea.setEnabled(false);
		   textArea.setDisabledTextColor(Color.BLACK);
		   textArea.setBackground(this.getBackground());
		   textArea.setPreferredSize(this.getSize());
		   latin=new String[20];
		   
	   }
	


    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cerdo frame=new Cerdo();
//      frame.add(panel, BorderLayout.CENTER);
     
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setSize(600, 300);
      frame.setLocation(500, 500);

				
	}
	
	public void imprimirPalabraEnLatin(String[] array) {
		
		for(int i=0; i<array.length; i++) {
			latin[i]=array[i]+array[i].charAt(0)+"ae";
			 latin[i]=array[i].replaceFirst("\\D", "" );

		}
		
		
	}
		
		
		public void keyPressed(KeyEvent e){
		   
			if((e.getKeyCode()==10)&&(line1.length()>0)) { latin=line1.split("\\s");
				    
			imprimirPalabraEnLatin(latin);
			for(String i:latin)
			line2+=i+" ";
			
			}
			for(int i=0; i<latin.length; i++)
				   latin[i]=null;
		   }

		   // handle release of any key
		   @Override
		   public void keyReleased(KeyEvent e){
		   
			   if(e.getKeyCode()==10) {
		      
			 
					   textArea.setText("\n"+line2);
					   line2="";
			   
					   for(int i=0; i<latin.length; i++)
						   latin[i]=null;
					   line1="";
			
			   }
		   }   
		   

		   // handle press of an action key
		   @Override
		   public void keyTyped(KeyEvent e) {

		   
		      line1 += e.getKeyChar();
		      textArea.setText(line1);
		      System.out.print(line1);
		      
		      
		   }

		 	
}
