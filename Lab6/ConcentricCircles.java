package CSC171_Lab1;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConcentricCircles 
{
	public static void main(String [] args)
	{	
		String input = JOptionPane.showInputDialog("How many circles would you like to draw? ");
		
		int choice = Integer.parseInt(input);
		
		for(int i = 0; i < choice; i++)
		{
		//	g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
		}
		
		
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		//application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}
}
