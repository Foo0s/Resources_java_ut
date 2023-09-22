package PZ.PZ_7;
import java.util.Arrays;
import java.util.Scanner;
public class PZ_7_5 {
    public static void main(String[] args){
        Scanner ns = new Scanner(System.in);
        System.out.println("Количество строк в книге: ");
        int k_book = ns.nextInt();
        String[] book_r = new String[k_book+1];
        for(int i=0; i<k_book+1; i++){
            System.out.println("Введите строку книги: ");
            String s_name = ns.nextLine();
            book_r[i] = s_name;
        }
        System.out.println("Введите количество продуктов: ");
        int m_produkt = ns.nextInt();
        String[] arr_allerg = new String[m_produkt];
        for(int i = 0; i < m_produkt+1; i++){
            if (i > m_produkt){
                break;
            }
            else{
                System.out.println("Введите продукт: ");
                arr_allerg[i] = Arrays.toString(ns.nextLine().split("-"));
            }
        }
        for(int i = 0; i < m_produkt; i++){
            System.out.println(arr_allerg[i]);
        }
    }
}
