import java.applet.*;
import java.awt.*;

public class Applet1 extends Applet{
Color r;
    public void init()
    {
setForeground(Color.BLUE);
    }
    public void paint(Graphics g)
    {
         g.setColor(Color.red);
        g.drawString("Sumit", 100, 100);
       

        g.drawRect(100, 100, 50, 50);
        g.setColor(Color.red);

        g.drawRect(100, 50, 50, 100);
        g.setColor(Color.green);


    }
}
// <applet code = "Applet1.class" width = 500 height = 500>
// </applet>

