import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="lifeCycleApplet" width=200 height=50>
</applet>
*/
public class lifeCycleApplet extends Applet
{
        String str="";
        public void init()
        {
                str=str+"init ";
        }
        public void start()
        {
                str=str+"start ";
        }
        public void stop()
        {
                str=str+"stop ";
        }
        public void destroy()
        {
                str=str+"destroy ";
        }
        public void paint(Graphics g)
        {
                g.drawString(str,10,25);
        }
}
