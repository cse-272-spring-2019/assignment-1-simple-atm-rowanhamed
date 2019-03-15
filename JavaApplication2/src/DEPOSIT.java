
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rowan
 */
public class DEPOSIT extends JFrame {
    
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn10 = new JButton("0");
    JButton btn11 = new JButton("OK");
    JLabel label = new JLabel("DEPOSIT");
    JTextField txt = new JTextField(50);
    
    
     ATM a ;
    
    public DEPOSIT(ATM c) {
        a=c;
        setLayout(null);
        add(label);
        label.setBounds(50, 30, 100, 30);
        add(txt);
        txt.setBounds(150, 30, 100, 30);
        add(btn1);
        btn1.setBounds(50, 100, 100, 30);
        add(btn2);
        btn2.setBounds(200, 100, 100, 30);
        add(btn3);
        btn3.setBounds(50, 150, 100, 30);
        add(btn4);
        btn4.setBounds(200, 150, 100, 30);
        add(btn5);
        btn5.setBounds(50, 200, 100, 30);
        add(btn6);
        btn6.setBounds(200, 200, 100, 30);
        add(btn7);
        btn7.setBounds(50, 250, 100, 30);
        add(btn8);
        btn8.setBounds(200, 250, 100, 30);
        add(btn9);
        btn9.setBounds(50, 300, 100, 30);
        add(btn10);
        btn10.setBounds(200, 300, 100, 30);
         add(btn11);
        btn11.setBounds(50, 350, 100, 30);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"1");
            }
        });
          btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"2");
            }
        });
          btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"3");
            }
        });
            btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"4");
            }
        });
            btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"5");
            }
        });
              btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"6");
            }
        });
            btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"7");
            }
        });  
              btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"8");
            }
        });
                btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"9");
            }
        });
                  btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=txt.getText();
                txt.setText(x+"0");
            }
        });
                             btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                  a.deposit(txt.getText());
             
               
            }
        });
    }
}
