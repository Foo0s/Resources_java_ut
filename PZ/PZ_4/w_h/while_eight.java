package PZ.PZ_4.w_h;
import java.util.Scanner;
public class while_eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        * Найти сумму квадратов, до введённого числа.
        * */
        System.out.println("Введите число: ");
        int x = 0; int y = sc.nextInt();
        while (y != 0){
            x += y*y;
            y--;
        }
        System.out.println("Сумма квадратов составляет: " + x);
    }
}
