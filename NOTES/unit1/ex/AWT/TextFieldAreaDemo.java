import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="TextFieldAreaDemo" width=400 height=200>
</applet>
*/
public class TextFieldAreaDemo extends Applet implements ActionListener,TextListener
{
	TextArea TA;
	TextField TF;
	
	public void init()
	{
		TF=new TextField(20);
		TF.addActionListener(this);
		TF.addTextListener(this);
		add(TF);		
		TA=new TextArea(10,20);
		add(TA);
	}
	public void actionPerformed(ActionEvent ae)
	{
		TA.append("ActionEvent "+ ae.getActionCommand()+"\n");
		TF.setText("");
	}
	public void textValueChanged (TextEvent te)
	{
		TA.append("TextEvent "+TF.getText()+"\n");
	}
}