import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Borderlyt extends Applet{
BorderLayout b1;
public void init()
{
    b1=new BorderLayout();
    setLayout(b1);
   // add(new Button("Sumit Goswami"));
//add(new Button("Sumit Goswami"),BorderLayout.SOUTH);


//add(new Button("Sumit Goswami"),BorderLayout.SOUTH);
//add(new Button("Sumit Goswami"),BorderLayout.NORTH);
//add(new Button("Sumit Goswami"),BorderLayout.EAST);
//add(new Button("Sumit Goswami"),BorderLayout.WEST);

add(new Button("SOUTH"),BorderLayout.SOUTH);
add(new Button("NORTH"),BorderLayout.NORTH);
add(new Button("EAST"),BorderLayout.EAST);
add(new Button("WEST"),BorderLayout.WEST);
add(new TextField(" "),BorderLayout.CENTER);
}

}
// <applet code = "Borderlyt.class" width = 500 height = 500>
// </applet>
