package PZ.PZ_3;
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число котлет: ");
        int k = sc.nextInt();
        System.out.println("Введите минуты для обжаривания с 1-ой стороны котлеты: ");
        int m = sc.nextInt();
        System.out.println("Введите количество котлет, которые помещаются на сковородке: ");
        int kk = sc.nextInt();
        if (kk >= k) System.out.println(m*2);
        else if (k*2 % kk == 0) System.out.println(m*(k*2/kk));
        else{
            System.out.println(m*(1 + (k*2 / kk)));
        }
    }
}
