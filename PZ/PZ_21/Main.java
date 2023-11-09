import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Светофор"); //Создание окна с указанным названием
        int weight = 900; int height = 800; //Параметры окна, сохранены в переменных
        frame.setSize(weight, height); //Установка размера окна
        DrawningCanvas dc = new DrawningCanvas(weight, height); //Создание объекта светофора
        frame.add(dc); //Добавление в окно светофора
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Обработчик выхода из программы
        frame.setVisible(true); //Видимость окна - true;
    }
}
