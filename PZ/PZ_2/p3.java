package PZ.PZ_2;
import java.util.Scanner;

public class p3
{
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число: ");
      int x = sc.nextInt();
      System.out.println("The next number fpr the number " + x + " is " + (x+1));
      System.out.println("The next number fpr the number " + x + " is " + (x-1));
    }
}
