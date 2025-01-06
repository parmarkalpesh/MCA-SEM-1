import java.awt.*;

class Test extends Frame
{
       Label lbl;
       Button b1;
       TextField t1,t2;
       TextArea ta;
       List l1,l2;
       Choice c1; // Combobox
       Checkbox cb1,cb2,cb3,cb4,cb5;
       CheckboxGroup cbg;
       MenuBar mbar;
       Menu filemenu,editmenu;
       MenuItem mi1,mi2,mi3;
       Test()
       {
               super("Component Demo");
               setFont(new Font("Times New Roman",Font.BOLD,20));
               setLayout(new FlowLayout(FlowLayout.LEFT));
               lbl = new Label("This is called Label");
               b1  = new Button("Click Me");
               t1 = new TextField(10);
               t2 = new TextField(10);
               t2.setEchoChar('*');
               ta = new TextArea();
               l1 = new List(4,true);
               l1.add("Oracle");
               l1.add("Java");
               l1.add("DC-1");
               l1.add("C");
               l1.add("C++");

               l2 = new List();
               l2.add("MCA");
               l2.add("MBA");
               l2.add("Msc(IT)");
               l2.add("Other");
               
               c1 = new Choice();
               c1.add("Rajkot");
               c1.add("Baroda");
               c1.add("Ahmedabad");
               c1.add("Surat");

               cb1 = new Checkbox("TV");
               cb2 = new Checkbox("Freez");
               cb3 = new Checkbox("Car");

               cbg = new CheckboxGroup();
               cb4 = new Checkbox("Male",cbg,true);
               cb5 = new Checkbox("Female",cbg,false);

               mbar = new MenuBar();
               setMenuBar(mbar);
               filemenu = new Menu("File");
               mi1 = new MenuItem("New");
               filemenu.add(mi1);
               mi2 = new MenuItem("Exit");
               filemenu.add(mi2);

               editmenu = new Menu("Edit");
               mi3 = new MenuItem("Cut");
               editmenu.add(mi3);
               mbar.add(filemenu);
               mbar.add(editmenu);

               add(lbl);
               add(b1);
               add(t1);
               add(t2);
               add(ta);
               add(l1);
               add(l2);
               add(c1);
               add(cb1);
               add(cb2);
               add(cb3);
               add(cb4);
               add(cb5);

       }
}
class TestDemo
{
       public static void main(String []args)
       {
               Test t = new Test();
               t.setBounds(100,100,700,500);
               t.setVisible(true);
       }
}