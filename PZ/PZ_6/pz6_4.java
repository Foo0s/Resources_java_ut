package PZ.PZ_6;
import java.util.Scanner;

public class pz6_4{
    public static void main(String[] args){

        /*
           Поворот матрицы на 90* по часовой стрелке.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 натуральных числа: ");
        int m = sc.nextInt(); int n = sc.nextInt();
        System.out.println("\nСоздание массива: ");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int k = 0; k < n; k++){
                System.out.println("Введите число: ");
                matrix[i][k] = sc.nextInt();
            }
        }

        System.out.println("\nВывод матрицы: ");
        for (int i = 0; i < m; i++){
            for (int k = 0; k < n; k++){
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("\nВывод перевёрнутой матрицы: ");
        for (int i = 0; i < m; i++){
            for (int k = n-1; k >= 0; k--){
                System.out.print(matrix[k][i] + " ");
            }
            System.out.println("\n");
        }
    }
}

