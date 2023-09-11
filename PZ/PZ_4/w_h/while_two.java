package PZ.PZ_4.w_h;
import java.util.Scanner;

public class while_two {
    public static void main(String[] args){
        /*
        * Вычеслить сумму всех чисел от а до б включительно.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через Enter: ");
        int x = sc.nextInt(); int y = sc.nextInt(); int z = 0;
        while (x <= y){
            z += x;
            x++;
        }
        System.out.println("Сумма всех чисел: " + z);
    }
}
