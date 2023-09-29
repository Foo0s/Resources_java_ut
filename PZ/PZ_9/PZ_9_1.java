import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    HashSet<String> words = new HashSet<>();
	    ArrayList<String> words_array = new ArrayList<>();
		System.out.println("Введите число: ");
		int number = sc.nextInt(); sc.nextLine();
		for(int i = 0; i < number; i++){
		    System.out.println("Введите слово: ");
		    String word = sc.nextLine();
		    words.add(word);
		    words_array.add(word);
		}
		
		System.out.println("Слово которое встречается чаще всего: ");
		int count_word = 0; int count_word_two = 0; String word_answer = "";
		for(String word: words){
		    count_word = 0;
		    for(String word_two: words_array){
		        if(word.equals(word_two)) count_word++;
		    }
		    if (count_word > count_word_two){
		        count_word_two = count_word;
		        word_answer = word;
		    }
		}
		System.out.println(word_answer);
	}
}
