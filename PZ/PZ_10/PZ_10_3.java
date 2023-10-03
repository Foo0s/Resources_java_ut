package PZ.PZ_10;
import java.util.Scanner;

public class PZ_10_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        simple(number);
    }

    static void simple(int numb){
        int count = 0;
        for(int j = numb; j > 0; j--){
            if (numb % j == 0) count++;
        }
        System.out.println((count == 2)? "YES": "NO");
    }
}
