import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Event6 extends Applet{
    TextField t1;
    TextField t2;
    public void init()
    {
        t1=new TextField();
        t2=new TextField();
        t1.addTextListener(new C());
        add(t1);
        add(t2);
    }
    class C implements TextListener
    {
public void textValueChanged(TextEvent e)
{
    t2.setText(t1.getText());
}
    }
}
// <applet code = "Event6.class" width = 500 height = 500>
// </applet>
