package PZ.PZ_7;
import java.util.Scanner;
public class PZ_7_3 {
    public static void main(String[] args){

        /*
            Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова,
            которые начинаются на её любимую букву и заканчиваются на любимую букву её
            друга Олега. Олег же наоборот - слова, которые начинаются на его любимую
            букву и заканчиваются на любимую букву Маши. Обратите внимание, что буквы
            могут быть в разных регистрах (большие/маленькие).  Определите, сколько слов
            выписали дети. На первой строке вводится любимая буква Маши, на второй - Олега.
            Затем вводится строка, в которой перечислены слова, которые написаны в газете.
        */

        Scanner ns = new Scanner(System.in);
        System.out.println("Любимая буква Маши: ");
        String word_masha = ns.nextLine();
        System.out.println("Любимая буква Олега: ");
        String word_oleg = ns.nextLine();
        System.out.println("Введите строку: ");
        String text = ns.nextLine();
        String[] arr = text.split(" ");
        int score = 0; int score_2 = 0;
        for(String w: arr){
            if ((w.startsWith(word_masha) && w.endsWith(word_oleg))) score++;
            if ((w.startsWith(word_oleg) && w.endsWith(word_masha))) score_2++;
        }
        System.out.println("Количество слов по требованиям Маши: " + score);
        System.out.println("Количество слов по требованиям Олега: " + score_2);
    }
}
