import java.awt.*;

class AddDataFrame extends Frame
{	
	Button b1,b2,b3,b4;
	MyCustomListener mcl = new MyCustomListener(this);
	Label l[] = new Label[5];
	TextField t[] = new TextField[5];
	String str[] = {"Rollno","Name","Mobile","City","Per"};
	AddDataFrame()
	{
		super("Add Data");
		setLayout(null);
		b1 = new Button("Exit");
		add(b1);
		int y=50;
		for(int i=0;i<l.length;i++)
		{
			l[i]=new Label(str[i]);
			add(l[i]);
			l[i].setBounds(50,y,100,30);
			t[i]=new TextField();
			t[i].setBounds(170,y,100,30);
			add(t[i]);
			y+=50;
		}

		b2 = new Button("Add");
		add(b2);

		b3 = new Button("Search");
		add(b3);

		b4 = new Button("Delete");
		add(b4);

		b1.setBounds(30,300,70,30);
		b2.setBounds(110,300,70,30);
		b3.setBounds(190,300,70,30);
		b4.setBounds(270,300,70,30);
		b1.addActionListener(mcl);
		b2.addActionListener(mcl);
		b3.addActionListener(mcl);
		b4.addActionListener(mcl);
	}
	public static void main(String []args)
	{
		AddDataFrame a = new AddDataFrame();
		a.setBounds(200,100,400,400);
		a.setVisible(true);
	}
}