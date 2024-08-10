 /* 15.	WAP to show the use of KeyListener/MouseListener  interface in order to generate and process those events. */

import javax.swing.*;
 import java.awt.*; 
import java.awt.event.*; 
public class Question15 extends JFrame implements KeyListener, MouseListener 
{ 
    public Question15()
   {       
       setTitle("Event Demo");  
         setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        addKeyListener(this);
         addMouseListener(this);
         setFocusable(true); 
    } 
    public void keyPressed(KeyEvent e) { 
        System.out.println("Key Pressed: " +e.getKeyChar()); 
    } 
    public void keyReleased(KeyEvent e) { 
        System.out.println("Key Released: " +e.getKeyChar()); 
    } 
    public void keyTyped(KeyEvent e) { 
        // Not used in this example 
    } 
    public void mouseClicked(MouseEvent e) { 
        System.out.println("Mouse Clicked at (" +e.getX() + ", " +e.getY() + ")"); 
    } 
    public void mousePressed(MouseEvent e) { 
        // Not used in this example 
    } 
    public void mouseReleased(MouseEvent e) { 
        // Not used in this example 
    } 
    public void mouseEntered(MouseEvent e) { 
        // Not used in this example 
    } 
    public void mouseExited(MouseEvent e) { 
        // Not used in this example 
    } 
    public static void main(String[] args) 
    {
         SwingUtilities.invokeLater(new Runnable() 
    { 
            public void run() 
     {               
       new Question15().setVisible(true); 
            } 
        }); 
 }
 }
//  <applet code="Question15.class" width=500 height=500>
//  </applet>
