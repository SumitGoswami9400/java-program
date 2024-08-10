import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javafx.event.ActionEvent;

 abstract public class mh extends Applet implements ActionListener{
Button b1;
Button b2;
int i=0;
public void init()
{
    b1=new Button("circle");
    b2=new Button("square");
    add(b1);
    add(b2);
    if(i==1){
    b1.addActionListener(this);
    }
     else if(i==2){
    b2.addActionListener(this);
     }
}
public void paint(Graphics g)
{
    
    g.drawOval(100, 100, 100, 100);
    
   
    g.drawRect(100, 100, 100, 100);
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
// <applet code = "mh.class" width =800 height = 700>
// </applet>