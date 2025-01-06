//Abstract Window Toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;
import javax.swing.JTextArea;
import javax.swing.event.*;

import javax.swing.text.*;


class Test extends JFrame implements ActionListener,TextListener
{
	
	JTextField t1;
	JLabel l1;
	
	Test()
	{

	super("My Frame");
	setFont(new Font("Arial",Font.BOLD,30));
	setLayout(null);


	t1=new JTextField();
	t1.setBounds(50,50,250,70);
	add(t1);

	l1=new JLabel();
	l1.setBounds(310,50,70,70);
	add(l1);
	//t1.addTextListener(this);


	DocumentListener documentListener = new DocumentListener() 
	{

      	public void changedUpdate(DocumentEvent documentEvent) 
		{
        	printIt(documentEvent);
     	 	}

      	public void insertUpdate(DocumentEvent documentEvent) 
		{
      	  	printIt(documentEvent);
      		}

      	public void removeUpdate(DocumentEvent documentEvent) 
		{
       	 	printIt(documentEvent);
     	 	}

      	private void printIt(DocumentEvent documentEvent) 
		{
        		Document source = documentEvent.getDocument();
			DocumentEvent.EventType type = documentEvent.getType();
			System.out.println(type);		
			Pattern p=Pattern.compile("[a-zA-Z0-9]{6}[a-zA-Z0-9]*@[a-zA-Z0-9]+[.][a-zA-Z]+");
			Matcher m=p.matcher(t1.getText());
			if(m.matches())
			{
				l1.setBackground(Color.GREEN);
				l1.setIcon(new ImageIcon("correct.png"));
			}
			else
			{
				l1.setBackground(Color.RED);
				l1.setIcon(new ImageIcon("incorrect.jpg"));
			}
		}	
      		
    };

	
    	t1.getDocument().addDocumentListener(documentListener);
			
	addWindowListener(new WindowAdapter() 
		{
      		public void windowClosing(WindowEvent e) 
		{
        		System.exit(0);
      		}
		});
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	
	}

	public void textValueChanged(TextEvent te)
	{
		
	}
	
}

public class TestDemo
{
public static void main(String s[])
	{
	Test t=new Test();
	t.setBounds(100,100,400,400);
	t.setVisible(true);
	}
}
