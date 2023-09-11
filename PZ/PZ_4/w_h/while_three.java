package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_three {
    public static void main(String[] args){
        /*
        * Вычислите количество всех чисел кратных 3 но не кратных 5, от а до б
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через Enter: ");
        int x = sc.nextInt(); int y = sc.nextInt(); int count = 0;
        while (x <= y){
            if (x % 3 == 0 && x % 5 != 0) count++;
            x++;
        }
        System.out.println("Количество чисел кратных 3 и не кратным 5 в промежутке от " + (x-y) + " до " + y + " составляет " + count);
    }
}
