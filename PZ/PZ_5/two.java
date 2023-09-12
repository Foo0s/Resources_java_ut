package PZ.PZ_5;
import java.util.Scanner;
public class two {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int numb = s.nextInt(); int count = 0;

        Integer[] numbers = new Integer[numb];
        for (int i = 0; i < numb; i++){
            System.out.println("Введите число: ");
            numbers[i] = s.nextInt();
        }
        for (int x = 0; x < numb; x++){
            if (x%2 == 0) {count += numbers[x];};
        }
        System.out.println("Сумма элементов с четными индексами: " + count);
    }
}
