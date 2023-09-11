package PZ.PZ_4.f_r;
import java.util.Scanner;
public class f_r_eight {
    public static void main(String[] args){
        /*
        * Сколько элементов равны максимому?
        * */
        Scanner scss = new Scanner(System.in);
        System.out.println("Введите максимальное число: ");
        int count = 0; int max = scss.nextInt();
        for (boolean flag = true; flag == true;){
            System.out.println("Введите число (0 - stop): ");
            int x = scss.nextInt();
            if (x == 0){
                flag = false;
            }
            if (x == max) count++;
        }
        System.out.println("Количество максимального элемента в последовательности: " + count);
    }
}
