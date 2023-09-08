package PZ.PZ_3;
import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер шоколадки n-доли, k-доли: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Введите количество долек которые хотите отломить: ");
        int x = sc.nextInt();
        if (((n*k) - x) % 10 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
