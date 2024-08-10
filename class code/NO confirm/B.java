import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class B  extends Applet{
    GridLayout f1;
CardLayout c1;
Panel p1,p2;
Button b;
public void init()
{
p1=new Panel();
p2=new Panel();
b=new Button("next");
//b.addActionListener(this);
p1.setBackground(Color.red);
p2.setBackground(Color.green);
f1=new GridLayout(2,5);
c1=new CardLayout();
setLayout(f1);
p2.setLayout(c1);
p2.add(new TextField(),"2");
p2.add(new Label("hii i want"),"2");
p2.add(new Checkbox("xp"));
p1.add(b);
add(p1);
add(p2);
}
public void ActionPerformed(ActionEvent e)
{
    c1.next(p2);
}
}
//<applet code="B.class" width=222 height=444>
//</applet>