package PZ.PZ_11;
import java.util.Scanner;
import java.util.HashMap;

public class PZ_11_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Факториал числа: ");
        int f_number = sc.nextInt();
        System.out.println("Факториал числа = " + fact(f_number));
    }

    static int fact(int f_numb){
        if (f_numb == 0) return 1;
        if(f_numb < 0) {
            System.out.println("Число должно быть неотрицательным!");
            return 0;
        }
        return fact(f_numb-1)*f_numb;
    }
}
