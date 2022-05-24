package frames;

import javax.swing.*;
import java.awt.*;

public
    class JTextFieldFrame
    extends JFrame {

    public JTextFieldFrame() {

        JTextField jTextField = new JTextField();

        jTextField.setBackground(Color.DARK_GRAY);
        jTextField.setForeground(Color.LIGHT_GRAY);
        jTextField.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        add(jTextField);

        JScrollPane jScrollPane = new JScrollPane(jTextField);

        add(jScrollPane);

        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
