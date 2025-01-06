import javax.swing.*;
import java.awt.*;

public class JTableComponent
{
	public static void main(String[] args) 
	{
		new JTableComponent();
	}

	public JTableComponent()
	{
		JFrame frame = new JFrame("Creating JTable Component Example!");
		JPanel panel = new JPanel();
		String data[][] = {{"vinod","BCA","A"},{"Raju","MCA","b"},{"Ranjan","MBA","c"},{"Rinku","BCA","d"}};
		String col[] = {"Name","Course","Grade"};
		JTable table = new JTable(data,col);
		panel.add(table,BorderLayout.CENTER);
		frame.add(panel);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}