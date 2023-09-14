/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package PZ.PZ_6;
import java.util.Scanner;

public class pz6_3{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива 2 числа: ");
        int x = sc.nextInt(); int y = sc.nextInt(); int[][] ms = new int[x][y];
        int max_s = 0; int id_ms = 0; boolean flag = true;
        for (int i = 0; i < x; i++){
            for (int k = 0; k < y; k++){
                System.out.print("Введите число: ");
                ms[i][k] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < x; i++){
            int count = 0;
            for (int k = 0; k < y; k++){
                count += ms[i][k];
            }
            if (count >= max_s){
                max_s = count;
                id_ms = i;
            }
        }
        
        System.out.println("Вывод строки массива где имеется наибольшая сумма элементов: ");
        for (int i = id_ms; flag=true;){
            for (int k = 0; k < y; k++){
                System.out.print(ms[i][k] + " ");
            }
            break;
        }
        System.out.println("\nИндекс строки: " + id_ms + "\nСумма элементов: " + max_s);
	}
}