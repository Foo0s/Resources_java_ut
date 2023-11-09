import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Color;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;

public class Light { //Класс - объект, компонент светофора
    private Color color; //Атрибут цвет
    private int y; //Позиция

    //Конструктор класса//
    Light(Color color, int y) {
        this.color = color; this.y = y;
    }

    public void drawLight(Graphics2D gs) { //Прорисовка самого компонента света
        gs.setColor(Color.WHITE); //Задание цвета 1-му объекту
        gs.fillOval(415, y-20, 100, 100); //Прорисовка Овала, по координатам, цвет белый
        gs.setColor(Color.DARK_GRAY); //Задание цвета новому овалу
        gs.fillOval(415, y-8, 100, 100); //Прорисовка второго Овала, по заданным координатам
        gs.setColor(this.color); //Задание цвета главному овалу - знаку света
        gs.fillOval(420, y, 90, 90); //Координаты знака света
    } //Прорисовка объекта

    public void drawEar(Graphics2D grs) {
        int x = 540; int x2 = 390; //позиция координат объекта

        //Правая часть
        grs.setColor(Color.DARK_GRAY); //Задание цвета объекта
        Path2D.Double ear = new Path2D.Double(); //Создание объекта
        ear.moveTo(x, this.y+59); //Перемещение объекта по координатам
        ear.lineTo(x, this.y+4); //Рисует линию от текущей позиции до указанных координат
        ear.quadTo(x, y-1, x+5, y-1);  //Создание нового элемента
        ear.lineTo(x+60, y-1); //рисует линию
        ear.quadTo(x+65, y-1, x+65, y+6); //создание нового элемента
        ear.lineTo(x+5, y+64); //прорисовка элемента
        ear.quadTo(x,y+64, x, y+59);
        grs.fill(ear); //Добавление объекта

        //Левая часть
        Path2D.Double ear2 = new Path2D.Double(); //создание нового объекта
        ear2.moveTo(x2, this.y+59);
        ear2.lineTo(x2, this.y+4);
        ear2.quadTo(x2, this.y-1, x2-5, y-1);
        ear2.lineTo(x2-60, y-1);
        ear2.quadTo(x2-65, this.y-1, x2-65, this.y+6);
        ear2.lineTo(x2-5, this.y+64);
        ear.quadTo(x2, y+64, x2, this.y+59);
        grs.fill(ear2); //добавление элемента
    }

}
