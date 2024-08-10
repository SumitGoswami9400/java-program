// 13.	WAP using Applet to draw circle, line ,rectangle and fill them with a color
//  given by the user.


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Event.*;
public class Question13  extends Applet implements ActionListener{
   Button b1;
   Button b2;
   Button b3;
   public void init()
   {
b1=new Button("circle");
b1.addActionListener(this);

   } 

   public void Paint(Graphics g)
   {
    g.fillOval(100, 100, 150, 200);

    g.drawLine(50, 100, 150, 150);

    g.fillRect(100, 100, 150, 200);
   }
}

// <applet code="Question13.class" width=800 height=900>
// </applet>