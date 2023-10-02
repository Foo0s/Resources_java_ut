package PZ.PZ_9;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

//Вывести имена сотрудников какой профессии больше всего, вывести кол-воБ профессию и их имена в том же порядке в котором вводились.
public class PZ_9_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> list_h = new HashSet();
        System.out.println("Введите кол-во строк: ");
        int numb_string = sc.nextInt();
        sc.nextLine();
        ArrayList<Character> list = new ArrayList<>(Arrays.asList(',', ':', ';', '?', '!', '.'));
        for(int i = 0; i < numb_string; i++){
            System.out.println("Введите строку: ");
            String line = sc.nextLine();
            for(String word: line.split(" ")){
                if(list.contains(word.charAt(word.length()-1))) list_h.add(word.substring(0, (word.length()-1)).toLowerCase());
                else list_h.add(word.toLowerCase());
                System.out.println(word.charAt(word.length()-1) + " " + list.contains(word.charAt(word.length()-1)));
            }
        }
        System.out.println(list_h);
        System.out.println("Кол-во уникальных слов: " + list_h.size());
    }
}
