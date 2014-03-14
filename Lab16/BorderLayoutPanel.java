import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BorderLayoutPanel extends JPanel
{
	private JButton JButton1;
	private JButton JButton2;
	private JButton JButton3;
	private JButton JButton4;
	private JButton JButton5;
	
	public BorderLayoutPanel()
	{
		setLayout(new BorderLayout());
		
		JButton1 = new JButton("Button 1");
		JButton2 = new JButton("Button 2");
		JButton3 = new JButton("Button 3");
		JButton4 = new JButton("Button 4");
		JButton5 = new JButton("Button 5");
		add(JButton1, BorderLayout.NORTH);
		add(JButton2, BorderLayout.WEST);
		add(JButton3, BorderLayout.CENTER);
		add(JButton4, BorderLayout.EAST);
		add(JButton5, BorderLayout.SOUTH);
		
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
			JOptionPane.showMessageDialog(BorderLayoutPanel.this,  String.format("You pressed %s", event.getActionCommand()));
		}
	}
	
}
