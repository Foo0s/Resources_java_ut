package PZ.PZ_19.pr_4;

import javax.swing.*;

import static PZ.PZ_19.pr_4.panelMenu.FONT;
import static PZ.PZ_19.pr_4.panelMenu.Frame_new;

public class pr_4 {
    public static void main(String[] args) {
        /*
        С помощью прозрачной панели JOptionPane создайте 2 окна приложения верхнее главное окно, при
         закрытии которого открывается нижнее диалоговое окно подтверждения намерения
        */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("Button.font", FONT);
                UIManager.put("Label.font", FONT);
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                Frame_new();
            }
        });
    }
}
