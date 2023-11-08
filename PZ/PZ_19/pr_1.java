package PZ.PZ_19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pr_1 implements ActionListener{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Новое окно"); //Объект окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Функция закрытия файла
        frame.setBackground(Color.cyan);

        JButton button = new JButton("Клац!");
        JLabel label = new JLabel("Текст к данному окну");
        button.setBounds(300, 450, 100, 100);
        button.addActionListener(new pr_1());
        frame.add(button);
        frame.add(label);
        frame.setVisible(true); //Прорисовка
        frame.setSize(800, 900); //Установка размера экрана
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Кнопка нажата");
    }
}
