package PZ.PZ_7;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Character;

import static java.lang.Character.*;

public class PZ_7_5 {
    public static void main(String[] args){
        Scanner ns = new Scanner(System.in);
        System.out.println("Количество строк в книге: ");
        int k_book = ns.nextInt();
        ns.nextLine();
        String[] book_r = new String[k_book];
        for(int i=0; i<k_book; i++){
            System.out.println("Введите строку книги: ");
            String text = ns.nextLine();
            book_r[i] = text;
        }
        System.out.println("Введите количество продуктов: ");
        int m_produkt = ns.nextInt();
        ns.nextLine();
        for(int i = 0; i < m_produkt; i++){
            System.out.println("Введите продукт: ");
            String[] array_word = ns.nextLine().split(" - ");
            for(int j = 0; j < book_r.length; j++){
                String[] new_arr = book_r[j].split(" ");
                for(int s = 0; s < new_arr.length; s++){
                    if(new_arr[s].equalsIgnoreCase(array_word[0])){
                        if(isUpperCase(new_arr[s].charAt(0))){
                            String result = array_word[1].replace(array_word[1].charAt(0), toUpperCase(array_word[1].charAt(0)));
                            new_arr[s] = result;
                        }
                        else{
                            new_arr[s] = array_word[1];
                        }
                    };
                };
                String sd = "";
                for(String word: new_arr){
                    sd += word + " ";
                }
                book_r[j] = sd;
            }
        }
        for(int i = 0; i < book_r.length; i++){
            System.out.println(book_r[i]);
        }
    }
}
