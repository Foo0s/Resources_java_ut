package PZ.PZ_3;
import java.util.Scanner;

public class nine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        if (sc.nextInt() >= 18) System.out.println("Yes");
        else System.out.println("No");
    }
}
