import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.*;

import javax.swing.JPanel;

public class MyListenersPanel extends JPanel
{	
	private int x, y, i;
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		x = (getWidth()/2)-25;
		y = (getHeight()/2)-25;
		i = 0;
		
		int[][] Colors = {{138, 43, 226}, {200, 0, 0}, {0, 200, 0}, {0, 0, 200}, {200, 200, 0}}; 
		
		int R = Colors[i][0];
		int G = Colors[i][1];
		int B = Colors[i][2];
		
		Color BoxColor = new Color(R, G, B);
		
		g.setColor(BoxColor);
		
		//Draws Box
		g.drawRect(x, y, 50, 50);
		g.fillRect(x, y, 50, 50);
	}
	
	public MyListenersPanel()
	{
		MyListener list = new MyListener();
		addKeyListener(list);
	}
	
	private class MyListener implements KeyListener
	{
		
		public void keyPressed(KeyEvent e)
		{			
			int keyPressed = e.getKeyCode();
			
			if (KeyEvent.VK_LEFT == keyPressed)
				x = x - 10;
			else if (KeyEvent.VK_RIGHT == keyPressed)
				x = x + 10;
			else if (KeyEvent.VK_DOWN == keyPressed)
				y = y - 10;
			else if (KeyEvent.VK_DOWN == keyPressed)
				y = y + 10;
			else if (KeyEvent.VK_ENTER == keyPressed)
			{
				if (i == 4)
					i = 0;
				else
					i++;	
			}
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
}

