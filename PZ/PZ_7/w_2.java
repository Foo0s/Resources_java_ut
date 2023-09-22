import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введит строку: ");
		String ss = sc.nextLine();
		sc.next();
		System.out.println("Введите число: ");
		Integer numb = sc.nextInt();
		String nu = numb.toString();
		System.out.println("Индекс перевого вхождения: " + (ss.indexOf(nu)));
		System.out.println("Индекс последнего вхождения: " + (ss.lastIndexOf(nu)));
	}
}
