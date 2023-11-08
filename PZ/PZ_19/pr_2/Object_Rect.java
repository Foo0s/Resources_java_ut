package PZ.PZ_19.pr_2;
import javax.swing.*;
import java.awt.*;

public class Object_Rect extends JComponent{

    private static final long serial = 2L;
    private int weight;
    private int height;
    private Color color;

    Object_Rect(int weight, int height, Color color) {
        this.weight = weight; this.height = height; this.color = color;
        setOpaque(false);
    }

    public void paintComponent(Graphics ob) {
        ob.setColor(this.color);
        ob.fillRect(0, 0, 80, 80);
        ob.setColor(this.color);
        ob.drawString("Квадрат", 10, 10);
    }

}
