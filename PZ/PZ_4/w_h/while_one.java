package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt(); int y = 1;
        /*
            Человек вводит натуральное число, необходимо вывести все квадраты чисел
            в промежутке до введённого числа.
        */
        while (y <= x){
            System.out.println(y*y);
            y += 1;
        }
    }
}
