import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class flowLayout extends Applet{
    FlowLayout f1;
    public void init(){
        //f1=new FlowLayout();
        //f1=new FlowLayout(FlowLayout.RIGHT);
        f1=new FlowLayout(FlowLayout.LEFT);
        setLayout(f1);
    for(int i=0;i<12;i++)
    {
       add(new Button(" "+i)); 
    }
    }
}

// <applet code = "flowLayout.class" width = 500 height = 500>
// </applet>