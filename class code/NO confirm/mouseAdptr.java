// MouseAdapter ka use krke Aap kisi method ko bhi call kr skte h 
// jabki MouseListener ka use krne pe aapko 5 method ko call krna padega compuslory.
// repaint(); ka use krke Aap ek bar me dobara click krne color change kr skte h...
import java.applet.*;
import java.awt.*;
import java.awt.event.*;




public class mouseAdptr extends Applet{
public void init()
{
    addMouseListener(new A());

}    

  class A extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
setBackground(Color.blue);
}
public void mousePressed(MouseEvent e)
{
 setBackground(Color.green);
}
public void mouseEntered(MouseEvent e)
{
    setBackground(Color.red);
}
public void mouseExited(MouseEvent e)
{
    repaint();
}
}
}
// <applet code="mouseAdptr.class" width=240 height=440>
// </applet>
