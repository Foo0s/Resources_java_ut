import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер списка: ");
		int size_list = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < size_list; i++){
		    String s = "" + i;
		    list.add(s);
		}
		System.out.println("Введите индекс и строку для замены.");
		int number = sc.nextInt(); sc.nextLine();
		String text = sc.nextLine();
		list.add(number, text);
		System.out.println("Массив: " + list);
	}
}
