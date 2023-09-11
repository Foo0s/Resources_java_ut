package PZ.PZ_4.f_r;
import java.util.Scanner;

public class f_r_three {
    public static void main(String[] args){
        /*
        * Найти MIN - MAX в последовательности чисел
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число - диапазон цикла: ");
        int n = sc.nextInt(); long x = 1000000000l; int max = 0;
        for (int i = 0; i <= n; i++){
            System.out.println("Введите число: ");
            int number_unknow = sc.nextInt();
            if (x >= number_unknow) x = number_unknow;
            if (max <= number_unknow) max = number_unknow;
        }
        System.out.println("Максимальное значние: " + max + " Минимальное значение: " + x);
    }
}
