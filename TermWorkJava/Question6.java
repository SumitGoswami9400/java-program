	/*  WAP in an Applet Make two Button  one is Circle within Square 
 and second is Square within Circle. When user click on Circle within
  Square then draw Circle within Square. And when user click on Square
   within Circle then draw Square within Circle on the panel window? */

/*import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Question6 extends Applet implements ActionListener{
    Button b1;
    Button b2;
    boolean isSelected=true;
  public void init(){
    Button b1=new Button("Circle"); 
    b1.addActionListener(this);
    Button b2=new Button("Square");
    b2.addActionListener(this);
add(b1);
add(b2);

  }  
public void paint(Graphics g)
{
  if( isSelected)
  {
    g.fillOval(100, 100, 200, 200);
  }
  else()
  {
    g.fillRect(100, 100, 200, 250);
  }
}

public void actionPerformed(ActionEvent e)
{
  if(e.getActionCommand().equals("Circle"));
{
 i=1;
}
}

}

*/


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Question6 extends Applet implements ActionListener {

    private Button circleButton;
    private Button squareButton;
    private boolean drawCircle;

    public void init() {
        setLayout(new FlowLayout());

        circleButton = new Button("Circle within Square");
        squareButton = new Button("Square within Circle");

        add(circleButton);
        add(squareButton);

        circleButton.addActionListener(this);
        squareButton.addActionListener(this);

        drawCircle = true;
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (drawCircle) {
            drawCircleWithinSquare(g);
        } else {
            drawSquareWithinCircle(g);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circleButton) {
            drawCircle = true;
        } else {
            drawCircle = false;
        }

        repaint();
    }

    private void drawCircleWithinSquare(Graphics g) {
        // Set drawing color to black
        g.setColor(Color.BLACK);

        // Draw the square
        int squareSide = 100;
        int squareX = 100;
        int squareY = 100;
        g.drawRect(squareX, squareY, squareSide, squareSide);

        // Draw the circle
        int circleRadius = 50;
        int circleX = squareX + squareSide / 2;
        int circleY = squareY + squareSide / 2;
        g.drawOval(circleX - circleRadius, circleY - circleRadius, circleRadius * 2, circleRadius * 2);
    }

    private void drawSquareWithinCircle(Graphics g) {
        // Set drawing color to black
        g.setColor(Color.BLACK);

        // Draw the circle
        int circleRadius = 100;
        int circleX = 100;
        int circleY = 100;
        g.drawOval(circleX - circleRadius, circleY - circleRadius, circleRadius * 2, circleRadius * 2);

        // Draw the square
        int squareSide = 50;
        int squareX = circleX - squareSide / 2;
        int squareY = circleY - squareSide / 2;
        g.drawRect(squareX, squareY, squareSide, squareSide);
        destroy();
    }
}

// <applet code="Question6.class" width=500 height=400>
// </applet>

