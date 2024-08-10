import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Call extends Frame implements ActionListener {
TextField t;
Button b[]=new Button(10);
Button b1[]=new Button(6);
  String op2[]={"+", "-", "*", "%", "=", "C"};  
      String str1="";
      int p=0,q=0;
String oper;
Call()
{
    setLayout(new GridLayout(5,4));
    t=new TextField(20);
    setBackground(Color.pink);
    setFont(new Font("Arial",Font.BOLD,20));
    int k=0;
    t.setEditable(false);
    t.setBackground(Color.white);
    t.setText("0");
    for(int i=0;i<10;i++)
    {
        b[i]=new Button(""+k);
        add(b[i]);
        k++;
        b[i].setBackground(Color.pink);
        b[i].addActionListener(this);
        add(t);
        setVisible(true);
        setSize(300,200);
    }
}
    }

