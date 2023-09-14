package PZ.PZ_6;

import java.util.Scanner;

public class PZ6_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int x = sc.nextInt();
        System.out.println("Введите число m: ");
        int y = sc.nextInt(); int chet = 1;

        int[][] massive = new int[x][y];
        System.out.println("Построение массива: ");
        for (int i = 0; i < x; i++){
            for (int k = 0; k < y; k++){
                massive[i][k] = (k+1)*chet;
            }
            chet += 1;
        }
        for (int i = 0; i < x; i++){
            for (int k = 0; k < y; k++){
                System.out.print(massive[i][k] + " ");
            }
            System.out.println("\n");
        }
    }
}
