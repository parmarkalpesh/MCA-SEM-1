// An Applet skeleton.
import java.awt.*;
import java.applet.*;
/*
<applet code="AppletSkelTest" width=300 height=100>
</applet>
*/
public class AppletSkelTest extends Applet {


public void stop() {
// suspends execution
		System.out.println("C");

}


// Called first.
public void init() {
	System.out.println("A");
// initialization
}
/* Called second, after init(). Also called whenever
the applet is restarted. */
public void start() {
// start or resume execution
		System.out.println("B");

}
// Called when the applet is stopped.

/* Called when applet is terminated. This is the last
method executed. */
public void destroy() {
// perform shutdown activities
		System.out.println("D");

}
// Called when an applet's window must be restored.
public void paint(Graphics g) {
// redisplay contents of window
		System.out.println("B2");

}
}