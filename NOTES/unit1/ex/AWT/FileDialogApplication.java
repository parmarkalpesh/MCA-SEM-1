import java.awt.*;
import java.awt.event.*;
public class FileDialogApplication extends Frame implements ActionListener,WindowListener
{
	Button load,save;
	TextField tf;
	public static void main(String args[])
	{
		FileDialogApplication fda=new FileDialogApplication();
		fda.setVisible(true);
		fda.setSize(400,100);
	}
	FileDialogApplication()
	{
		super("Dialog Application");
		setLayout(new FlowLayout());
		load=new Button("Load");
		load.addActionListener(this);
		add(load);
		save=new Button("Save");
		save.addActionListener(this);
		add(save);
		tf=new TextField(20);
		add(tf);
		addWindowListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		FileDialog FD;
		if(ae.getSource()==load)
		{
			FD=new FileDialog(this,"Load File",FileDialog.LOAD);
		}
		else
		{
			FD=new FileDialog(this,"Save File",FileDialog.SAVE);
		}
		FD.show();
		String fnm=FD.getDirectory()+FD.getFile();
		if(fnm!=null)
		{
			tf.setText(fnm);
		}
	}
	public void windowActivated(WindowEvent we)
	{}
	public void windowDeactivated(WindowEvent we)
	{}
	public void windowIconified(WindowEvent we)
	{}
	public void windowDeiconified(WindowEvent we)
	{}
	public void windowClosed(WindowEvent we)
	{}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowOpened(WindowEvent we)
	{}
}