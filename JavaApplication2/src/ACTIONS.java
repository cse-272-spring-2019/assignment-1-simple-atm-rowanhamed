
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
public class ACTIONS extends JFrame {

    JButton btn2 = new JButton("withdraw");
    JButton btn3 = new JButton("deposit");
    JButton btn4 = new JButton("current balance");
    JButton btn5 = new JButton("back");
    JButton btn6 = new JButton("next");
    JLabel balance = new JLabel(".....");
    JLabel prev = new JLabel(".....");
    JLabel next = new JLabel(".....");
    
    ATM a;


    public ACTIONS(CLIENT c) {
        a= new ATM(c);
        setLayout(null);
        add(btn2);
        btn2.setBounds(100, 100, 100, 30);
        add(btn3);
        btn3.setBounds(250, 100, 100, 30);
        add(btn4);
        btn4.setBounds(100, 150, 100, 30);
        add(btn5);
        btn5.setBounds(250, 150, 100, 30);
        add(btn6);
        btn6.setBounds(175, 200, 100, 30);
  add(balance);
        balance.setBounds(20, 150, 300, 30);
        add(prev);
        prev.setBounds(300, 200, 100, 30);
add(next);
        next.setBounds(20, 200, 100, 30);


        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                WITHDRAW g = new WITHDRAW(a);
                g.setVisible(true);
                g.setSize(500, 600);

            }
        });
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           balance.setText(c.getBalance()+"");
           
            }
        });
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                DEPOSIT g = new DEPOSIT(a);
                g.setVisible(true);
                g.setSize(500, 600);

            }
        });
       btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                prev.setText(a.prev());
            }
        });
       btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                next.setText(a.next());
            }
        });
       
     

    }
}
