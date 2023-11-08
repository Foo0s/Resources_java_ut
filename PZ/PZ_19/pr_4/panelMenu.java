package PZ.PZ_19.pr_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class panelMenu extends JFrame {
    public static final Font FONT = new Font("Times New Roman", Font.BOLD, 15); //Параметры шрифта

    static void Frame_new() {
        JFrame GUI = new JFrame("Приложение");
        GUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        GUI.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            public void windowClosing(WindowEvent event) {
                String[] obj = new String[]{"Да", "Нет"};
                int choice = JOptionPane.showOptionDialog(
                        event.getWindow(), "Желаете закрыть окно?",
                        "Нижнее меню", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, obj, obj[0]);
                if (choice == 0) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        GUI.setSize(800, 800);
        GUI.setVisible(true);
    }

}
