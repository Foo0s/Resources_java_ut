package PZ.PZ_5;
import java.util.Scanner;

public class one {
    public static void main(String[] args){
        Scanner s_n = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int number = s_n.nextInt(); int count = 0;
        Integer[] mas_number = new Integer[number];
        for (int x = 0; x < number; x++){
            System.out.println("Введите число: ");
            mas_number[x] = s_n.nextInt();
        }
        for (int i = 0; i < number; i++){
            count += mas_number[i];
        }
        System.out.println("Сумма элементов массива: " + count);
    }
}
