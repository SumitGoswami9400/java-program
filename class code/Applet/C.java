import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class C extends Applet{
    TextField t1,t2;
    public void init()
    {
        t1=new TextField(20);
        t1.addTextListener(new B());
        t2=new TextField(22);
        add(t1);add(t2);

    }
    class B implements TextListener
     {
public void textValueChanged(TextEvent r)
{
    
    t2.setText(t1.getText());
}
    }
    
}
// <applet code = "C.class" width = 500 height = 500>
// </applet>