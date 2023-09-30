import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

//Вывести имена сотрудников какой профессии больше всего, вывести кол-воБ профессию и их имена в том же порядке в котором вводились.
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> list_h = new HashSet();
        System.out.println("Введите кол-во строк: ");
        int numb_string = sc.nextInt();
        for(int i = 0; i < numb_string; i++){
            sc.nextLine();
            System.out.println("Введите строку: ");
            String line = sc.nextLine();
            for(String word: line.split(" ")){
                list_h.add(word.toLowerCase());
            }
        }
        System.out.println(list_h);
        System.out.println("Кол-во уникальных слов: " + list_h.size());
    }
}
