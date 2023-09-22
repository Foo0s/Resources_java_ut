package PZ.PZ_2;
import java.util.Scanner;

public class p4
{
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите ширину: ");
      int x = sc.nextInt();
      System.out.println("Введите высоту: ");
      int y = sc.nextInt();
      System.out.println("Периметер прямоугольника равна: " + ((x+y)*2));
      System.out.println("Площадь прямоугольника равна: " + (x*y));
    }
}