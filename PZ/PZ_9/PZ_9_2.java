import java.util.Scanner;
import java.util.LinkedHashMap;


//Вывести имена сотрудников какой профессии больше всего, вывести кол-воБ профессию и их имена в том же порядке в котором вводились.
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    LinkedHashMap<String, String> hs = new LinkedHashMap<>();
		System.out.println("Введите число: ");
		int number = sc.nextInt(); sc.nextLine();
		for(int i = number*2; i > 0; i--){
		    System.out.println("Введите имя и профессию: ");
		    String text = sc.nextLine();
		    String[] list = new String[3];
		    list = text.split(" ");
		    hs.put(list[0], list[1]);
		}
		int size = 0; String name_prof = ""; int size_2 = 0; String name = "";
		for(String word: hs.keySet()){
		    size = 0;
		    for(String words: hs.keySet()){
		        if(hs.get(word).toLowerCase().equals((hs.get(words).toLowerCase()))){
		            size++;
		            name_prof = hs.get(words);
		        }
		    }
		    if (size_2 < size){
		        size_2 = size;
		        name = name_prof;
		  }
		}
		System.out.println("\n");
		System.out.println("Профессия которой больше всего: " + name_prof);
		System.out.println("Количество сотрудников: " + size_2);
		System.out.println("Имена сотрудников, профессия которых является " + name_prof + ": ");
		for(String ww: hs.keySet()){
		    if (name_prof.toLowerCase().equals((hs.get(ww).toLowerCase()))){
		        System.out.print(ww + " ");
		    }
		}
	}
}
