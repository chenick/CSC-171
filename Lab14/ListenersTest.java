
import javax.swing.JFrame;

public class ListenersTest 
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Move Box");
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyListenersPanel panel = new MyListenersPanel();
		frame.add(panel);
	}
}
