package PZ.PZ_19.pr_3;

import javax.swing.*;

public class Content_Frame extends JFrame{
    public Content_Frame() {
        super("Новое окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel new_jpanel = new JPanel();
        JButton butt1 = new JButton("Кнопка 1");
        JButton butt2 = new JButton("Кнопка 2");
        new_jpanel.add(butt1);
        new_jpanel.add(butt2);


        setSize(400, 400);
        setContentPane(new_jpanel); //Замена содержимого окна
        setVisible(true);
    }
}
