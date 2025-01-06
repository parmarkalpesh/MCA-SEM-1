import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
public class swingtree extends JFrame
{
	public static String title="Swing Tree";
	Container frameContainer;
	JScrollPane scrollPane=new JScrollPane();
	JTree tree;
	Renderer r=new Renderer();
	
	DefaultMutableTreeNode mn=new DefaultMutableTreeNode("Sample Tree Structure");
	

	DefaultMutableTreeNode stat=new DefaultMutableTreeNode("Stationary");

	DefaultMutableTreeNode sn1=new DefaultMutableTreeNode("Computer");
	DefaultMutableTreeNode n1=new DefaultMutableTreeNode("Flopy Disk");
	DefaultMutableTreeNode n2=new DefaultMutableTreeNode("Printer");
	DefaultMutableTreeNode n3=new DefaultMutableTreeNode("Compact Disk");
	DefaultMutableTreeNode n4=new DefaultMutableTreeNode("Computer Paper");
	DefaultMutableTreeNode n5=new DefaultMutableTreeNode("Scanner");

	DefaultMutableTreeNode sn2=new DefaultMutableTreeNode("Non-Computer");
	DefaultMutableTreeNode n6=new DefaultMutableTreeNode("Eraser");
	DefaultMutableTreeNode n7=new DefaultMutableTreeNode("Pencil");
	DefaultMutableTreeNode n8=new DefaultMutableTreeNode("Sharpner");
	DefaultMutableTreeNode n9=new DefaultMutableTreeNode("Scale");
	DefaultMutableTreeNode n10=new DefaultMutableTreeNode("Ballpen");

	DefaultMutableTreeNode food=new DefaultMutableTreeNode("Food");

	DefaultMutableTreeNode sn3=new DefaultMutableTreeNode("Vegetarian");
	DefaultMutableTreeNode n11=new DefaultMutableTreeNode("Bringle");
	DefaultMutableTreeNode n12=new DefaultMutableTreeNode("Tomato");
	DefaultMutableTreeNode n13=new DefaultMutableTreeNode("Pumpkin");
	DefaultMutableTreeNode n14=new DefaultMutableTreeNode("Turnip");
	DefaultMutableTreeNode n15=new DefaultMutableTreeNode("Raddish");

	DefaultMutableTreeNode sn4=new DefaultMutableTreeNode("Fruits");
	DefaultMutableTreeNode n16=new DefaultMutableTreeNode("Guava");
	DefaultMutableTreeNode n17=new DefaultMutableTreeNode("Mango");
	DefaultMutableTreeNode n18=new DefaultMutableTreeNode("Apple");
	DefaultMutableTreeNode n19=new DefaultMutableTreeNode("Banana");
	DefaultMutableTreeNode n20=new DefaultMutableTreeNode("Fig");

	JMenuBar mb=new JMenuBar();
	JMenu fm=new JMenu("File");
	JMenuItem exit=new JMenuItem("Exit");

	public swingtree()
	{
		super("Title");
		buildGUI();
		setupEventHandler();
		setSize(500,500);
		show();
	}
	void buildGUI()
	{
		fm.add(exit);
		mb.add(fm);
		setJMenuBar(mb);

		mn.add(stat);
		stat.add(sn1);
		stat.add(sn2);

		sn1.add(n1);
		sn1.add(n2);
		sn1.add(n3);
		sn1.add(n4);
		sn1.add(n5);

		sn2.add(n6);
		sn2.add(n7);
		sn2.add(n8);
		sn2.add(n9);
		sn2.add(n10);

		mn.add(food);
		food.add(sn3);
		food.add(sn4);

		sn3.add(n11);
		sn3.add(n12);
		sn3.add(n13);
		sn3.add(n14);
		sn3.add(n15);

		sn4.add(n16);
		sn4.add(n17);
		sn4.add(n18);
		sn4.add(n19);
		sn4.add(n20);

		tree=new JTree(mn);
		frameContainer=getContentPane();
		frameContainer.setLayout(new BorderLayout());
		tree.setCellRenderer(r);
		scrollPane.getViewport().add(tree);
		frameContainer.add("Center",scrollPane);
	}
	void setupEventHandler()
	{
		addWindowListener(new windowHandler());
		exit.addActionListener(new menuItemHandler());
	}
	public static void main(String args[])
	{
		swingtree abc=new swingtree();
	}
	public class windowHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	public class menuItemHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			String str=ae.getActionCommand();
			if(str.equals("Exit"))
			{
				System.exit(0);
			}
		}
	}
	class Renderer extends JLabel implements TreeCellRenderer
	{
		public Component getTreeCellRendererComponent(JTree tree,Object value,boolean selected,boolean expanded,boolean leaf,int row,boolean hasFocus)
		{
			setText(value.toString()+"                      ");
			return this;
		}
	}
}