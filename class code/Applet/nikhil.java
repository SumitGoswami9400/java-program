import java.applet.*;
import java.awt.*;


public class nikhil extends Applet
{

int r;
public void run()
{

r=100;
}
public void paint(Graphics g)
{
g.drawRect(100,100,100,100);
g.setColor(Color.red);
g.drawOval(100,100,100,100);
g.drawOval(75,75,149,149);
}
}

//<applet code="nikhil.class" width=500 height=500>
//</applet>