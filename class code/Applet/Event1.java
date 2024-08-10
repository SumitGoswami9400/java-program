import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Applet {
    Button b1;
    public void init()
    {
        b1=new Button("circle");
        b1.addActionListener(new C(this));
        add(b1);
    }
}

class C implements ActionListener
{
    int i=0;
    Event1 x;
    C(Event1 i)
    {
        x=i;
    }
    public void actionPerformed(ActionEvent e)
    {
x.setBackground(Color.red);
    }
}

// <applet code = "Event1.class" width = 500 height = 500>
// </applet>
