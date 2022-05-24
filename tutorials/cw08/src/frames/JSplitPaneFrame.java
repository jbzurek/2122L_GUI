package frames;

import javax.swing.*;
import java.awt.*;

public
    class JSplitPaneFrame
    extends JFrame {

    public JSplitPaneFrame() {

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.BLUE);

        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.GREEN);

        JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jPanel1, jPanel2);

        jSplitPane.setDividerLocation(100); // miejsce podziałki
        jSplitPane.setOneTouchExpandable(true); // przyciski pozwalające na sterowanie podziałką

        add(jSplitPane);

        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
