import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любимую букву Маши: ");
		String word_m = sc.nextLine();
		String word_o = sc.nextLine();
		System.out.println("Напишите любое предложение: ");
		String ss = sc.nextLine();
		String[] massiv = ss.split(" ");
        for (int i = 0; i < massiv.length; i++){
            if (massiv[i].startsWith(word_m) && massiv[i].endsWith(word_o)) System.out.println("Слово для Маши: " + i);
            if (massiv[i].startsWith(word_o) && massiv[i].endsWith(word_m)) System.out.println("Слово для Олега: " + i);
        }
	}
}
