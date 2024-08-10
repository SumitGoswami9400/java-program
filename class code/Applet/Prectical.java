import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prectical extends Applet implements ActionListener{
    Button b1;
   
    public void init()
    {
        b1=new Button();
         b1.addActionListener(this);
    add(b1);
    }
    
public void actionPerformed(ActionEvent e)
{
setBackground(Color.red);
}
    }

// <applet code = "Prectical.class" width = 800 height = 800>
// </applet>

