
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame extends JFrame {

    private static final long serialVersionUID = 1L; //Сериализация

    private JTextField textField; //Создание объекта поля текста

    //Кнопки, создание объектов
    private JButton button1;
    private JButton button2;
    private JButton button3;

    //Конструктор, класса, создание приложения
    public TestFrame() {
        super();
        createGUI();
    }

    //Создание приложения
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Установка реакции при выходе из приложения

        //Создание панели
        JPanel panel = new JPanel(); //Объект панели
        panel.setLayout(new FlowLayout()); //Установка внешнего слоя

        //Установка кнопок, их названий и реакция на них
        button1 = new JButton("Button 1");
        button1.setActionCommand("Button 1 was clicked");
        panel.add(button1); //Добавление кнопки на панель

        button2 = new JButton("Button 2");
        button2.setActionCommand("Button 2 was clicked");
        panel.add(button2);


        button3 = new JButton("Button 3");
        button3.setActionCommand("Button 3 was clicked");
        panel.add(button3);


        textField = new JTextField(); //Текстовое поле
        textField.setColumns(23); //Установление колонок, максимальный размер поля
        panel.add(textField); //Добавление в панель объекта textField

        ActionListener actionlistener = new TestActionListener(); //Создание слушателя

        //Добавление слушателей к каждой кнопке
        button1.addActionListener(actionlistener);
        button2.addActionListener(actionlistener);
        button3.addActionListener(actionlistener);


        //В общую панель добавляем нашу панель с объектами
        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100)); //Установка размера окна приложения (общего)
    }

    //Класс слушатель, который позволяет сделать реакция на событие объекта
    public class TestActionListener implements ActionListener { //Задание методов интерфейса
        public void actionPerformed(ActionEvent e) { //Принимает объект слушатель
            JButton newbutton = (JButton) e.getSource(); //Принимает информацию о нажатой кнопке, ссылку на объекту
            System.out.print(newbutton.getText() + ", " + e.getActionCommand()); //Вывод содержимого новой кнопки + формат команды
            if (e.getSource() != button3) {
                textField.setText(e.getActionCommand()); //Если не нажата кнопка 3, то в поле устанавливается текст команды
            }
            else {
                //Создание нового ивента, парам: кнопка, действие, реакция-команда
                ActionEvent new_event = new ActionEvent(button1,
                        Event.MOUSE_DOWN,
                        "Nope");

                //Массив слушателя
                ActionListener[] listeners;
                listeners = button1.getActionListeners(); //Выбираем нужную кнопку
                listeners[0].actionPerformed(new_event); //Берём первого слушателя кнопки
            }
            textField.setText(e.getActionCommand()); //Установка текста в поле
        }
    }

    public static void main(String[] args) {
        //Создание нового объекта запуска программы
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            //Метод run
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(false); //Вид программы
                TestFrame frame = new TestFrame(); //Создаем главный объект приложения
                frame.pack(); //Распаковка элементов
                frame.setLocationRelativeTo(null); //Установка стартовой позиции приложения (середина - null)
                frame.setVisible(true); //Установка видимости приложения
            }
        });
    }
}
