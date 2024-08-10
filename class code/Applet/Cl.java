import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javafx.event.ActionEvent;

 abstract public class Cl extends Applet implements ActionListener{
Button b1;
Button b2;
int i=0;
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
    if(i==1){
    g.drawOval(100, 100, 100, 100);
    }
    else if(i==2){
    g.drawRect(100, 100, 100, 100);
}
}

 public void  ActionPreformed(ActionEvent e)
{
    if(e.getSource()==b1){
i=1;
    }
    else if(e.getSource()==b2)
    {
        i=2;
    }
    repaint();
} 
}
// <applet code = "Cl.class" width = 500 height = 500>
// </applet>