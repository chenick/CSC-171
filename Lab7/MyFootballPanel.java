import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JPanel;

public class MyFootballPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		int fieldheight = 320;
		int fieldwidth = 720;
		
		int x0 = 50;
		int y0 = 50;
		
		int k = 0;
		
		//Outside of Field
		g.setColor(Color.WHITE);
		g.drawRect(x0,y0, fieldwidth, fieldheight);
		g.drawRect(x0-1, y0-1, fieldwidth+2, fieldheight+2);
		g.setColor(Color.GREEN);
		g.fillRect(x0, y0, fieldwidth, fieldheight);
		
		//Endzones
		g.setColor(Color.WHITE);
		//Left Endzone
		g.drawRect(x0, y0, fieldwidth/12, fieldheight);
		g.drawRect(x0-1, y0-1, (fieldwidth/12)+2, fieldheight+2);
		//Right Endzone
		g.drawRect((x0+fieldwidth)-(fieldwidth/12), y0, fieldwidth/12, fieldheight);
		g.drawRect(((x0+fieldwidth)-(fieldwidth/12))-1, y0-1, (fieldwidth/12)+2, fieldheight+2);
		
		//Yard Markers
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*1)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*1)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*2)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*2)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*3)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*3)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*4)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*4)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*5)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*5)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*6)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*6)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*7)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*7)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*8)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*8)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*9)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*9)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*10)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*10)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*11)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*11)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*12)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*12)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*13)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*13)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*14)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*14)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*15)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*15)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*16)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*16)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*17)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*17)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*18)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*18)/24), y0+fieldheight);
		g.drawLine((x0+(fieldwidth/12))+((fieldwidth*19)/24), y0, (x0+(fieldwidth/12))+((fieldwidth*19)/24), y0+fieldheight);
		
		//Draw Yardage
		g.setFont(new Font("Stencil", Font.PLAIN, 33));
		g.drawString("10", 150, 335);
		g.drawString("20", 210, 335);
		g.drawString("30", 270, 335);
		g.drawString("40", 330, 335);
		g.drawString("50", 390, 335);
		g.drawString("40", 450, 335);
		g.drawString("30", 510, 335);
		g.drawString("20", 570, 335);
		g.drawString("10", 630, 335);
		
		g.setFont(new Font("Stencil", Font.PLAIN, -33));
		g.drawString("10", 190, 90);
		g.drawString("20", 250, 90);
		g.drawString("30", 310, 90);
		g.drawString("40", 370, 90);
		g.drawString("50", 430, 90);
		g.drawString("40", 490, 90);
		g.drawString("30", 550, 90);
		g.drawString("20", 610, 90);
		g.drawString("10", 670, 90);
		
		//Draw Center Logo
		g.setColor(Color.WHITE);
		g.drawOval((x0+(fieldwidth/12))+((fieldwidth*10)/24)-60, 180, 120, 60);
		g.setColor(Color.GREEN);
		g.fillOval((x0+(fieldwidth/12))+((fieldwidth*10)/24)-60, 180, 120, 60);
		g.setColor(Color.WHITE);
		g.drawOval((x0+(fieldwidth/12))+((fieldwidth*10)/24)-60, 180, 120, 60);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Stencil", Font.ITALIC, 28));
		g.drawString("J E T S", 366, 219);
	}
}

