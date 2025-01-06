import java.applet.*;
import java.awt.*;
/*
<applet code="DimensionString" width=300 height=200>
</applet>
*/
public class DimensionString extends Applet
{
        public void paint(Graphics g)
        {
                String str="Welcome To Java In Center";

                Font f=new Font("Times New Roman",Font.BOLD,20);
                g.setFont(f);

                FontMetrics FM=g.getFontMetrics(f);

                Dimension d=getSize();
                int x=(d.width/2)-FM.stringWidth(str)/2;
                int y=(d.height/2)+FM.getDescent();

                g.drawString(str,x,y);
        }
}
