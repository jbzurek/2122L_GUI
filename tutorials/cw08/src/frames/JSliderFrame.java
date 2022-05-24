package frames;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public
    class JSliderFrame
    extends JFrame {

    public JSliderFrame() {

        JSlider jSlider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // suwak poziomy

        jSlider1.setMajorTickSpacing(50); // kreski wspomagające
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setPaintTicks(true); // widoczność kresek
        jSlider1.setPaintLabels(true); // wartości na suwakach

        jSlider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider s = (JSlider) e.getSource();
                System.out.println(jSlider1.getValue()); // pokazuje na konsoli wartość jaką ustawiamy suwakiem
            }
        });



        JSlider jSlider2 = new JSlider(JSlider.VERTICAL, 0, 100, 50); // suwak pionowy

        jSlider2.setMajorTickSpacing(20); // kreski wspomagające
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setPaintTicks(true); // widoczność kresek
        jSlider2.setPaintLabels(true); // wartości na suwakach

        setLayout(new FlowLayout());

        add(jSlider1);
        add(jSlider2);






        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
