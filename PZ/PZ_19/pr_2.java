package PZ.PZ_19;
import javax.swing.*;
import java.awt.*;

import static javax.swing.JLayeredPane.getLayeredPaneAbove;

public class pr_2 extends JFrame{
    public static void main(String[] args) {
        JFrame new_frame = new JFrame("Фрейм");
        JLayeredPane jlp = new JLayeredPane();
        JButton but1 = new JButton("Кнопка 1");
        jlp.add(but1);

        new_frame.add(jlp);
        jlp.setVisible(true);
        new_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new_frame.setVisible(true);
        new_frame.setSize(400, 400);
    }
}
