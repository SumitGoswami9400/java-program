import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class keyListener extends Applet{
    TextField t1,t2;
    public void init()
    {
        t1=new TextField(20);
        t1.addKeyListener(new B());
        t2=new TextField(22);
        add(t1);add(t2);

    }
    class B extends KeyAdapter
     {
public void keyTyped(KeyEvent r)
{
    char c=r.getKeyChar();
    t2.setText(" "+c);
}
    }
    
}
// <applet code = "keyListener.class" width = 500 height = 500>
// </applet>