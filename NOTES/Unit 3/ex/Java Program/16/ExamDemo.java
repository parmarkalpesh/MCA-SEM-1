import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Frame implements ActionListener
{
	public static String filenm="";
	Button b1,b2,b3,b4,b5,b6;
	TextField t1,t2,t3,t4;
	Label lbl1,lbl2,lbl3,lbl4;
	int cnt=0,max=0;
	
	Test()
	{
		super("Student Management System");
		setFont(new Font("Arial",Font.BOLD,20));
		setLayout(null);

		lbl1 = new Label("Roll No ");
		lbl1.setBounds(50,50,200,30);
		add(lbl1);

		t1 = new TextField();
		t1.setBounds(260,50,200,30);
		add(t1);

		lbl2 = new Label("Name ");
		lbl2.setBounds(50,100,200,30);
		add(lbl2);		

		t2 = new TextField();
		t2.setBounds(260,100,200,30);
		add(t2);
		
		lbl3 = new Label("Age ");
		lbl3.setBounds(50,150,200,30);
		add(lbl3);		

		t3 = new TextField();
		t3.setBounds(260,150,200,30);
		add(t3);


		lbl4 = new Label("Percentage ");
		lbl4.setBounds(50,200,200,30);
		add(lbl4);		

		t4 = new TextField();
		t4.setBounds(260,200,200,30);
		add(t4);

		b1 = new Button("Insert");
		b1.setBounds(50,250,200,30);
		add(b1);

		b2 = new Button("Clear");
		b2.setBounds(260,250,200,30);
		add(b2);

		b3 = new Button("First");
		b3.setBounds(50,300,60,30);
		add(b3);

		b4 = new Button("Next");
		b4.setBounds(120,300,60,30);
		add(b4);

		b5 = new Button("Prev");
		b5.setBounds(190,300,60,30);
		add(b5);

		b6 = new Button("Last");
		b6.setBounds(260,300,60,30);
		add(b6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

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
	try
	{
		DataOutputStream d1;
		DataInputStream d2;
		
		d2 = new DataInputStream(new FileInputStream(Test.filenm));
		max=TestDemo.countRecord(d2);
		d2 = new DataInputStream(new FileInputStream(Test.filenm));
		Student s1[]=new Student[max];
		s1=TestDemo.readAllFromFile(d2,max);

		Student s;
		if(ae.getSource()==b1)
			{
			s = new Student(Integer.parseInt(t1.getText()),
						t2.getText(),
						Integer.parseInt(t3.getText()),
						Float.parseFloat(t4.getText())
						);
			
			d1 = new DataOutputStream(new FileOutputStream(Test.filenm,true));
			TestDemo.writeToFile(d1,s);
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			}
		if(ae.getSource()==b2)
			{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			}
		if(ae.getSource()==b3)
			{
			cnt=0;
			if(max>cnt)
			{
			t1.setText(String.valueOf(s1[cnt].getRollno()));
			t2.setText(s1[cnt].getName());
			t3.setText(String.valueOf(s1[cnt].getAge()));
			t4.setText(String.valueOf(s1[cnt].getPer()));
			}
			else
			{
			JOptionPane.showMessageDialog(this,"There are no records in File","SMS",JOptionPane.INFORMATION_MESSAGE);
			}
			}
		if(ae.getSource()==b4)
			{
			if(cnt==max-1)
			{
			JOptionPane.showMessageDialog(this,"You Reached End of File","SMS",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
			cnt++;
			t1.setText(String.valueOf(s1[cnt].getRollno()));
			t2.setText(s1[cnt].getName());
			t3.setText(String.valueOf(s1[cnt].getAge()));
			t4.setText(String.valueOf(s1[cnt].getPer()));
			}
			}
		if(ae.getSource()==b5)
			{
			if(cnt==0)
			{
			JOptionPane.showMessageDialog(this,"You Reached Begining of File","SMS",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
			cnt--;
			t1.setText(String.valueOf(s1[cnt].getRollno()));
			t2.setText(s1[cnt].getName());
			t3.setText(String.valueOf(s1[cnt].getAge()));
			t4.setText(String.valueOf(s1[cnt].getPer()));
			}
			}
		if(ae.getSource()==b6)
			{
			cnt=max-1;
			if(cnt>=0)
			{
			t1.setText(String.valueOf(s1[cnt].getRollno()));
			t2.setText(s1[cnt].getName());
			t3.setText(String.valueOf(s1[cnt].getAge()));
			t4.setText(String.valueOf(s1[cnt].getPer()));
			}
			else
			{
			JOptionPane.showMessageDialog(this,"There are no records in File","SMS",JOptionPane.INFORMATION_MESSAGE);
			}
			}

	}
	catch(Exception e){}
	}
}

class Student
{
int rollno;
String name;
int age;
float per;

//Constructor -------------------------------------------
Student()
{

}

Student(int r,String s,int a,float f)
	{
	this.rollno = r;
	this.name = s;
	this.age = a;
	this.per = f;
	}

Student(String s)
	{
	String s1[]=s.split(",");
	for(int i=0;i<s1.length;i++)
		{
			switch(i)
			{
			case 0:
				this.rollno=Integer.parseInt(s1[i]);
				break;
			case 1:
				this.name=s1[i];
				break;
			case 2:
				this.age=Integer.parseInt(s1[i]);
				break;
			case 3:
				this.per=Float.parseFloat(s1[i]);
				break;
			}
		}
	}

//GET Methods--------------------------------------
int getRollno()
	{
	return this.rollno;
	}

String getName()
	{
	return this.name;
	}

int getAge()
	{
	return this.age;
	}

float getPer()
	{
	return this.per;
	}


//toString() - OBJECT - STRING -------------------------
public String toString()
	{
	return this.rollno+","+this.name+","+this.age+","+this.per;
	}


}

class TestDemo
{
//For Single Object -----------------------------------------------
static void writeToFile(DataOutputStream dos, Student s) throws Exception
	{
	dos.writeBytes(s.toString()+"\n");
	dos.flush();
	dos.close();
	}

static Student readFromFile(DataInputStream dis) throws Exception
	{
	String str = dis.readLine();
	dis.close();
	return new Student(str);
	}

static int countRecord(DataInputStream dis) throws Exception
	{
	int i=0;
	while(dis.readLine()!=null)
		{
		i++;
		}
	return i;
	}

static Student[] readAllFromFile(DataInputStream dis,int max) throws Exception
	{
	Student s[] = new Student[max];
	int i=0;
	String str;
	while((str=dis.readLine())!=null)
		{
		s[i++]=new Student(str);
		}
	dis.close();
	return s;
	}

//------ MAIN Program --------------------------------------
public static void main(String args[]) throws Exception
	{
	Test t=new Test();
	Test.filenm = args[0];
	t.setBounds(100,100,500,550);
	t.setVisible(true);	
	}

}