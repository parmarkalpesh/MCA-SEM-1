import java.applet.*;
import java.awt.*;
/*
<applet code="DimensionCircle" width=200 height=200>
</applet>
*/
public class DimensionCircle extends Applet
{
        public void paint(Graphics g)
        {
                Dimension d=getSize();
                int xc=d.width/2;
                int yc=d.height/2;
                int r=(int)((d.width<d.height)?0.4*d.width:0.4*d.height);
                g.drawOval(xc-r,yc-r,2*r,2*r);
        }
}
