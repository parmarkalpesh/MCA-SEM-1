import java.applet.*;
import java.awt.*;
/*
<applet code="ColorVertBars" width=260 height=260>
</applet>
*/
public class ColorVertBars extends Applet
{
        Color c[]={Color.black,
                   Color.blue,
                   Color.cyan,
                   Color.darkGray,
                   Color.gray,
                   Color.green,
                   Color.lightGray,
                   Color.magenta,
                   Color.orange,
                   Color.pink,
                   Color.red,
                   Color.white,
                   Color.yellow};

        public void paint(Graphics g)
        {
                int d=260/c.length;
                for(int i=0;i<c.length;i++)
                {
                        g.setColor(c[i]);
                        g.fillRect(i*d,0,(i+1)*d,260);
                }
        }
}
