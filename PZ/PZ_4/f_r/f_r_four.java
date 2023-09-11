package PZ.PZ_4.f_r;
import java.util.Scanner;
public class f_r_four {
    public static void main(String[] args){
        /*
        * Нахождение факториала числа.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите факториал числа: ");
        int x = sc.nextInt(); int a = 1;
        for (int k = 1; k <= x; k++){
            a *= k;
        }
        System.out.println("Факториал числа " + x + " равен " + a);
    }
}
