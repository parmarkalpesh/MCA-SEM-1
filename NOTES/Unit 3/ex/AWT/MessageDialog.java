import java.awt.*;
import java.awt.event.*;
public class MessageDialog extends Frame implements ActionListener
{
	Button b;
	public static void main(String args[])
	{
		MessageDialog md=new MessageDialog();
		md.setVisible(true);
		md.setSize(200,100);
	}
	MessageDialog()
	{
		super("Message Dialog Demo");
		setLayout(new FlowLayout());
		b=new Button("Click me");
		b.addActionListener(this);
		add(b);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String message="This is the message";
		messageDialogExample mde=new messageDialogExample(this,"Message Dialog",true,message);
		mde.show();
	}
}
class messageDialogExample extends Dialog implements ActionListener
{
	Button ok;
	messageDialogExample(Frame parent,String title,boolean mode,String msg)
	{
		super(parent,title,mode);
		Panel pc=new Panel();
		Label l=new Label(msg);
		pc.add(l);
		add(pc,"Center");

		Panel ps=new Panel();
		ok=new Button("ok");
		ok.addActionListener(this);
		ps.add(ok);
		add(ps,"South");
		
		pack();
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
	}
	public Insets getInsets()
	{
		return new Insets(40,40,40,40);
	}
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}
}