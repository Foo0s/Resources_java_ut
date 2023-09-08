package PZ.PZ_3;
import java.util.Scanner;
public class three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число пирожков, которые несет Красная Шапочка к своей бабушке: ");
        int p = sc.nextInt();
        if (p-10 > p/2) System.out.println("Вариант с Лесничим будет лучше, кол-во оставшихся пирожков: " + (p-10));
        else System.out.println("Вариант с Волком будет лучше, количество оставшихся пирожков: " + (p/2));
    }
}
