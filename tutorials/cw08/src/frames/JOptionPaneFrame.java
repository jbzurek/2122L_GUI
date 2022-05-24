package frames;

import javax.swing.*;

public
    class JOptionPaneFrame {

    JOptionPaneFrame() {

        JOptionPane.showMessageDialog(null,
                "Message",
                "Title",
                JOptionPane.WARNING_MESSAGE);

        String a = JOptionPane.showInputDialog(null,
                "Message",
                "Title",
                JOptionPane.PLAIN_MESSAGE);

        System.out.println(a);

        String[] arr = {"First", "Second", "Third"};
        String s = (String) JOptionPane.showInputDialog(null,
                "Message",
                "Title",
                JOptionPane.PLAIN_MESSAGE,
                null,
                arr,
                arr[1]);

        System.out.println(s);

        String[] arr2 = {"Yes", "No"};
        JOptionPane.showOptionDialog(null,
                "Message",
                "Title",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                arr2,
                arr2[0]);

    }
}
