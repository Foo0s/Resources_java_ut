package PZ.PZ_10;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PZ_10_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = sc.nextLine();
        sortByLength(line);
    }

    static void sortByLength(String text){
        String massive[] = text.split(" ");
        Arrays.sort(massive);
        System.out.println(String.join(" ", massive));
    }

}
