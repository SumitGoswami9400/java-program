// MouseAdapter ka use krke Aap kisi method ko bhi call kr skte h 
// jabki MouseListener ka use krne pe aapko 5 method ko call krna padega compuslory.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class mouselstrn extends Applet{
    public void init()
    {
        
        addMouseListener(new R());
        
        

    } 
      class R implements MouseListener
      
      {
        public void mouseClicked(MouseEvent e)
        {
            setBackground(Color.red);

        }
        public void mousePressed(MouseEvent e)
        {

        }
        public void mouseEntered(MouseEvent e)
        {
           setBackground(Color.blue);
        }
        
        public void mouseReleased(MouseEvent e)
        {

        }
        public void mouseExited(MouseEvent e)
        {

        }
       
      }      
        
            
        
    
}
//<applet code="mouselstrn.class" width=222 height=444>
//</applet>