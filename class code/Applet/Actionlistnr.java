import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Actionlistnr extends Applet{
int i=0;
public void init()
{
    Button b1,b2;
    b1=new Button("Circle");
    b2=new Button("Square");
   b1.addActionListener(new C());
   b2.addActionListener(new C());
   add(b1);
   add(b2);
}
public void paint(Graphics g)
{
    if(i==1)
    {
        g.setColor(Color.red);
        g.fillOval(100, 200, 100, 100);;
    }
    else if(i == 2)
    {
        g.setColor(Color.green);
        g.fillOval(100, 200, 100, 100);
    }    
}
class C implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
    if(e.getActionCommand().equals("Circle"))
    {
        
        i=1;
    }
    else if(e.getActionCommand().equals("Square"))
    {
        i=2;
    }
    repaint();
}
}

}
// <applet code = "Actionlistnr.class" width = 500 height = 500>
// </applet>