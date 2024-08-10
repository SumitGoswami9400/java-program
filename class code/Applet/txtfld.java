import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.*;

abstract public class txtfld extends Applet implements ActionListener{
  TextField t1;
  TextField t2;
  Button b1;
  public void init()
  {
t1=new TextField();
t2=new TextField();
b1=new Button("circle");
add(t1);
add(t2);
add(b1);
  }  
  public void paint(Graphics g)
  {
    t1.setBounds(100, 100, 100, 100);

t2.setBounds(200, 200, 200, 200);
  }
public void ActionPreformed(ActiveEvent e)
{

}
}

// <applet code = "txtfld.class" width = 500 height = 500>
// </applet>