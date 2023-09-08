package PZ.PZ_3;
import java.util.Scanner;
public class six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш год: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Ваш год является високосным");
        }
        else System.out.println("Ваш год не является високосным");
    }
}
