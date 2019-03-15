
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
public class GUI extends JFrame {

    JButton btn = new JButton("LOGIN");
    JLabel label = new JLabel("CARD NUMBER");
    JTextField txt = new JTextField(50);
    JLabel label2 = new JLabel ("HELLO, happy to help you :)");

    CLIENT c = new CLIENT(30000, "54321");
    ATM a = new ATM(c);

    public GUI() {
        setLayout(null);
        add(label);
        label.setBounds(50, 150, 100, 30);
        add(txt);
        txt.setBounds(150, 150, 100, 30);
        add(btn);
        btn.setBounds(150, 200, 100, 30);
        add(label2);
        label2.setBounds(80, 50, 200, 100);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals(c.getCardno())) {
                    ACTIONS g = new ACTIONS(c);
                    g.setVisible(true);
                    g.setSize(500, 600);
                }

            }

        });
        btn.setBackground(Color.pink);
    }

    public static void main(String[] args) {
        GUI g = new GUI();
        g.setVisible(true);
        g.setSize(500, 600);
    }
    

}
