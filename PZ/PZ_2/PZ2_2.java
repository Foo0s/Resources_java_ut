import java.util.Scanner;

public class Main
{
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите время: ");
      int time = sc.nextInt();
      System.out.println("Введите скорость: ");
      int scor = sc.nextInt();
      System.out.println(time*scor);
    }
}
