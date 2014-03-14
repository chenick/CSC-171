import javax.swing.*;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GridLayoutPanel extends JPanel
{
	private JButton JButton1;
	private JButton JButton2;
	private JButton JButton3;
	private JButton JButton4;
	private JButton JButton5;
	
	public GridLayoutPanel()
	{
		setLayout(new GridLayout(3, 2));
		
		JButton1 = new JButton("Button 1");
		JButton2 = new JButton("Button 2");
		JButton3 = new JButton("Button 3");
		JButton4 = new JButton("Button 4");
		JButton5 = new JButton("Button 5");
		add(JButton1);
		add(JButton2);
		add(JButton3);
		add(JButton4);
		add(JButton5);
		
		ButtonHandler handler = new ButtonHandler();
		JButton1.addActionListener(handler);
		JButton2.addActionListener(handler);
		JButton3.addActionListener(handler);
		JButton4.addActionListener(handler);
		JButton5.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(GridLayoutPanel.this,  String.format("You pressed %s", event.getActionCommand()));
		}
	}
	
}
