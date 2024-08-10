import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class event extends Applet {
    Button b1;
    public void init()
    {
        b1=new Button("circle");
        b1.addActionListener(new B());
        add(b1);
    }

}
 class B implements ActionListener
{
    int i=0;
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(i++);
    }
}
// <applet code = "event.class" width = 500 height = 500>
// </applet>