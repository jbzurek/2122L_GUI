package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
    class JButtonFrame
    extends JFrame {

    public JButtonFrame() {

        JButton jButton = new JButton("Click me!");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText("Clicked");

                if (jButton.getBackground() == Color.GREEN) {
                    jButton.setBackground(Color.ORANGE);
                } else {
                    jButton.setBackground(Color.GREEN);
                }


            }
        });

        jButton.setEnabled(false); // blokuje przycisk
        jButton.setToolTipText("Button"); // informacja wyświetlana po najechaniu kursorem na przycisk

        add(jButton);
        pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
