*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер списка: ");
		int size_list = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < size_list; i++){
		    if (i == 0 || i == size_list-1){
		        list.add(1);
		    }
		    else{
		        list.add(0);
		    }
		}
		System.out.println("Массив: " + list);
	}
}
