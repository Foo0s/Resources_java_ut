package PZ.PZ_6;
import java.util.Scanner;

public class PZ6_5 {
    public static void main(String[] args){
        /*
        * Вывод матрицы на 90* против часовой стрелки.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива - кол-во строк и столбцов: ");
        int n = sc.nextInt(); int m = sc.nextInt(); int[][] matrix = new int[n][m]; int m_2 = m;

        System.out.println("\nГенерация матрицы: ");
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                System.out.println("\nВведите число: ");
                matrix[i][k] = sc.nextInt();
            }
        }

        System.out.println("\nВывод существующей матрицы: ");
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println('\n');
        }

        System.out.println("\nВывод матрицы перевёрнутой на 90* против часовой стрелки: ");
        for (int i = 0; i < m_2; i++){
            int x = 0;
            for (int k = 0; k < n; k++){
                System.out.print(matrix[x][m-1] + " ");
                x++;
            }
            m--;
            System.out.println("\n");
        }
    }
}
