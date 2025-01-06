import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.Date;
import java.text.*;

class MyNotePad extends JFrame implements ActionListener
{
	JMenuBar mbar;
	JMenu fileJMenu,editJMenu;
	JMenuItem newitem,openitem,saveitem,exititem;
	JMenuItem cutitem,copyitem,pasteitem;
	JTextArea ta;
	JToolBar tlb;
	JButton b1,b2,b3,b4,b5,b6;
	JPanel p1;
	JTextField t1;
	MyNotePad()
	{	
		super("untitled");

		ta = new JTextArea();

		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);
		
		mbar = new JMenuBar();
		setJMenuBar(mbar);

		fileJMenu = new JMenu("File");
		mbar.add(fileJMenu);
		editJMenu = new JMenu("Edit");
		mbar.add(editJMenu);

		newitem=new JMenuItem("New");
		openitem=new JMenuItem("Open");
		saveitem=new JMenuItem("Save");
		exititem=new JMenuItem("Exit");

		cutitem = new JMenuItem("Cut");
		copyitem = new JMenuItem("Copy");
		pasteitem = new JMenuItem("Paste");

		fileJMenu.add(newitem);
		fileJMenu.add(openitem);
		fileJMenu.add(saveitem);
		fileJMenu.add(exititem);

		editJMenu.add(cutitem);
		editJMenu.add(copyitem);
		editJMenu.add(pasteitem);

		ta.setFont(new Font("Times New Roman",Font.BOLD,16));

		tlb = new JToolBar();
		b1 = new JButton(new ImageIcon("open.jpg"));
		b2 = new JButton(new ImageIcon("save.png"));
		b3 = new JButton(new ImageIcon("cut.jpg"));
		b4 = new JButton(new ImageIcon("copy.jpg"));
		b5 = new JButton(new ImageIcon("paste.jpg"));
		b6 = new JButton("Exit");
		tlb.add(b1);
		tlb.add(b2);
		tlb.add(b3);
		tlb.add(b4);
		tlb.add(b5);
		tlb.add(b6);
		add(tlb,BorderLayout.NORTH);

		p1 = new JPanel();
		p1.setLayout(new GridLayout());
		t1 = new JTextField();
		t1.setEnabled(false);
		t1.setDisabledTextColor(Color.BLACK);
		p1.add(t1);
		add(p1,BorderLayout.SOUTH);
		startClock();

		newitem.addActionListener(this);
		openitem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);
		cutitem.addActionListener(this);
		copyitem.addActionListener(this);
		pasteitem.addActionListener(this);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void startClock()
	{
		final SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		Thread t = new Thread()
		{
			public void run()
			{
				while(true)
				{
					t1.setText(sdf.format(new Date()));
					try{
					Thread.sleep(1000);
					}catch(InterruptedException e){}
				}
			}
		};
		t.start();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==cutitem || ae.getSource()==b3)
			ta.cut();
		if(ae.getSource()==copyitem || ae.getSource()==b4)
			ta.copy();
		if(ae.getSource()==pasteitem  || ae.getSource()==b5)
			ta.paste();
		if(ae.getSource()==exititem || ae.getSource()==b6)
		{
			int val=JOptionPane.showConfirmDialog(this,"Are You Sure??","Exit Msg",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(val==0)
				System.exit(0);			
		}
		if(ae.getSource()==openitem || ae.getSource()==b1)
			open();
		if(ae.getSource()==saveitem || ae.getSource()==b2)
			save();		
	}
	public void open()
	{	
		FileDialog fd = new FileDialog(this,"Open",FileDialog.LOAD);
		fd.setVisible(true);
		try{
		File f = new File(fd.getDirectory(),fd.getFile());
	
		setTitle(f.getName());
	
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str;
		ta.setText("");
		while((str = br.readLine())!=null)
			ta.append(str+"\n");
		}catch(Exception e){}
	}
	public void save()
	{	
		FileDialog fd = new FileDialog(this,"Save As",FileDialog.SAVE);
		fd.setVisible(true);
		try{
		File f = new File(fd.getDirectory(),fd.getFile());
		setTitle(f.getName());
	
		FileWriter fw = new FileWriter(f);
		fw.write(ta.getText());
		fw.close();
	
		}catch(Exception e){}
	}

}
class TestDemo
{
	public static void main(String []args)
	{
		MyNotePad m = new MyNotePad();
		m.setBounds(100,100,500,500);
		m.setVisible(true);
	}
}






