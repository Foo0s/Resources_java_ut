package PZ.PZ_4.f_r;
import java.util.Scanner;
public class f_r_five {
    public static void main(String[] args){
        /*
        * Найти произведение ненулевых значений, пока юзер не введет СТОП
        */
        Scanner sc = new Scanner(System.in);
        int a = 1;
        for (boolean flag_2 = true; flag_2 == true;){
            System.out.print("Введите число: ");
            int x = sc.nextInt();
            if (x != 0){
                a *= x;
            }
            sc.nextLine();
            System.out.print("Введите СТОП, чтобы закончить итерацию: ");
            String s = sc.nextLine();
            if (s.equals("СТОП")){
                flag_2 = false;
            }
        }
        if (a > 0){
            System.out.println("Произведение ненулевых чисел: " + a);
        }
        else{
            System.out.println("None");
        }
    }
}
