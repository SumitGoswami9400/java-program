// imp Question: write a program to create a pannel and get value from user in texfield area and find its corresponding factorial value.
// Action listener programs

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.awt.*;
public class Event11 extends Applet implements ActionListener {

Button b1;
TextField t1;
TextField t2;
public void init()
{
    t1=new TextField(200);
    t2=new TextField(200);
    b1=new Button("fact");
    t1.addActionListener(this);
    add(t1);
    add(t2);
    add(b1);
}
  public void actionPerformed(ActionEvent e)
  {
int i=Integer.parseInt(t1.getText());
t2.setText(Integer.toString(fact(i)));
  }  
int fact(int n)
{
    if(n==0)
 return 1;
 else
 return (n*fact(n-1));
}

}
// <applet code = "Event11.class" width = 500 height = 500>
// </applet>

