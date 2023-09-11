package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_six {
    public static void main(String[] args){
        /*
        * Вывести все числа в промежутке от x to y
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int x = sc.nextInt(); int y = sc.nextInt();
        while (x <= y){
            if (x % 2 == 0){
                System.out.println("Четное число: " + x);
            }
            x++;
        }
    }
}
