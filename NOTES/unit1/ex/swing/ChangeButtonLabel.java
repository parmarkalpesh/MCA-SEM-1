import javax.swing.*;
import java.awt.event.*;

public class ChangeButtonLabel
{
	JButton button;
	public static void main(String[] args)
	{
		ChangeButtonLabel cl = new ChangeButtonLabel();
	}

	public ChangeButtonLabel()
	{
		JFrame frame = new JFrame("Change JButton Lebel");
		button = new JButton("Click Me");
		button.addActionListener(new MyAction());
		frame.add(button);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class MyAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String text = (String)e.getActionCommand();
			if (text.equals("Click Me"))
			{
				button.setText("MEFGI");
			}
			else
			{
				button.setText("Click Me");
			}
		}
	}
}