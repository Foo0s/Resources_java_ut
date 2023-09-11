package PZ.PZ_4.w_h;
import java.util.Scanner;
public class while_ten {
    public static void main(String[] args){
        /*
        * Вычислите второй максимум последовательности.
        * */
        Scanner sc = new Scanner(System.in);
        int max_one = 0; int max_to = 0;
        while (true){
            System.out.println("Введите число: ");
            int xx = sc.nextInt();
            if (xx == 0){
                break;
            }
            if (xx >= max_one){
                max_one = xx;
            }
            if (xx < max_one){
                if (max_to >= xx) continue;
                else max_to = xx;
            }
        }
        System.out.println("Первое макс. число: " + max_one + "\nВторое макс. число: " + max_to);
    }
}
