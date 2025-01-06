import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="drawPolygonApplet" height=200 width=200>
</applet>
*/
public class drawPolygonApplet extends Applet
{
        public void paint(Graphics g)
        {
                int n=5;
                int x[]=new int[n];
                int y[]=new int[n];

                x[0]=10;y[0]=100;
                x[1]=60;y[1]=10;
                x[2]=70;y[2]=140;
                x[3]=140;y[3]=90;
                x[4]=190;y[4]=10;
                g.drawPolyline(x,y,n);
//                g.drawPolygon(x,y,n);
        }                
}
