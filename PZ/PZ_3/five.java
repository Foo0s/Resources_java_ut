package PZ.PZ_3;
import java.util.Scanner;

public class five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа через enter: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ((x > y) && x > z) System.out.println("Большее из чисел: " + x);
        else if (y>x && y > z) System.out.println("Большее из чисел: " + y);
        else System.out.println("Большее из чисел: " + z);
    }
}
