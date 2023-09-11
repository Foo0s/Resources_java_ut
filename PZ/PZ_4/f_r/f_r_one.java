package PZ.PZ_4.f_r;
import java.util.Scanner;
public class f_r_one {
    public static void main(String[] args){
        /*
        * Сумма чисел в диапазоне от а до б.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int answer = 0; int x = sc.nextInt(); int y = sc.nextInt();
        for (int z = x; z <= y; z++){
            answer += z;
        }
        System.out.println("Сумма всех чисел равна: " + answer);
    }
}
