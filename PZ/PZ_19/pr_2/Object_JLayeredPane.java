package PZ.PZ_19.pr_2;
import java.awt.*;
import javax.swing.*;
public class Object_JLayeredPane extends JFrame{

    private static final long serial = 2L;
    public Object_JLayeredPane() {
        super("Новое окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane jlp = getLayeredPane();

        Object_Rect obr_1 = new Object_Rect(30, 40, Color.getHSBColor(30, 30, 30));
        Object_Rect obr_2 = new Object_Rect(40, 40, Color.BLUE);


        obr_1.setBounds(400, 100, 90, 50);
        obr_2.setBounds(400, 300, 90, 50);

        jlp.add(obr_1, JLayeredPane.PALETTE_LAYER);
        jlp.add(obr_2, JLayeredPane.POPUP_LAYER);

        setSize(800, 900);
        setVisible(true);
    }
}
