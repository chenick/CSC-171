
import javax.swing.JFrame;

public class Test 
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(820, 450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyFootballPanel panel = new MyFootballPanel();
		frame.add(panel);
	}
}
