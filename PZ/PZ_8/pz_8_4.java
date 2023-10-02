package PZ.PZ_8;
import java.util.Scanner;
import java.util.ArrayList;

public class pz_8_4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер списка: ");
		int size_l = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < size_l; i++){
		    String s = "" + i;
		    list.add(s);
		}
		System.out.println("Введите индекс для удаления: ");
		int del_index = sc.nextInt();
		list.remove(del_index);
		System.out.println("Список: " + list);
	}
}
