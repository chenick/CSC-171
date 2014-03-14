import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JPanel;

public class MyCartesianPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		int gridWidth = (width*9)/10;
		int gridHeight = (height*9)/10;
		
		g.setColor(Color.BLACK);
		//Draw y-axis
		g.drawLine((width/20)+(gridWidth/2), height/20, (width/20)+(gridWidth/2), (height/20)+gridHeight);
		//Draw x-axis
		g.drawLine(width/20, (height/20)+(gridHeight/2), (width/20)+gridWidth, (height/20)+(gridHeight/2));
		
		int unitWidth = (((width/20)+gridWidth)-((width/20)+(gridWidth/2)))/10;
		int unitHeight = (((height/20)+gridHeight)-((height/20)+(gridHeight/2)))/10;
		
		g.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		//Draw negative vertical lines
		for (int i = 0; i < 10; i++)
		{
			g.setColor(Color.GRAY);
			g.drawLine((width/20)+(i*unitWidth), height/20, (width/20)+(i*unitWidth), (height/20)+gridHeight);
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(i-10), (width/20)+(i*unitWidth)-5, (height/20)+(gridHeight/2)+12);
		}
		//Draw positive vertical lines
		for (int i = 1; i < 11; i++)
		{
			g.setColor(Color.GRAY);
			g.drawLine((width/20)+(gridWidth/2)+(i*unitWidth), height/20, (width/20)+(gridWidth/2)+(i*unitWidth), (height/20)+gridHeight);
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(i), (width/20)+(gridWidth/2)+(i*unitWidth)-5, (height/20)+(gridHeight/2)+12);
		}
		//Draw negative horizontal lines
		for (int i = 1; i < 11; i++)
		{
			g.setColor(Color.GRAY);
			g.drawLine((width/20), (height/20)+(gridHeight/2)+(i*unitHeight), (width/20)+gridWidth, (height/20)+(gridHeight/2)+(i*unitHeight));
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(i*-1), (width/20)+(gridWidth/2)+2, (height/20)+(gridHeight/2)+(i*unitHeight)+4);
		}
		//Draw positive horizontal lines
		for (int i = 0; i < 10; i++)
		{
			g.setColor(Color.GRAY);
			g.drawLine((width/20), (height/20)+(i*unitHeight), (width/20)+gridWidth, (height/20)+(i*unitHeight));
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(i+1), (width/20)+(gridWidth/2)+2, (height/20)+(i*unitHeight)+4);
			
		}
	}
}
