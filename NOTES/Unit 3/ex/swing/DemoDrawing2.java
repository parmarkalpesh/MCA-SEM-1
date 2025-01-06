import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

///////////////////////////////////////////////////// DemoDrawing2
public class DemoDrawing2 extends JFrame {
    //============================================ field variables
    DrawingArea left = new DrawingArea();
    DrawingArea rite = new DrawingArea();
    int flip = 0;

    //================================================ Constructor
    DemoDrawing2() {
        left.setBackground(Color.white);
        rite.setBackground(Color.black);

        JButton b = new JButton("Press Me");
        b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // When button is pressed, change colors
                    if (flip == 1) {
                         left.setMyColor(Color.red);
                         rite.setMyColor(Color.blue);
                         flip = 0;
                    }else{
                        left.setMyColor(Color.blue);
                        rite.setMyColor(Color.red);
                        flip = 1;
                    }
                }
            });

        // Add components to layout
        Container content = this.getContentPane();
        content.setLayout(new FlowLayout());
        content.add(b   );
        content.add(left);
        content.add(rite);

        this.setTitle("Demo Drawing");
        this.pack();
    }//end constructor

    //========================================================= main
    public static void main(String[] args) {
        JFrame windo = new DemoDrawing2();
        windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windo.setVisible(true);
    }
} //endclass


///////////////////////////////////////////////////////// DrawingArea
class DrawingArea extends JPanel {
    //======================================== fields
    Color drawColor;
    
    public DrawingArea() {
        drawColor = Color.green;
        setPreferredSize(new Dimension(100,100));
    }//end constructor

    //================================================ paintComponent
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(drawColor);
        int w = getWidth();
        int h = getHeight();
        g.drawLine(0, 0, w, h); // upper left to lower right.
        g.drawLine(0, h, w, 0); // lower left to upper right.
    }

    //==================================================== setMyColor
    public void setMyColor(Color x) {
        drawColor = x;
        repaint();  // color changed, must repaint
    }
} // endclass