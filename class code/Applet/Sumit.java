import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract public class Sumit extends Applet implements ActionListener
{
    Button b1;
    Button b2;
    
    
    public void init()
    {
        b1=new Button("circle");
        b2=new Button("square");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public void paint(Graphics g)
    {
g.setColor(Color.red);
    }


 public void actionPerformend(ActionEvent e)
{

}
}

// <applet code="Sumit.java" width=500 height=500>
// </applet>