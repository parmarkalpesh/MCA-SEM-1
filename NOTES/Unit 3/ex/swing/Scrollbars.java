import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Scrollbars extends JFrame implements AdjustmentListener
{
	private JLabel rlab;
	private JLabel glab;
	private JLabel blab;
	private JScrollBar redbar;
	private JScrollBar greenbar;
	private JScrollBar bluebar;
	private JPanel colorpanel;
	
	public Scrollbars()
	{
		setTitle("Color Select");
		setSize(300,200);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		Container cp=getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2));
		
		p.add(rlab=new JLabel("Red 0"));
		p.add(redbar=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255));
		redbar.setBlockIncrement(16);
		redbar.addAdjustmentListener(this);

		p.add(glab=new JLabel("Green 0"));
		p.add(greenbar=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255));
		greenbar.setBlockIncrement(16);
		greenbar.addAdjustmentListener(this);

		p.add(blab=new JLabel("Blue 0"));
		p.add(bluebar=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255));
		bluebar.setBlockIncrement(16);
		bluebar.addAdjustmentListener(this);

		cp.add(p,"South");

		colorpanel=new JPanel();
		colorpanel.setBackground(new Color(0,0,0));
		cp.add(colorpanel,"Center");
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		rlab.setText("Red "+redbar.getValue());
		glab.setText("Green "+greenbar.getValue());
		blab.setText("Blue "+bluebar.getValue());

		colorpanel.setBackground(new Color(redbar.getValue(),greenbar.getValue(),bluebar.getValue()));
		colorpanel.repaint();
	}
	public static void main(String args[])
	{
		Frame f=new Scrollbars();
		f.show();
	}
}