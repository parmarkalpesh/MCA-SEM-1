import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MenuDemo extends JFrame implements ActionListener,MenuListener
{
	public JPopupMenu popup;
	public JMenuItem saveitem;
	public JMenuItem saveasitem;
	public JCheckBoxMenuItem readonlyitem;
	public MenuDemo()
	{
		setTitle("Menu");
		setSize(400,300);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		JMenuBar mb=new JMenuBar();
		setJMenuBar(mb);
		
		JMenu fm=new JMenu("File");
		fm.addMenuListener(this);

		JMenuItem openitem=new JMenuItem("Open");
		saveitem=new JMenuItem("Save");
		saveasitem=new JMenuItem("Save As");
		mb.add(makeMenu(fm,new Object[] {"New",openitem,null,saveitem,saveasitem,null,"Exit"},this));

		readonlyitem=new JCheckBoxMenuItem("Read Only");
		ButtonGroup bg=new ButtonGroup();
		JRadioButtonMenuItem insertitem=new JRadioButtonMenuItem("Insert");
		JRadioButtonMenuItem overtypeitem=new JRadioButtonMenuItem("Over Type");
		insertitem.setSelected(true);
		bg.add(insertitem);
		bg.add(overtypeitem);
		mb.add(makeMenu("Edit",new Object[] {new JMenuItem("cut",new ImageIcon("cut.png")), new JMenuItem("copy",new ImageIcon("copy.png")), new JMenuItem("paste",new ImageIcon("paste.png")), null, makeMenu("Options",new Object[] {readonlyitem,null,insertitem,overtypeitem},this)},this));

		JMenu helpmenu=new JMenu("Help");
		helpmenu.setMnemonic('h');
		mb.add(makeMenu(helpmenu,new Object[] {new JMenuItem("Index",'I'),new JMenuItem("About",'A')},this));

		popup=makePopupMenu(new Object[]{"Cut","Copy","Paste"},this);

		getContentPane().addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent me)
			{
				if(me.isPopupTrigger())
				{
					popup.show(me.getComponent(),me.getX(),me.getY());
				}
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String arg=ae.getActionCommand();
		System.out.println(arg);
		if(arg.equals("Exit"))
		{
			System.exit(0);
		}
	}
	public void menuSelected(MenuEvent met)
	{
		saveitem.setEnabled(!readonlyitem.isSelected());
		saveasitem.setEnabled(!readonlyitem.isSelected());
	}
	public void menuDeselected(MenuEvent met)
	{}
	public void menuCanceled(MenuEvent met)
	{}
	public static JMenu makeMenu(Object parent,Object[] items,Object target)
	{
		JMenu m=null;
		if(parent instanceof JMenu)
			m=(JMenu)parent;
		else if(parent instanceof String)
			m=new JMenu((String)parent);
		else
			return null;
		for(int i=0;i<items.length;i++)
		{
			if(items[i]==null)
				m.addSeparator();
			else
				m.add(makeMenuItem(items[i],target));
		}
		return m;
	}
	public static JMenuItem makeMenuItem(Object item,Object target)
	{
		JMenuItem r=null;
		if(item instanceof String)
		{
			r=new JMenuItem((String)item);
		}
		else if(item instanceof JMenuItem)
		{
			r=(JMenuItem)item;
		}
		else
		{
			return null;
		}
		if(target instanceof ActionListener)
		{
			r.addActionListener((ActionListener)target);
		}
		return r;
	}
	public JPopupMenu makePopupMenu(Object[] items,Object target)
	{
		JPopupMenu pm=new JPopupMenu();
		for(int i=0;i<items.length;i++)
		{
			if(items[i]==null)
			{
				pm.addSeparator();
			}
			else
			{
				pm.add(makeMenuItem(items[i],target));
			}
		}
		return pm;
	}
	public static void main(String args[])
	{
		Frame f=new MenuDemo();
		f.show();
	}
}