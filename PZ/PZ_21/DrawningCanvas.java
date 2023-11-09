import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;
import java.awt.Color;
public class DrawningCanvas extends JComponent{ //Наследывает класс JComponent
    private int width; //Параметр ширины
    private int height; // Параметер высоты

    //Объекты класса Light
    private Light light_1_red = new Light(Color.RED, 270); //Первый объект - овал
    private Light light_2_yellow = new Light(Color.YELLOW, 380); //Второй объект - овал
    private Light light_3_green = new Light(Color.GREEN, 490); //Третий объект - овал

    //Конструктор
    DrawningCanvas(int width, int height) {
        this.width = width; this.height = height;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; //Создание объекта

        //Тело

        g2d.setColor(Color.DARK_GRAY); //Задание цвета объекту
        g2d.fillRoundRect(400, 240, 130, 360, 25, 25); //Прорисовка первого прямоугольника
        g2d.fillRoundRect(435, 603, 60, 65, 15, 15); //Прорисовка второго прямоугольника

        //Цвета светофора

        light_1_red.drawLight(g2d);
        light_2_yellow.drawLight(g2d);
        light_3_green.drawLight(g2d);

        //Верхняя часть светофора
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(445, 200, 40, 20);

        /* Стороны треугольников */
        light_1_red.drawEar(g2d);
        light_2_yellow.drawEar(g2d);
        light_3_green.drawEar(g2d);
    }
}
