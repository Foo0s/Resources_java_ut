package PZ.PZ_10;
import java.util.Scanner;

public class PZ_10_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название фигуры и значение радиуса или стороны: ");
        String figure_from_user = sc.nextLine();
        int figure_par = sc.nextInt();
        perimeter_figure(figure_from_user, figure_par);
        area_figure(figure_from_user, figure_par);
    }

    static void perimeter_figure(String name_figure, int x){
        System.out.println((name_figure.toLowerCase().equals("круг"))? "Периметер круга = " + (2*3.14*x): "Периметер квадрата = " + (x*4));
    }

    static void area_figure(String name_figure, int x){
        System.out.println((name_figure.toLowerCase().equals("круг"))? "Площадь круга = " + (3.14*Math.pow(x, 2)): "Площадь квадрата = " + (x*x));
    }
}
