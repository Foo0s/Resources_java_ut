package PZ.PZ_7;
import java.util.Scanner;

public class PZ_7_2 {
    public static void main(String[] args){
        /*
            Дана строка, в которой через пробел перечислены цифры.
            На следующей строке вводится цифра. Определите индексы
            первого и последнего её вхождения.
        */

        Scanner ns = new Scanner(System.in);
        System.out.println("Вводите цифры через пробел: ");
        String text = ns.nextLine(); System.out.println("Введите число, для поиска индекса: ");
        char numb = ns.nextLine().charAt(0);
        System.out.println("Индекс первого вхождения числа: " + text.indexOf(numb) + "\nИндекс второго вхождения числа: " + text.lastIndexOf(numb));
    }
}
