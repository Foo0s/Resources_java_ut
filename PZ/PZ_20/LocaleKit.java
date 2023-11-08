package PZ.PZ_20;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLayer;

public class LocaleKit {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Окно приложения"){}; //Создание объекта окна приложения
        frame.setVisible(true); //Включение видимости объекта
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Реагирование на нажатие выхода из программы
        //frame.setSize(500, 100); //Установка размера окна
        //frame.setLocation(900, 400); //Установка появление объекта по координатам
        //frame.setBounds(700, 380, 500, 300); //Установка размера окна и координаты появления
        Toolkit new_tool_kit = Toolkit.getDefaultToolkit(); //Создание объекта toolkit
        Dimension dimension = new_tool_kit.getScreenSize(); //Получение размера экрана ПК (width, height)
        frame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300); //Установка расположения окна и его размер
        frame.setTitle("Новый заголовок окна!"); //Установка нового заголовка окна приложения.
    }
}
