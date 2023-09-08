package PZ.PZ_3;
import java.util.Scanner;
public class two {
    public static void main(String[] args){
        Scanner ns = new Scanner(System.in);
        System.out.println("Введите 2 вещественных числа: ");
        double x = ns.nextDouble();
        double y = ns.nextDouble();
        System.out.println("Частное от чисел = " + x/y);
    }
}
