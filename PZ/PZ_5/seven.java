package PZ.PZ_5;
import java.util.Scanner;

public class seven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а и б: ");
        int a = scanner.nextInt(); int b = scanner.nextInt();
        int[] cube = new int[b]; int count = 0;
        while (a <= b){
            cube[count] = (a*a*a);
            a += 1;
            count++;
        }
        for (int i = 0; i < cube.length; i++){
            System.out.println("Куб числа: " + cube[i]);
        }
    }
}
