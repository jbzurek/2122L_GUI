package task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
    class Calculator
    extends JFrame {

    public Calculator() {

        JPanel jPanel1 = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new GridLayout(4,3));
        JPanel jPanel3 = new JPanel(new GridLayout(2,2));

        JTextField jTextField = new JTextField();

        JButton jButton1 = new JButton("1");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");
        JButton jButton0 = new JButton("0");

        JButton jButtonA = new JButton("+");
        JButton jButtonB = new JButton("-");
        JButton jButtonC = new JButton("*");
        JButton jButtonD = new JButton("/");

        jPanel2.add(jButton1);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        jPanel2.add(jButton4);
        jPanel2.add(jButton5);
        jPanel2.add(jButton6);
        jPanel2.add(jButton7);
        jPanel2.add(jButton8);
        jPanel2.add(jButton9);
        jPanel2.add(jButton0);

        jPanel3.add(jButtonA);
        jPanel3.add(jButtonB);
        jPanel3.add(jButtonC);
        jPanel3.add(jButtonD);

        jPanel1.add(jPanel2, BorderLayout.CENTER);
        jPanel1.add(jPanel3, BorderLayout.LINE_END);
        jPanel1.add(jTextField, BorderLayout.PAGE_START);

        add(jPanel1);

        setTitle("Calculator");

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
