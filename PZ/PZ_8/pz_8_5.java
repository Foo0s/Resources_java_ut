package PZ.PZ_8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class pz_8_5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество запросов: ");
		int kol = sc.nextInt(); sc.nextLine();
		HashMap<String, String> hash_l = new HashMap<>();
		for(int i = 0; i < kol; i++){
		    System.out.println("Ваш запрос (push/pop): ");
		    String od = sc.nextLine();
		    if(od.equals("push")){
		        System.out.println("Введите название одежды: ");
		        String s_text = sc.nextLine();
		        hash_l.put("Петя", s_text);
		    }
		    else if (od.equals("pop")){
		        System.out.println("Введите название одежды: ");
		        String s_text = sc.nextLine();
		        hash_l.remove("Петя", s_text);
		        System.out.println("Петя забрал " + s_text);
		    }
		}
		System.out.println("Одежда оставшаяся на стуле: " + hash_l.get("Петя"));
	}
}
