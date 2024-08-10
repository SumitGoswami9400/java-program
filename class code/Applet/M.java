import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class M extends Applet{
    public void init()
    {
     Button b1;
     Button b2;
     int b=0;
     
     
        b1=new Button("square");
         
        b1.addActionListener(new N());
        add(b1);
    
     
     b2=new Button("circle");
     
     b2.addActionListener(new N());
      add(b2);
     

    }
    public void paint(Graphics g)
    {
    //  if(b==1) 
     {  
g.drawRect(100,100,100,100);
g.setColor(Color.red);
     }    
    // else if(b==2) 
    {   
g.drawOval(100,50,100,50);
g.setColor(Color.green);
    }  
}

public class N implements ActionListener{
public void actionPerformed(ActionEvent e)
{
// if(e.getSource==b1)
// {
//    b=1;
// }
// else if(e.getSource==b2)
// {
//    b=2;
// }
}
}
}
// <applet code = "nikhil.class" width = 500 height = 500>
// </applet>
