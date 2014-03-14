import javax.swing.JFrame;

public class LayoutTest 
{
	public static void main(String args [])
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayoutPanel panel = new FlowLayoutPanel();
		//BorderLayoutPanel panel = new BorderLayoutPanel();
		//GridLayoutPanel panel = new GridLayoutPanel();
		//BigGridLayoutPanel panel = new BigGridLayoutPanel();
		frame.add(panel);
	}
}
