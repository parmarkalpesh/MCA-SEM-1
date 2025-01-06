import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JSpinnerComp
{
	public static void main(String[] args) 
	{
		JSpinnerComp h = new JSpinnerComp();
	}

	public JSpinnerComp()
	{
		JFrame frame = new JFrame("Creating a JSpinner Component");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSpinner spinner = new JSpinner();
		frame.add(spinner,BorderLayout.NORTH);
		frame.setSize(100,100);
		frame.setVisible(true);
	}
}
