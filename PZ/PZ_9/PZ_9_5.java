package PZ.PZ_9;
import java.util.*;

public class PZ_9_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество детей: ");
        int numb_children = sc.nextInt(); sc.nextLine();
        LinkedHashMap<String, ArrayList> hs = new LinkedHashMap<>();
        for(int j = 0; j < numb_children; j++){
            LinkedHashSet<String> lists_words = new LinkedHashSet<>();
            ArrayList<String> list_words = new ArrayList<>();
            System.out.println("Имя: слова");
            String line = sc.nextLine();
            String massive[] = line.split(" ");
            for(int i = 1; i < massive.length; i++){
                lists_words.add(massive[i].toLowerCase());
            }
            list_words.addAll(lists_words);
            hs.put(massive[0].substring(0, massive[0].length()-1), list_words);
        }
        System.out.println("Введите размер слова: "); int size = 0; String name_children = "";
        int size_of_word = sc.nextInt(); sc.nextLine();
        for(String key: hs.keySet()){
            int size_word = 0;
            for(Object word: hs.get(key)){
                if(word.toString().length() >= size_of_word) size_word++;
            }
            if(size <= size_word){
                size = size_word;
                name_children = key;
            }
        }
        System.out.println("Больше всего слов знает: " + name_children + " \nКоличество слов: " + size);
    }
}
