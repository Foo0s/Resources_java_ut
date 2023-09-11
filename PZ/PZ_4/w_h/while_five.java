package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_five {
    public static void main(String[] args){
        /*
        * Последовательность чисел - найти минимальное число, если 0 - конец цикла.
        */
        Scanner sc = new Scanner(System.in);
        long max = 100000000000l;
        while (true){
            System.out.println("Введите число: ");
            int numb = sc.nextInt();
            if (numb == 0){
                break;
            }
            if (max >= numb){
                max = numb;
            }
        }
        System.out.println("Самое большое число: " + max);
    }
}
