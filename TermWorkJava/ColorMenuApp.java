import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorMenuApp {
    private JFrame frame;

    public ColorMenuApp() {
        frame = new JFrame("Color Menu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Color");

        JMenuItem redMenuItem = new JMenuItem("Red");
        redMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        JMenuItem greenMenuItem = new JMenuItem("Green");
        greenMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        JMenuItem blueMenuItem = new JMenuItem("Blue");
        blueMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        colorMenu.add(redMenuItem);
        colorMenu.add(greenMenuItem);
        colorMenu.add(blueMenuItem);
        colorMenu.addSeparator();
        colorMenu.add(exitMenuItem);

        menuBar.add(colorMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColorMenuApp();
            }
        });
    }
}

// <applet code="ColorMenuApp.class" width=400 height=500>
// </applet>
