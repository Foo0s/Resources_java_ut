import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;

public class Main extends Canvas {

    //Размеры окна
    static int width = 720;
    static int height = 750;

    public static void main(String[] args) throws IOException{

        //Появление окна с нужными параметрами
        JFrame new_frame = new JFrame(); //Создание окна
        new_frame.setTitle("Название окна"); //Задается название окна
        new_frame.setVisible(true); //Прорисовка
        new_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Обработчик выхода из приложения
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize(); //Создание объекта ToolKit - берём разрешение экрана
        new_frame.setBounds(dm.width / 2 - width / 2, dm.height / 2 - height / 2, width, height + 10); //Установка разрешения окна
        new_frame.getContentPane().setLayout(null);
        //Выравнивание, чтобы координаты объектов в дальнейшем считались от верхнего левого угла
        new_frame.getContentPane().setBackground(Color.BLACK);


        //Добавление картинки и её установка
        BufferedImage screamHead = ImageIO.read(new URL("https://www.dvdland.com.au/product_images/p/196/dvd_7__69128_std.jpg"));

        //Скачивание размера картинки
        int screamHeadWidth = screamHead.getWidth(); //Ширина
        //Берём размер (нужен для сдвигания Jlabel)
        int screamHeadHeight = screamHead.getHeight(); //Высота

        JLabel wIcon = new JLabel(new ImageIcon((screamHead)));

        //создаем объект с картинкой, который будем размещать и двигать
        int starX = (int) (Math.random() * (width - screamHeadWidth)); //Рандомно задаём новые координаты, ось х
        int starY = (int) (Math.random() * (height - screamHeadHeight)); //Рандомно координата по оси у

        wIcon.setBounds(starX, starY, screamHeadWidth, screamHeadHeight); //Установление начальных координат и размера картинки
        new_frame.add(wIcon); //Добавляем объект картинки

        //Перемещение картинки
        while (true) {

            //Считаем новые координаты
            int newX = (int) (Math.random() * (width - screamHeadWidth));
            int newY = (int) (Math.random() * (height - screamHeadHeight));

            int[][] path = drawBresehamLine(starX, starY, newX, newY);

            //По алгоритму Брезенхэма получаем путь (список координат к новой точке)
            starX = newX; starY = newY;
            //Шагаем по массиву точек с указанным шагом
            for(int i = 5; i < path.length; i += 5) {
                try{ //Обработка ошибок
                    Thread.sleep(20); //Пауза
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                wIcon.setBounds(path[i][0], path[i][1], screamHeadWidth, screamHeadWidth);
                //перемещение картинки в указанное место
                wIcon.repaint(); //Перерисовывание картинки
            }
        }

    }

    public static int[][] drawBresehamLine(int starX, int starY, int xend, int yend) {
        // подсчет координат линии между 2 точками в пространстве
        // по алгоритму Брезентхема
        // взято с сайта по ссылке на строке 29


        int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

        dx = xend - starX;
        dy = yend - starY;

        incx = sign(dx);

        incy = sign(dy);

        //Сравнение значений
        if (dx < 0) dx = -dx;
        if (dy < 0) dy = -dy;
        //Модуль чисел

        //Определение наклона отрезка
        if (dx> dy) {
            /*
                Если dx > dy, то отрезок вытянут вдоль оси х, т.е он скорее длинный, чем высокий
                Значит в цикле ужно будет идти по х (строке el = dx), значит "протягивать" прямую по х
                надо в соответствии с тем, слева направо и справа налево она идёт (pdx = incx), при этом
                по у такой сдвиг отсутствует.
            */

            pdx = incx;
            pdy = 0;
            es = dy;
            el = dx;
        } else { //Если прямая скорее высокая чем длинная, т.е вытянута по оси у
            pdx = 0; pdy = incy; es = dx; el = dy; //тогда в цикле будем двигаться по у
        }
        x = starX; y = starY;

        err = el / 2;
        int[][] a = new int[el + 1][2];
        a[0][0] = x; //Занесение первой точки
        a[0][1] = y;

        //идём по всем точкам, начиная со второй и до конца
        for (int t = 0; t < el; t++) {
            err = -es;
            if (err < 0) {
                err += el;
                x += incx; //сдвиг прямой сместить вверх или вниз, если цикл проходит по х
                y += incy; //или сместить влево-вправо, если цикл проходит по y
            }
            else {
                x += pdx;
                y += pdy;
            }
            a[t + 1][0] = x;
            a[t + 1][1] = y;
        }
        return a;
    }

    //Метод для прорисовки всех 9 видов отрезков. Наклонные (из начала в конец и из конца в начало каждый),
    //вертикальный и горизонтальный - тоже из начало в конец и из конца в начало, и точку.
    private static int sign(int x) {
        return (x > 0 ? 1: (x < 0) ? -1 : 0);
        //Возвращает 0, если аргумент (х) равен нулю: -1, если х < 0 и , если х > 0.
    }
}
