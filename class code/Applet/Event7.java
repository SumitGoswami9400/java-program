// KeyAdapter class
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event7 extends Applet{
    TextField t1,t2;

    public void init(){
        t1 = new TextField(22);
        t1.addKeyListener(new P());
        t2 = new TextField(22);
        add(t1);
        add(t2);
    }

    class P extends KeyAdapter{
        public void keyTyped(KeyEvent e){
           // char c = e.getKeyChar();
            t2.setText(t1.getText());
        }
    }
}

// <applet code = "Event7" width = 600 height = 600>
// </applet>