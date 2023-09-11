package PZ.PZ_4.w_h;
import java.util.Scanner;
public class while_seven {
    public static void main(String[] args){
        /*
        * Найти наименьший делитель введёного числа.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int x = sc.nextInt(); int numb = 2; int z = x;
        while (numb < x){
            if (x % numb == 0){
                if (z >= numb){
                    z = numb;
                }
            }
            numb++;
        }
        System.out.println("Наименьшей делитель числа " + x + " является число " + z);
    }
}
