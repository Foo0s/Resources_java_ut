package PZ.PZ_4.f_r;
import java.util.Scanner;

public class f_r_two {
    public static void main(String[] args){
        /*
        * Найти в диапазоне слово Куб.
        * */
        Scanner sc = new Scanner(System.in);
        boolean flag_word = false; boolean fl = false;
        for (boolean flag_word_2 = true; flag_word_2 != fl;){
            System.out.println("Введите слово, СТОП - стоп: ");
            String stroka = sc.nextLine();
            if (stroka.equals("Куб")){
                flag_word = true;
            }
            if (stroka.equals("СТОП")){
                fl = true;
            }
        }
        System.out.println("Слово было найдено (true/false): " + flag_word);
    }
}
