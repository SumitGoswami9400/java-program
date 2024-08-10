import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JColorChooser;

public class DrawShapesApplet extends Applet {
    private int shapeType; // 0: Circle, 1: Line, 2: Rectangle
    private int x1, y1, x2, y2; // Coordinates for drawing shapes
    private Color fillColor;

    public void init() {
        shapeType = 0; // Default shape is a circle
        fillColor = Color.RED; // Default fill color is red

        // Add mouse listener to get user input
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (shapeType == 0) {
                    drawCircle(e.getX(), e.getY());
                } else if (shapeType == 1) {
                    drawLine(e.getX(), e.getY());
                } else if (shapeType == 2) {
                    drawRectangle(e.getX(), e.getY());
                }
            }
        });

        // Add action listener to handle button clicks
        Button circleButton = new Button("Circle");
        circleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeType = 0;
            }
        });

        Button lineButton = new Button("Line");
        lineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeType = 1;
            }
        });

        Button rectangleButton = new Button("Rectangle");
        rectangleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeType = 2;
            }
        });

        Button colorButton = new Button("Choose Color");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fillColor = JColorChooser.showDialog(DrawShapesApplet.this, "Choose Fill Color", fillColor);
            }
        });

        // Add components to the applet
        add(circleButton);
        add(lineButton);
        add(rectangleButton);
        add(colorButton);
    }

    private void drawCircle(int x, int y) {
        x1 = x;
        y1 = y;
        repaint();
    }

    private void drawLine(int x, int y) {
        if (x1 == 0 && y1 == 0) {
            x1 = x;
            y1 = y;
        } else {
            x2 = x;
            y2 = y;
            repaint();
            x1 = 0;
            y1 = 0;
        }
    }

    private void drawRectangle(int x, int y) {
        if (x1 == 0 && y1 == 0) {
            x1 = x;
            y1 = y;
        } else {
            x2 = x;
            y2 = y;
            repaint();
            x1 = 0;
            y1 = 0;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(fillColor);

        if (shapeType == 0) {
            int diameter = Math.abs(x1 - x2);
            g.fillOval(x1 - diameter / 2, y1 - diameter / 2, diameter, diameter);
        } else if (shapeType == 1) {
            g.drawLine(x1, y1, x2, y2);
        } else if (shapeType == 2) {
            int width = Math.abs(x1 - x2);
            int height = Math.abs(y1 - y2);
            g.fillRect(Math.min(x1, x2), Math.min(y1, y2), width, height);
        }
    }
}

// <applet code="DrawShapesApplet.class" width=1200 height=1222>
// </applet>

