package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_nine {
    public static void main(String[] args){
        /*Найти сумму цифр числа N*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt(); int count = 0;
        while (x > 0){
            count += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр: " + count);
    }
}
