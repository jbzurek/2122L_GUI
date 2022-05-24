package task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public
    class Frame
    extends JFrame {

    public Frame() {

        JLabel jLabel1 = new JLabel("a: ");
        JLabel jLabel2 = new JLabel("b: ");

        JTextField jTextField1 = new JTextField();
        jTextField1.setPreferredSize(new Dimension(100,20));

        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        JTextField jTextField2 = new JTextField();
        jTextField2.setPreferredSize(new Dimension(100,20));

        jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        JButton jButton = new JButton("a + b");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value1 = Integer.parseInt(jTextField1.getText());
                int value2 = Integer.parseInt(jTextField2.getText());

                int sum = value1 + value2;
                String s = String.valueOf(sum);

                jButton.setText(s);
            }
        });

        this.setTitle("Sumator");

        setLayout(new FlowLayout());

        add(jLabel1);
        add(jTextField1);

        add(jLabel2);
        add(jTextField2);

        add(jButton);

        setSize(400,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
