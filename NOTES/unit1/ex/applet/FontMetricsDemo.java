import java.applet.*;
import java.awt.*;
/*
<applet code="FontMetricsDemo" width=300 height=300>
</applet>
*/
public class FontMetricsDemo extends Applet
{
        public void paint(Graphics g)
        {
                int baseline=100;
		int y=0;
                g.setColor(Color.red);
                g.drawLine(0,baseline,300,baseline);

                Font f=new Font("Times New Roman",Font.BOLD,36);
                g.setFont(f);

                g.setColor(Color.black);
                g.drawString("java FontMatrics",5,baseline);

                FontMetrics FM=g.getFontMetrics(f);

                g.setColor(Color.green);
                int ascent=FM.getAscent();
                y=baseline-ascent;
                g.drawLine(0,y,300,y);

                g.setColor(Color.blue);
                int descent=FM.getDescent();
                y=baseline+descent;
                g.drawLine(0,y,300,y);

                g.setColor(Color.magenta);
                int leading=FM.getLeading();
                y=baseline+descent+leading;
                g.drawLine(0,y,300,y);

                g.setColor(Color.orange);
                int height=FM.getHeight();
                y=baseline+height;
                g.drawLine(0,y,300,y);

                g.setColor(Color.black);
                g.drawString("\\?/^{9}[* 0]@",5,y);

                g.setColor(Color.red);
                y=baseline+height+descent;
                g.drawLine(0,y,300,y);
        }
}
