package PZ.PZ_4.f_r;
import java.util.Scanner;

public class f_r_six {
    public static void main(String[] args){
        /*
        * Введеное число вывести в обратном порядке.
        * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); String strr = ""; int x_copy = x;
        for (int y = 0; y < x; x /= 2){
            strr += x % 2;
        }
        System.out.println("Число " + x_copy + " в двоичной системе - " + strr);
    }
}
