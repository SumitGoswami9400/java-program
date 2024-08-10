 /* 13. WAP using Applet to draw circle, line ,rectangle and fill 
 them with a color given by the user. */

  import java.applet.Applet;
 import java.awt.*; 
import java.awt.event.*; 
public class Question13 extends Applet 
 {    
  TextField colorTextField;   
   public void init() 
{ 
        colorTextField = new TextField("#FF0000", 20);       
    Button fillButton = new Button("Fill Rectangle");  
       fillButton.addActionListener(new ActionListener() 
     {            
      public void actionPerformed(ActionEvent e) 
       { 
                repaint(); 
            } 
        }); 
        add(new Label("Enter color code (eg is., #FF0000):"));
         add(colorTextField); 
        add(fillButton); 
    } 
    public void paint(Graphics g) { 
        g.drawLine(2, 3, 100, 100); 
        g.drawRect(200, 300, 400, 300); 
        g.drawOval(600,200,400,500); 
        String inputColor = colorTextField.getText(); 
        try { 
            Color fillColor = Color.decode(inputColor); 
            g.setColor(fillColor); 
            g.fillRect(200, 300, 400, 300); 
            g.fillOval(600,200,400,500); 
        } 
       catch (NumberFormatException ex)
        { 
            System.out.println("Invalid number format: " + inputColor); 
            System.out.println("Please enter a valid color code in the format #RRGGBB"); 
        }
       catch (IllegalArgumentException ex)
       { 
            System.out.println("Invalid color code: " + inputColor); 
            System.out.println("Please enter a valid color code in the format #RRGGBB"); 
        } 
    } 
} 

//<applet code="Question13.java" width=1000 height=1000></applet> 
//</applet>