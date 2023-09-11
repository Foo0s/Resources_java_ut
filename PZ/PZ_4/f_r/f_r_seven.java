package PZ.PZ_4.f_r;
import java.util.Scanner;

public class f_r_seven {
    public static void main(String[] args){
        /*
        * Найти счет слова Куб в последовательности от пользователя.
        * */
        Scanner sc = new Scanner(System.in);
        int i = 0; int k = 0;
        for (boolean flag = true; flag == true; i++){
            System.out.println("Введите слово (СТОП - конец): ");
            String s = sc.nextLine();
            if (s.equals("ээээ") || s.equals("нууу")){
                continue;
            }
            else{
                switch (s){
                    case "СТОП": flag = false;
                    case "Куб": k = i;
                }
            }
        }
        System.out.println("Счет по которому было встречено слово КУБ - " + k);
    }
}
