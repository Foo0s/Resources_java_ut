package PZ.PZ_3;
import java.util.Scanner;


public class ten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длины катетов прямоугольника через enter: ");
        System.out.println("Ваш ответ = " + Math.sqrt(Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2)));
    }
}
