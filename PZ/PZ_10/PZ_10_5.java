package PZ.PZ_10;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class PZ_10_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int numb_line = sc.nextInt(); sc.nextLine();
        int min = 0; int max = 0;
        ArrayList<String> list_ar = new ArrayList<>();
        for(int j = 0; j < numb_line; j++){
            System.out.println("Ваша строка: ");
            String line_text = sc.nextLine();
            list_ar.add(Arrays.toString(line_text.split(" ")));
        }
        maximin(list_ar);
    }

    static void maximin(ArrayList<String> list){
        int max_n = Integer.MAX_VALUE;
        int min_n = Integer.MIN_VALUE;
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            int max = max_n;
            for(int numb = 0; numb < list.get(i).length(); numb++){
                try{
                    int number = Integer.parseInt(String.valueOf(list.get(i).charAt(numb)));
                    if(number < max) max = number;
                } catch (NumberFormatException e){
                    continue;
                }
            }
            lst.add(max);
        }
        for(int max_nn = 0; max_nn < lst.size(); max_nn++) {
            if(lst.get(max_nn) >= min_n) min_n = lst.get(max_nn);
        }
        System.out.println("Max = " + min_n);
    }
}
