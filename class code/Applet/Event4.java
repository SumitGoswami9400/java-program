import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Event4 extends Applet {
    Button b1;
    TextField t;
    public void init()
    {
        b1=new Button("circle");
t=new TextField(500);
b1.addMouseListener(new D());
add(b1);
add(t);
    }

class D extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        setBackground(Color.red);
    }
}
}
// <applet code = "Event4" width = 500 height = 500>
// </applet>
