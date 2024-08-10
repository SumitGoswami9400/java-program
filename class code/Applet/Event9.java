import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class Event9 extends Applet implements ActionListener{
    Button b1;
    TextField t1,t2;
    public void init()
    {
        b1=new Button("circle");
        t1=new TextField(200);
        t2=new TextField(200);
        b1.addActionListener(this);
        add(b1);
        add(t1);
add(t2);

    }
    public void actionPerformed(ActionEvent e)
    {
        t2.setText(t1.getText().toUpperCase());
    }
}
// <applet code = "Event9.class" width = 500 height = 500>
// </applet>