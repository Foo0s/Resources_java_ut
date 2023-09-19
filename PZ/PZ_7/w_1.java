import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число строк: ");
		int n = sc.nextInt(); String[] arr = new String[n];
		for (int i = 0; i < n; i++){
		    System.out.println("Введите строку: ");
		    arr[i] = sc.nextLine();
		}
		System.out.println("Введите строку разделитель: ");
		String s = sc.next();
		System.out.println("Новая строка: \n" + String.join(s, arr));
	}
}
