// 13.	WAP using Applet to draw circle, line ,rectangle and fill them with
//  a color given by the user.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingApplet extends Applet implements ActionListener {

    // Define variables
    private Color color;
    private String shapeType;
    private TextField colorTextField;
    private Choice shapeChoice;

    public void init() {
        // Set layout
        setLayout(new BorderLayout());

        // Create color input panel
        Panel colorPanel = new Panel();
        colorPanel.setLayout(new FlowLayout());
        Label colorLabel = new Label("Color:");
        colorTextField = new TextField(10);
        colorPanel.add(colorLabel);
        colorPanel.add(colorTextField);

        // Create shape selection panel
        Panel shapePanel = new Panel();
        shapePanel.setLayout(new FlowLayout());
        Label shapeLabel = new Label("Shape:");
        shapeChoice = new Choice();
        shapeChoice.add("Circle");
        shapeChoice.add("Line");
        shapeChoice.add("Rectangle");
        shapePanel.add(shapeLabel);
        shapePanel.add(shapeChoice);

        // Add color and shape panels to the north
        add(colorPanel, BorderLayout.NORTH);
        add(shapePanel, BorderLayout.NORTH);

        // Create buttons for drawing and clearing
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());
        Button drawButton = new Button("Draw");
        drawButton.addActionListener(this);
        buttonPanel.add(drawButton);
        Button clearButton = new Button("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        // Add button panel to the south
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void paint(Graphics g) {
        // Get color from text field
        String colorStr = colorTextField.getText();
        if (colorStr != null && !colorStr.isEmpty()) {
            color = Color.decode(colorStr);
        }

        // Get shape type from choice
        shapeType = shapeChoice.getSelectedItem();

        // Draw the selected shape with the chosen color
        if (shapeType.equals("Circle")) {
            drawCircle(g);
        } else if (shapeType.equals("Line")) {
            drawLine(g);
        } else if (shapeType.equals("Rectangle")) {
            drawRect(g);
        }
    }

    public void drawCircle(Graphics g) {
        // Set color
        g.setColor(color);

        // Draw circle
        g.drawOval(50, 50, 100, 100);
        g.fillOval(50, 50, 100, 100);
    }

    public void drawLine(Graphics g) {
        // Set color
        g.setColor(color);

        // Draw line
        g.drawLine(150, 50, 250, 150);
    }

    public void drawRect(Graphics g) {
        // Set color
        g.setColor(color);

        // Draw rectangle
        g.drawRect(300, 50, 100, 100);
        g.fillRect(300, 50, 100, 100);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

// <applet code="DrawingApplet.class" width=600 height=500>
// </applet>