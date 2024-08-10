/*  9.	WAP in an Applet Make two Button  one is Circle within Square  and second is Square within Circle. When user click on Circle within Square then draw Circle within Square. And when user click on Square within Circle then draw Square within Circle on the panel window?  */

import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
 public class Question9 extends Applet implements ActionListener 
{     int i=0; 
    Button b1;   
    Button b2;    
 public void init() 
    { 
        b1=new Button("squareWithinCircle");    
         b1.addActionListener(this); 
        add(b1); 
        b2=new Button("circleWithinSquare");      
       b2.addActionListener(this); 
        add(b2); 
    } 
    public void paint(Graphics g) 
    { 
        if (i==1){ 
            g.drawRect(129,129,141,141); 
            g.drawOval(100,100,200,200); 
        } 
        else if(i==2) 
        { 
            g.drawOval(100,100,200,200); 
            g.drawRect(100,100,200,200); 
        } 
    } 
    public void actionPerformed(ActionEvent e) 
    { 
        if(e.getActionCommand().equals(b1)) {
                    i=1; 
        }
         else if(e.getActionCommand().equals(b2)) {
            i=2; 
         }
        repaint(); 
     
     } 
 
} 

//<applet code="Question9.java" width=300 height=800>
//</applet>
