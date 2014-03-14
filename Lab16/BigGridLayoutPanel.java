import javax.swing.*;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
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
import javax.swing.JFrame;

public class BigGridLayoutPanel extends JPanel
{
	private JButton JButton1;
	private JButton JButton2;
	private JButton JButton3;
	private JButton JButton4;
	private JButton JButton5;
	
	private JPanel FlowLayoutPanel;
	private JPanel GridLayoutPanel;
	private JPanel BorderLayoutPanel;
	
	public BigGridLayoutPanel()
	{
		
		setLayout(new GridLayout(2, 2));
        
		JPanel Flow = new JPanel();
		Flow.setLayout(new FlowLayout());
		Flow.add(new JButton("Button 1"));
		Flow.add(new JButton("Button 2"));
		Flow.add(new JButton("Button 3"));
		Flow.add(new JButton("Button 4"));
        add(Flow);
        
        JPanel Grid = new JPanel();
        Grid.setLayout(new GridLayout(3, 2));
        Grid.add(new JButton("Button 1"));
        Grid.add(new JButton("Button 2"));
        Grid.add(new JButton("Button 3"));
        Grid.add(new JButton("Button 4"));
        Grid.add(new JButton("Button 5"));
        add(Grid);
        
        JPanel Border = new JPanel();
        Border.setLayout(new BorderLayout());
        Border.add(JButton1, BorderLayout.NORTH);
        Border.add(JButton2, BorderLayout.WEST);
        Border.add(JButton3, BorderLayout.CENTER);
        Border.add(JButton4, BorderLayout.EAST);
        Border.add(JButton5, BorderLayout.SOUTH);
        add(Border);
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(BigGridLayoutPanel.this,  String.format("You pressed %s", event.getActionCommand()));
		}
	}
	
}
