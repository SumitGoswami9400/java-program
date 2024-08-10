
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Gridlyt extends Applet{
 GridLayout g1;
public void init()
{
   
    g1=new GridLayout(2,2);
    setLayout(g1);
    add(new Button("East"));
    add(new Button("WEST"));
    add(new Button("NORTH"));
    add(new Button("SOUTH"));

}
}
// <applet code = "Gridlyt.class" width = 500 height = 500>
// </applet>