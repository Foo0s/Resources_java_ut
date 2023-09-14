package PZ.PZ_6;
import java.util.Scanner;

public class PZ6_2
{
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число n: ");
      int x = sc.nextInt();
      System.out.println("Введите число m: ");
      int y = sc.nextInt();
      int[][] mas = new int[x][y];
      int d = 0; int s = 1;
      
      for (int i = 0; i < x; i++){
          for (int k = 0; k < y; k++){
              mas[i][k] = 0;
          }
          mas[i][d] = 1;
          for (int k = 0; k < s-1; k++){
              mas[i][k] = 2;
          }
          d++;
          s++;
      }
      for (int i = 0; i < x; i++){
          for (int k = 0; k < y; k++){
              System.out.print(mas[i][k] + " ");
          }
          System.out.println("\n");
      }
    }
}
