package PZ.PZ_3;
import java.util.Scanner;

public class seven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 строки через enter");
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();
        if (x.equals(y) || x.equals(z) || y.equals(z)) System.out.println("Yes");
        else System.out.println("No");
    }
}
