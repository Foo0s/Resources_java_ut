package PZ.PZ_3;
import java.util.Scanner;

public class fiveteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x = number / 10; int v = number / 5; int l = number / 50; int c = number / 100;
        if (number / 10 > 0 && number < 50){
            System.out.println("X".repeat(x) + "V".repeat(number - v));
        }
    }
}
