package PZ.PZ_7;
import java.util.Scanner;

public class PZ_7_1 {
	public static void main(String[] args) {
		/*
			Вводится число n, затем n строчек, которые необходимо
			соединить. После вводится ещё одна строка - которая
			должна быть в качестве разделителя. Выведите одну
			строку - все введённые выше слова через разделитель.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число строк: ");
		int n = sc.nextInt(); String[] arr = new String[n];
		for (int i = 0; i < n; i++){
		    System.out.println("Введите строку: ");
		    arr[i] = sc.next();
		}
		System.out.println("Введите строку разделитель: ");
		String s = sc.next();
		System.out.println("Новая строка: \n" + "".join(s, arr));
	}
}
