
import javax.swing.JFrame;

public class CartesianTest 
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyCartesianPanel panel = new MyCartesianPanel();
		frame.add(panel);
	}
}
