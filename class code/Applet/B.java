import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class B extends Applet{
    public void init(){
addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e)
    {
        setBackground(Color.red);
    }
}  );
    }
}

// <applet code = "B.class" width = 500 height = 500>
// </applet>