package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_four {
    public static void main(String[] args){
        /*
        * Вычислить среднее арифмитическое вводимых чисел, пока != 0
        * */
        Scanner sc = new Scanner(System.in);
        int x = 0; int y = 0;
        while (true){
            System.out.println("Вводите число: ");
            int z = sc.nextInt();
            if (z == 0){
                break;
            }
            x++;
            y += z;
        }
        System.out.println("Среднее арифмитическое чисел: " + (y / x));
    }
}
